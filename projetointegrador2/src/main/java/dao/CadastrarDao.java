package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

// Para executar upDates
public class CadastrarDao {

    // Criando conexão com o banco de dados
    public static String url = "jdbc:mysql://localhost:3306/filira_essence" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login = "root";
    public static String senha = "";
    
    // Criar objeto de conexão
    Connection conexao = null;
    
    
    //==========================================================================
            // Funções para salvar informações no banco de dados
    
    public static boolean salvarCliente(String nome, int CPF, int contato, String email, String endereco,int cep) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,CPF,contato,email,CEP,endereco) "
                                                              + "VALUES (?,?,?,?,?,?)");
        comandoSQL.setString(1, nome);
        comandoSQL.setInt(2, CPF);
        comandoSQL.setInt(3, contato);
        comandoSQL.setString(4, email);
        comandoSQL.setString(6,endereco);
        comandoSQL.setInt(5, cep);
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível inserir o cliente");
        }
        
            
        }catch(ClassNotFoundException ex){
        System.out.println("Erro:" + ex.getMessage());
        retorno = false;
            
        }catch(Exception ex){
        System.out.println("Erro:" + ex.getMessage());
        retorno = false;
        }
        return retorno;
        }
    
                
                
}

