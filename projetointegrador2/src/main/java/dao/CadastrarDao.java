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
    
    public static boolean salvarCliente(String nome, String CPF, String contato, String email, String endereco,String cep) throws Exception{
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
        comandoSQL.setString(2, CPF);
        comandoSQL.setString(3, contato);
        comandoSQL.setString(4, email);
        comandoSQL.setString(6,endereco);
        comandoSQL.setString(5, cep);
           
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
    
    public static boolean salvarProduto(int codigo, String descricao,float valorUni) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (cod,descricao,valorUnitario) "
                                                              + "VALUES (?,?,?,)");
        comandoSQL.setInt(1, codigo);
        comandoSQL.setString(2, descricao);
        comandoSQL.setFloat(3, valorUni);
        
           
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

