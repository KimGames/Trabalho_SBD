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
public class Agencia {

    private String nome;
    private String cidade;
    private String estado;

    public void setNome(String name){
        nome = name;
    }

    public void setCidade(String city){
        cidade = city;
    }

    public void setEstado(String state){
        estado = state;
    }

    public String getNome(){
      return nome;
    }

    public String getCidade(){
      return cidade;
    }

    public String getEstado(){
      return estado;
    }
}
