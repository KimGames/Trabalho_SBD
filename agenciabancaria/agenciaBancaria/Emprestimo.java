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
public class Emprestimo {

    private int num_empr;
    private int qtd_parcelas;
    private double valor;

    public void setNum_Empr(int num){
        num_empr = num;
    }

    public void setQtd_Parcelas(int qtd){
        qtd_parcelas = qtd;
    }

    public void setValor(double value){
        valor = value;
    }

    public int getNum_Empr(){
      return num_empr;
    }

    public int getQtd_Parcelas(){
      return qtd_parcelas;
    }

    public double getValor(){
      return valor;
    }
}
