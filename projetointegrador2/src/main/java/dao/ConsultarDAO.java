package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Para realizar consultas
public class ConsultarDAO {

    // Criando conexão com o banco de dados
    public static String url = "jdbc:mysql://localhost:3306/Filira_essence" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login = "root";
    public static String senha = "";

// Criar objeto de conexão
    Connection conexao = null;

    //==========================================================================
    // Funções para puxar informações no banco de dados
    public void consultaCliente() {

      
        

        
    }
}
