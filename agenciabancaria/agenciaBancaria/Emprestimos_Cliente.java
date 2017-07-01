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
public class Emprestimos_Cliente {

    private int num_empr;
    private String cpf_cliente;

    public void setNum_Empr(int num){
        num_empr = num;
    }

    public void setCpf_Cliente(String qtd){
        cpf_cliente = qtd;
    }

    public int getNum_Empr(){
      return num_empr;
    }

    public int getCpf_Cliente(){
      return cpf_cliente;
    }
}
