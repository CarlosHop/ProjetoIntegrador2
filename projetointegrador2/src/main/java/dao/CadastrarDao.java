package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import methods.Cliente;
import methods.Fornecedor;
import methods.Funcionario;
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
        finally{
            conexao.close();
        }
        
        return retorno;
        }
    
    /**
  *  
  * @authot Brendo.Rotta
  * @param novoProduto - Objeto da classe Produto
  * @return boolean - true: Produto cadastrado, false: Falha no cadastro
  */
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
        finally{
            conexao.close();
        }
        return retorno;
        }
    
    /**
  *  
  * @authot Brendo.Rotta
  * @param novoFuncionario - Objeto da classe Funcionario
  * @return boolean - true: Funcionario cadastrado, false: Falha no cadastro
  */
    public static boolean salvarFuncionario(Funcionario novoFuncionario) throws Exception{
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
        comandoSQL.setString(1, novoFuncionario.getNome());
        comandoSQL.setString(2, novoFuncionario.getEndereco());
        comandoSQL.setString(3, novoFuncionario.getLogin());
        comandoSQL.setString(4,novoFuncionario.getSenha());
        comandoSQL.setString(5, novoFuncionario.getTelefone());
        
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível inserir o Funcionario");
        }
        
            
        }catch(ClassNotFoundException ex){
        System.out.println("Erro:" + ex.getMessage());
        retorno = false;
            
        }catch(Exception ex){
        System.out.println("Erro:" + ex.getMessage());
        retorno = false;
        }
        finally{
            conexao.close();
        }
        
        return retorno;
        }
    
    public static boolean salvarFornecedor(Fornecedor novoFornecedor) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Funcionario (Cnpj, RazaoSocial, fk_produto_cod) "
                                                              + "VALUES (?,?, ?)");
        comandoSQL.setString(1, novoFornecedor.getCnpj());
        comandoSQL.setString(2, novoFornecedor.getRazaoSocial());
        comandoSQL.setString(3, novoFornecedor.getProdutoCod());
        
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível inserir o Fornecedor");
        }
        
            
        }catch(ClassNotFoundException ex){
        System.out.println("Erro:" + ex.getMessage());
        retorno = false;
            
        }catch(Exception ex){
        System.out.println("Erro:" + ex.getMessage());
        retorno = false;
        }
        
        finally{
            conexao.close();
        }
        
        return retorno;
        }
    
}// Chave classe dao

