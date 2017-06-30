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
public class Funcionario {

    private int num_funcional;
    private String nome;
    private String telefone;
    private String data_admissao;
    private String nome_agencia;
    private int num_supervisor;

    public void setNum_Funcional(int num){
        num_Funcional = num;
    }

    public void setNome(String name){
        nome = name;
    }

    public void setTelefone(String tel){
        telefone = tel;
    }

    public void setData_Admissao(String date){
        data_admissao = date;
    }

    public void setNome_Agencia(String name_age){
        nome_agencia = name_age;
    }

    public void setNum_Supervisor(int numS){
        num_supervisor = numS;
    }

    public int getNum_Funcional(){
      return num_funcional;
    }

    public String getNome(){
      return nome;
    }

    public String getTelefone(){
      return telefone;
    }

    public String getData_Admissao(){
      return data_admissao;
    }

    public String getNome_Agencia(){
      return nome_agencia;
    }

    public int getNum_Supervisor(){
      return num_supervisor;
    }
}
