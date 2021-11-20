package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import methods.Cliente;
import methods.Produto;

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
    
  /**
  *  
  * @authot Brendo.Rotta
  * @param novoCliente - Objeto da classe cliente
  * @return boolean - true: Cliente cadastrado, false: Falha no cadastro
  */
    public static boolean salvarCliente(Cliente novoCliente) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Cliente (NomeCliente,CpfCliente,Contato,email,CepCliente,Endereco) "
                                                              + "VALUES (?,?,?,?,?,?)");
        comandoSQL.setString(1, novoCliente.getNomeCliente());
        comandoSQL.setString(2, novoCliente.getCpfCliente());
        comandoSQL.setString(3, novoCliente.getContato());
        comandoSQL.setString(4, novoCliente.getEmail());
        comandoSQL.setString(5,novoCliente.getCep());
        comandoSQL.setString(6, novoCliente.getEnderecoCliente());
           
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
    
    public static boolean salvarProduto(Produto novoProduto) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produtos (CodigoProduto,Descricao, Marca,valorUni) "
                                                              + "VALUES (?,?,?,?)");
        comandoSQL.setString(1, novoProduto.getCodigo());
        comandoSQL.setString(2, novoProduto.getNomeProduto());
        comandoSQL.setString(3, novoProduto.getMarcaProduto());
        comandoSQL.setDouble(4,novoProduto.getPrecoProduto());
        
           
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
    
    public static boolean salvarFuncionario(String Nome,String endereco, String login,String Senha, String contato) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Funcionario (NomeFuncionario, EnderecoFuncionario,login,senha,contatoFuncionario) "
                                                              + "VALUES (?,?,?,?,?)");
        comandoSQL.setString(1, Nome);
        comandoSQL.setString(2, endereco);
        comandoSQL.setString(3, login);
        comandoSQL.setString(4,Senha);
        comandoSQL.setString(5, contato);
        
           
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
    
}// Chave classe dao

