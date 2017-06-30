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
public class Conta_Corrente {

    private int id_conta;
    private String nome_agencia;
    private String data_criacao;
    private float saldo;
    private String ultimo_acesso;
    private float tarifa_mensal;

    public void setId_Conta(int id){
        id_conta = id;
    }

    public void setNome_Agencia(String nameA){
        nome_agencia = nameA;
    }

    public void setData_Criacao(String dateC){
        data_criacao = dateC;
    }

    public void setSaldo(float sal){
        saldo = sal;
    }

    public void setUltimo_Acesso(String ultimo){
        ultimo_acesso = ultimo;
    }

    public void setTarifa_Mensal(float tal){
        tarifa_mensal = tal;
    }

    public int getId_Conta(){
      return id_conta;
    }

    public String getNome_Agencia(){
      return nome_agencia;
    }

    public String getData_Criacao(){
      return data_criacao;
    }

    public float getSaldo(){
      return saldo;
    }

    public String getUltimo_Acesso(){
      return ultimo_acesso;
    }

    public float getTarifa_Mensal(){
      return tarifa_mensal;
    }
}
