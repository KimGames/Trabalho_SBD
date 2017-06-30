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
public class Cliente {

    private String cpf;
    private int num_gerente;
    private String nome;
    private String data_nasc;
    private String cidade;
    private String estado;
    private String endereco;

    public void setCpf(String cp){
        cpf = cp;
    }

    public void setNum_Gerente(int numG){
        num_gerente = numG;
    }

    public void setNome(String name){
        nome = name;
    }

    public void setData_Nasc(String dateN){
        data_nasc = dateN;
    }

    public void setCidade(String city){
        cidade = city;
    }

    public void setEstado(String state){
        estado = state;
    }

    public void setEndereco(String end){
      endereco = end;
    }

    public String getCpf(){
      return cpf;
    }

    public int getNum_Gerente(){
      return num_gerente;
    }

    public String getNome(){
      return nome;
    }

    public String getData_Nasc(){
      return data_nasc;
    }

    public String getCidade(){
      return cidade;
    }

    public String getEstado(){
      return estado;
    }

    public String getEndereco(){
      return endereco;
    }
}
