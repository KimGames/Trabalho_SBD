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
public class Contas_Poupanca_Cliente {

    private String cpf_cliente;
    private String nome_agencia;
    private int id_conta;

    public void setCpf_Cliente(String qtd){
        cpf_cliente = qtd;
    }

    public void setNome_Agencia(String nameA){
        nome_agencia = nameA;
    }

    public void setId_Conta(int idC){
        id_conta = idC;
    }

    public String getCpf_Cliente(){
      return cpf_cliente;
    }

    public int getNome_Agencia(){
      return nome_agencia;
    }

    public int getId_Conta(){
      return id_conta;
    }
}
