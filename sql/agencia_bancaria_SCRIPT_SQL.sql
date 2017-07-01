-----------------------------------------------
-- Criando o esquema banco
-----------------------------------------------
DROP SCHEMA IF EXISTS banco_financeiro CASCADE;
CREATE SCHEMA banco_financeiro;
SET search_path TO banco_financeiro;

CREATE SEQUENCE seq_empr START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_num_funcional START WITH 10 INCREMENT BY 10;
CREATE SEQUENCE seq_id_contaC START WITH 2 INCREMENT BY 2;
CREATE SEQUENCE seq_id_contaP START WITH 1 INCREMENT BY 2;
CREATE SEQUENCE seq_id_op START WITH 100 INCREMENT BY 100;
CREATE SEQUENCE seq_numero START WITH 1001 INCREMENT BY 1;

-- -----------------------------------------------------
-- Tabela AGENCIA
-- -----------------------------------------------------
CREATE TABLE agencia (
  nome		  VARCHAR(100),
  cidade    VARCHAR(100) NOT NULL,
  estado 	  CHAR(2) NOT NULL,
  -- restrições
  CONSTRAINT pk_agencia PRIMARY KEY (nome)
);


-- -----------------------------------------------------
-- Tabela EMPRESTIMO
-- -----------------------------------------------------
CREATE TABLE emprestimo (
  num_empr	    INT,
  qtd_parcelas	INT NOT NULL,
  valor		      REAL,
  nome_agencia VARCHAR(100) NOT NULL,
  -- restrições
  CONSTRAINT pk_emprestimo PRIMARY KEY (num_empr),
  CONSTRAINT fk_nome_agencia FOREIGN KEY (nome_agencia) REFERENCES agencia (nome) ON DELETE CASCADE ON UPDATE CASCADE
);


-- -----------------------------------------------------
-- Tabela FUNCIONARIO
-- -----------------------------------------------------
CREATE TABLE funcionario (
  num_funcional	 INT,
  nome	         VARCHAR(100)	NOT NULL,
  telefone       VARCHAR(20),
  data_admissao  TIMESTAMP NOT NULL,
  nome_agencia   VARCHAR(100) NOT NULL UNIQUE,
  num_supervisor INT NOT NULL,
  -- restrições
  CONSTRAINT pk_funcionario PRIMARY KEY (num_funcional),
  CONSTRAINT fk_nome_agencia FOREIGN KEY (nome_agencia) REFERENCES agencia (nome) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_num_supervisor FOREIGN KEY (num_supervisor) REFERENCES funcionario (num_funcional) ON DELETE NO ACTION ON UPDATE CASCADE
);

-- -----------------------------------------------------
-- Tabela CLIENTE
-- -----------------------------------------------------
CREATE TABLE cliente (
  cpf	      CHAR(11),
  nome	      VARCHAR(100)  NOT NULL,
  data_nasc   DATE,
  cidade      VARCHAR(100) NOT NULL,
  estado      CHAR(2) NOT NULL,
  endereco    VARCHAR(100) NOT NULL,
  num_gerente INT NOT NULL,
 
  -- restrições
  CONSTRAINT pk_cliente PRIMARY KEY (cpf),
  CONSTRAINT fk_num_gerente FOREIGN KEY (num_gerente) REFERENCES funcionario (num_funcional) ON DELETE NO ACTION ON UPDATE CASCADE
);

-- -----------------------------------------------------
-- Tabela CONTA_CORRENTE
-- -----------------------------------------------------
CREATE TABLE conta_corrente(
  id_conta      INT,
  nome_agencia  VARCHAR(100) NOT NULL,
  data_criacao  TIMESTAMP NOT NULL,
  saldo         REAL NOT NULL,
  ultimo_acesso TIMESTAMP UNIQUE,
  tarifa_mensal REAL NOT NULL,
  --restrições
  CONSTRAINT pk_conta_corrente PRIMARY KEY (id_conta, nome_agencia),
  CONSTRAINT fk_nome_agenciaC FOREIGN KEY (nome_agencia) REFERENCES agencia (nome) ON DELETE CASCADE ON UPDATE CASCADE
);

-- -----------------------------------------------------
-- Tabela CONTA_POUPANCA
-- -----------------------------------------------------
CREATE TABLE conta_poupanca(
  id_conta      INT,
  nome_agencia  VARCHAR(100) NOT NULL,
  data_criacao  TIMESTAMP NOT NULL,
  saldo         REAL NOT NULL,
  ultimo_acesso TIMESTAMP UNIQUE,
  taxa_juros    REAL NOT NULL,
  --restrições
  CONSTRAINT pk_conta_poupanca PRIMARY KEY (id_conta, nome_agencia),
  CONSTRAINT fk_nome_agenciaP FOREIGN KEY (nome_agencia) REFERENCES agencia (nome) ON DELETE CASCADE ON UPDATE CASCADE
);

-- -----------------------------------------------------
-- Tabela CONTA_CORRENTE_CLIENTE
-- -----------------------------------------------------
CREATE TABLE conta_corrente_cliente(
  cpf_cliente   CHAR(11),
  nome_agencia  VARCHAR(100),
  id_conta      INT,
  --restrições
  CONSTRAINT pk_conta_corrente_cliente PRIMARY KEY (cpf_cliente, nome_agencia, id_conta),
  CONSTRAINT fk_cp_cliente FOREIGN KEY (cpf_cliente) REFERENCES cliente (cpf) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT fk_nome_agenciaCC FOREIGN KEY (nome_agencia, id_conta) REFERENCES conta_corrente (nome_agencia, id_conta) ON DELETE CASCADE ON UPDATE NO ACTION 
);

-- -----------------------------------------------------
-- Tabela CONTA_POUPANCA_CLIENTE
-- -----------------------------------------------------
CREATE TABLE conta_poupanca_cliente(
  cpf_cliente   CHAR(11),
  nome_agencia  VARCHAR(100) NOT NULL,
  id_conta      INT NOT NULL,
  --restrições
  CONSTRAINT pk_conta_poupanca_cliente PRIMARY KEY (cpf_cliente, nome_agencia, id_conta),
  CONSTRAINT fk_cp_cliente FOREIGN KEY (cpf_cliente) REFERENCES cliente (cpf) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT fk_nome_agenciaPC FOREIGN KEY (nome_agencia, id_conta) REFERENCES conta_poupanca (nome_agencia, id_conta) ON DELETE CASCADE ON UPDATE NO ACTION 
);

-- -----------------------------------------------------
-- Tabela OPERACAO_BANCARIA
-- -----------------------------------------------------
CREATE TABLE operacao_bancaria(
  id_op        INT,
  id_conta     INT NOT NULL,
  nome_agencia VARCHAR(100) NOT NULL,
  --restrições
  CONSTRAINT pk_operacao_bancaria PRIMARY KEY (id_op, id_conta, nome_agencia),
  CONSTRAINT fk_id_contaOP FOREIGN KEY (id_conta, nome_agencia) REFERENCES conta_corrente (id_conta, nome_agencia) ON DELETE NO ACTION ON UPDATE NO ACTION
);

-- -----------------------------------------------------
-- Tabela CUPOM
-- -----------------------------------------------------
CREATE TABLE cupom(
  numero       INT,
  validade     DATE NOT NULL,
  operacao     VARCHAR(100),
  id_conta     INT NOT NULL,
  id_op        INT NOT NULL,
  nome_agencia VARCHAR(100) NOT NULL,
  --restrições
  CONSTRAINT pk_cupom PRIMARY KEY (numero),
  CONSTRAINT fk_id_contaCU FOREIGN KEY (id_conta, id_op, nome_agencia) REFERENCES operacao_bancaria (id_conta, id_op, nome_agencia) ON DELETE NO ACTION ON UPDATE NO ACTION
);



-----------------------------------------------------
-- POVOAMENTO
-----------------------------------------------------

