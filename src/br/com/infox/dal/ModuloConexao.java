
package br.com.infox.dal;
import java.sql.*;
/**
 *
 * @author JD_MAIN
 */
public class ModuloConexao {
    
    // responsavel por estabelecer a conexão com o banco
    public static Connection conector(){
        
        Connection conexao = null;
        // chama o driver mysql-Connector inportado de bibliotecas
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando infoemações referentes ao banco
        //String url = "jdbc:mysql://localhost:3306/dbinfox";
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        //String user = "root";
        String user = "dba";
        //String password = "3016127710";
        String password = "infox@123456";
        // estabelecento a conexão com o banco
        try{
            
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        }catch(Exception e){
            
            return null;
        }
    } 
}
