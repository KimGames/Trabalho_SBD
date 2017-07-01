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
public class Operacao_Bancaria {

    private int id_operacao;
    private int id_conta;
    private String nome_agencia;
    private float valor;
    private String tipo;
    private String descricao;
    private String data;

    public void setId_Operacao(int idO){
        id_operacao = idO;
    }

    public void setId_Conta(int id){
        id_conta = id;
    }

    public void setNome_Agencia(String nameA){
        nome_agencia = nameA;
    }

    public void setValor(float value){
        valor = value;
    }

    public void setTipo(String type){
        tipo = type;
    }

    public void setDescricao(String desc){
        descricao = desc;
    }

    public void setData(String dateC){
        data = dateC;
    }

    public int getId_Operacao(){
      return id_operacao;
    }

    public int getId_Conta(){
      return id_conta;
    }

    public String getNome_Agencia(){
      return nome_agencia;
    }

    public float getValor(){
      return valor;
    }

    public String getTipo(){
      return tipo;
    }

    public String getDescricao(){
      return descricao;
    }

    public String getData(){
      return data;
    }
}
