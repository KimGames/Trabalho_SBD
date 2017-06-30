package agenciabancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexaobanco {
    
    Connection conexao;//gerencia conexao
    Statement sentenca;
    
    Conexaobanco(){
    System.out.println(">Checando conexao com o banco");
    try{// carregar a classe de driver do sbgd
    Class.forName("org.postgresql.Driver"); }
    catch(ClassNotFoundException cnfe){
    System.out.println(">Nao foi possivel achar o driver!");
    cnfe.printStackTrace();
    System.exit(1);
    
    }
    System.out.println(">O registro do driver está ok!");
    

    try{
    //Estabelece conexao com o banco de dados
    System.out.println(">Conectando com o servidor: ");
    String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=conectax";
    conexao = DriverManager.getConnection(url);
    System.out.println(">Conectado!");
    //cria uma sentenca para consultar o banco de dados
    sentenca = conexao.createStatement();
    }catch(SQLException se){
    System.out.println(">Nao foi possivel conectar ao banco de dados.");
    se.printStackTrace();
    }
    
   }
    
}