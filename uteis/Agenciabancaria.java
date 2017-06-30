package agenciabancaria;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;

public class Agenciabancaria {

    public static void main(String[] args) 
    {
       try { 
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } 
    catch(Exception e){ 
    System.out.println(">ERRO! LOOK AND FEEL");
    }
    Conexaobanco conexao = new Conexaobanco();
    Statement sentenca = conexao.sentenca;
    try{
    sentenca.execute("SET search_path TO banco_financeiro");
    
    //consulta
    ResultSet resposta = sentenca.executeQuery("SELECT 2");
    ResultSetMetaData metaDados = resposta.getMetaData();
    int nroColunas = metaDados.getColumnCount();
    //imprime as colunas 
    for(int i = 1; i <= nroColunas;i++){
    System.out.printf("%s\t",metaDados.getColumnName(i));
    System.out.println();
    }
    //imprime as tuplas
    while(resposta.next()){
    for(int i = 1; i <= nroColunas;i++){
    System.out.printf("%s\t",resposta.getObject(i));
    System.out.println();
    }  
    }   
    }
    catch(SQLException se){
        System.out.println(">Nao foi possivel realizar a consulta");
        se.printStackTrace();
        System.exit(1);
    }
    
    Agenciabancariaui ui = new Agenciabancariaui();
    
    ui.setVisible(true);
    
    
    }

}
    