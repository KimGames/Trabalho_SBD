/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciabancaria.agenciaBancaria;

/**
 *
 * @author Kim
 */
public class Cupom {

    private int numero;
    private int id_conta;
    private int id_operacao;
    private String validade;
    private String nome_agencia;
    private String operacao;

    public void setNumero(int number){
        numero = number;
    }

    public void setId_Conta(int id){
        id_conta = id;
    }

    public void setId_Operacao(int idO){
        id_operacao = idO;
    }

    public void setValidade(String val){
        validade = val;
    }

    public void setNome_Agencia(String nameA){
        nome_agencia = nameA;
    }

    public void setOperacao(String op){
        operacao = op;
    }

    public int getNumero(){
      return numero;
    }

    public int getId_Conta(){
      return id_conta;
    }

    public int getId_Operacao(){
      return id_operacao;
    }

    public String getValidade(){
      return validade;
    }

    public String getNome_Agencia(){
      return nome_agencia;
    }

    public String getOperacao(){
      return operacao;
    }
}
