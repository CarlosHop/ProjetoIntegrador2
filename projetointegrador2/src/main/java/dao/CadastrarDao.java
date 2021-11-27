package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import methods.Cliente;
import methods.Funcionario;
import methods.Produto;

// Para executar upDates
public class CadastrarDao {

    // Criando conexão com o banco de dados
    public static String url = "jdbc:mysql://localhost:3306/perfumaria" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login = "root";
    public static String senha = "";
    
    
    
    
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
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,cpf,contato,email,cep,endereco) "
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
    public static boolean ExcluirCliente(int ID) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE id = ? ");
        comandoSQL.setInt(1,ID);
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível Excluir o cliente");
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
    public static boolean editarCliente(Cliente novoCliente) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE cliente SET "
                                                              + "nome = ?, cpf =?, contato = ?, email = ?, "
                                                              + "cep = ?, endereco = ? WHERE id = ? "
                                                              );

        comandoSQL.setString(1, novoCliente.getNomeCliente());
        comandoSQL.setString(2, novoCliente.getCpfCliente());
        comandoSQL.setString(3, novoCliente.getContato());
        comandoSQL.setString(4, novoCliente.getEmail());
        comandoSQL.setString(5,novoCliente.getCep());
        comandoSQL.setString(6, novoCliente.getEnderecoCliente());
        comandoSQL.setInt(7, novoCliente.getIdcliente());
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível editar o cliente");
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
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (descricao, marca,valoruni, estoque) "
                                                              + "VALUES (?,?,?,?)");
        
        comandoSQL.setString(1, novoProduto.getNomeProduto());
        comandoSQL.setString(2, novoProduto.getMarcaProduto());
        comandoSQL.setDouble(3,novoProduto.getPrecoProduto());
        comandoSQL.setInt(4,novoProduto.getEstoque());
        
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível inserir o Produto");
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
    public static boolean ExcluirProduto(int ID) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM produto WHERE id = ? ");
        comandoSQL.setInt(1,ID);
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível Deletar o Produto");
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
    public static boolean editarProduto(Produto novoProduto) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE clientes SET "
                                                              + "marca = ?, descricao =?, valoruni = ? WHERE id = ? "
                                                              );

        comandoSQL.setString(1, novoProduto.getMarcaProduto());
        comandoSQL.setString(2, novoProduto.getNomeProduto());
        comandoSQL.setDouble(3, novoProduto.getPrecoProduto());
        comandoSQL.setInt(4, novoProduto.getCodigo());
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível editar o cliente");
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
        PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Funcionario (Nome, Endereco,contato) "
                                                              + "VALUES (?,?,?)");
        comandoSQL.setString(1, novoFuncionario.getNome());
        comandoSQL.setString(2, novoFuncionario.getEndereco());
        comandoSQL.setString(3, novoFuncionario.getTelefone());
        
           
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
    public static boolean ExcluirFuncionario(int ID) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM funcionario WHERE id = ? ");
        comandoSQL.setInt(1,ID);
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível Deletar o Funcionario");
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
    public static boolean editarFuncionario(Funcionario novoFuncionario) throws Exception{
        boolean retorno = false;
        Connection conexao = null;
        
        try{
        // Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
            // Usando PreparedStatement
        PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE funcionario SET "
                                                              + "nome = ?, endereco = ?, contato = ?, cpf =? WHERE id = ? "
                                                              );

        comandoSQL.setString(1, novoFuncionario.getNome());
        comandoSQL.setString(2, novoFuncionario.getEndereco());
        comandoSQL.setString(3, novoFuncionario.getTelefone());
        comandoSQL.setInt(5, novoFuncionario.getId());
           
        // Tentativa de inserção de dados
        int linhaAfetada=comandoSQL.executeUpdate();
        
        if (linhaAfetada > 0) {
        retorno = true;
        }else{
        retorno = false;
        throw new Exception("Não foi possível editar o cliente");
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

