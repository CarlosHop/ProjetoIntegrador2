package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import methods.Cliente;
import methods.Produto;
import methods.Funcionario;

// Para realizar consultas
public class ConsultarDAO {

    // Criando conexão com o banco de dados
    public static String url = "jdbc:mysql://localhost:3306/perfumaria" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login = "root";
    public static String senha = "";



    //==========================================================================
    // Funções para puxar informações no banco de dados
    public static ArrayList<Cliente> consultarCliente() throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente");
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Cliente umCliente = new Cliente();
        umCliente.setIdcliente(rs.getInt("id"));
        umCliente.setNomeCliente(rs.getString("nome"));
        umCliente.setCpfCliente(rs.getString("cpf"));
        umCliente.setCep(rs.getString("cep"));
        umCliente.setContato(rs.getString("contato"));
        umCliente.setEnderecoCliente(rs.getString("endereco"));
        umCliente.setEmail(rs.getString("email"));
            
        listaClientes.add(umCliente);
        }
        
        } catch (Exception e) {
            listaClientes = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaClientes;   
    }
    public static ArrayList<Cliente> consultarClientePorNome(Cliente clienteExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome = ?");
        instrucaoSQL.setString(1, clienteExistente.getNomeCliente());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Cliente umCliente = new Cliente();
        umCliente.setIdcliente(rs.getInt("id"));
        umCliente.setNomeCliente(rs.getString("nome"));
        umCliente.setCpfCliente(rs.getString("cpf"));
        umCliente.setCep(rs.getString("cep"));
        umCliente.setContato(rs.getString("contato"));
        umCliente.setEnderecoCliente(rs.getString("endereco"));
        umCliente.setEmail(rs.getString("email"));
            
        listaClientes.add(umCliente);
        }
        
        } catch (Exception e) {
            listaClientes = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaClientes;   
    }
    public static ArrayList<Cliente> consultarClientePorCpf(Cliente clienteExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
        instrucaoSQL.setString(1, clienteExistente.getCpfCliente());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Cliente umCliente = new Cliente();
        umCliente.setIdcliente(rs.getInt("id"));
        umCliente.setNomeCliente(rs.getString("nome"));
        umCliente.setCpfCliente(rs.getString("cpf"));
        umCliente.setCep(rs.getString("cep"));
        umCliente.setContato(rs.getString("contato"));
        umCliente.setEnderecoCliente(rs.getString("endereco"));
        umCliente.setEmail(rs.getString("email"));
            
        listaClientes.add(umCliente);
        }
        
        } catch (Exception e) {
            listaClientes = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaClientes;   
    }
    public static Cliente consultarClienteId(int ID) throws SQLException{
        // Array list para armazenar os valores
        Cliente listaClientes= new Cliente();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE id = ? ");
        instrucaoSQL.setInt(1, ID);
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        
        listaClientes.setIdcliente(rs.getInt("id"));
        listaClientes.setNomeCliente(rs.getString("nome"));
        listaClientes.setCpfCliente(rs.getString("cpf"));
        listaClientes.setCep(rs.getString("cep"));
        listaClientes.setContato(rs.getString("contato"));
        listaClientes.setEnderecoCliente(rs.getString("endereco"));
        listaClientes.setEmail(rs.getString("email"));
            
        
        }
        
        } catch (Exception e) {
            listaClientes = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaClientes;   
    }
/*================================================================================================================*/
/*                                     Metodos de pesquisa Produto                                                */
    public static ArrayList<Produto> consultarProduto() throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Produto> listaProdutos= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto");
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Produto umProduto = new Produto();
        umProduto.setCodigo(rs.getInt("id"));
        umProduto.setMarcaProduto(rs.getString("marca"));
        umProduto.setNomeProduto(rs.getString("descricao"));
        umProduto.setPrecoProduto(rs.getDouble("valoruni"));
        umProduto.setEstoque(rs.getInt("estoque"));
        
        listaProdutos.add(umProduto);
        }
        
        } catch (Exception e) {
            listaProdutos = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaProdutos;   
    }
    public static ArrayList<Produto> consultarProdutoPorNome(Produto produtoExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Produto> listaProduto= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE descricao = ?");
        instrucaoSQL.setString(1, produtoExistente.getNomeProduto());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Produto umProduto = new Produto();
        umProduto.setCodigo(rs.getInt("id"));
        umProduto.setMarcaProduto(rs.getString("marca"));
        umProduto.setNomeProduto(rs.getString("descricao"));
        umProduto.setPrecoProduto(rs.getDouble("valoruni"));
        umProduto.setEstoque(rs.getInt("estoque"));
        
        listaProduto.add(umProduto);
        }
        
        } catch (Exception e) {
            listaProduto = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaProduto;   
    }
    public static ArrayList<Produto> consultarProdutoPorCodigo(Produto produtoExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Produto> listaProduto= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id = ?");
        instrucaoSQL.setInt(1, produtoExistente.getCodigo());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
       while(rs.next()){
        Produto umProduto = new Produto();
        umProduto.setCodigo(rs.getInt("id"));
        umProduto.setMarcaProduto(rs.getString("marca"));
        umProduto.setNomeProduto(rs.getString("descricao"));
        umProduto.setPrecoProduto(rs.getDouble("valoruni"));
        umProduto.setEstoque(rs.getInt("estoque"));
        
        listaProduto.add(umProduto);
        }
        
        } catch (Exception e) {
            listaProduto = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaProduto;   
    }
    public static Produto consultarProdutoId(int ID) throws SQLException{
        // Array list para armazenar os valores
        Produto listaClientes= new Produto();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id = ? ");
        instrucaoSQL.setInt(1, ID);
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        
        listaClientes.setCodigo(rs.getInt("id"));
        listaClientes.setNomeProduto(rs.getString("nome"));
        listaClientes.setMarcaProduto(rs.getString("marca"));
        listaClientes.setPrecoProduto(rs.getDouble("valoruni"));
        
        }
        
        } catch (Exception e) {
            listaClientes = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaClientes;   
    }
 /*================================================================================================================*/
/*                                     Metodos de pesquisa Funcionario                                             */
    /**
    * 
    *@author Brendo Rotta
    *@return ArrayList contendo todos os funcionarios cadastrado
    *
    */
    public static ArrayList<Funcionario> consultarFuncionario() throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Funcionario> listaFuncionario= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM funcionario");
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Funcionario umFuncionario = new Funcionario();
        umFuncionario.setId(rs.getInt("id"));
        umFuncionario.setNome(rs.getString("nome"));
        umFuncionario.setTelefone(rs.getString("contato"));
        umFuncionario.setEndereco(rs.getString("endereco"));
        
        listaFuncionario.add(umFuncionario);
        }
        
        } catch (Exception e) {
            listaFuncionario = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaFuncionario;   
    }
    public static ArrayList<Funcionario> consultarFuncionarioPorNome(Funcionario funcionarioExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Funcionario> listaFuncionario= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM funcionario WHERE nome = ?");
        instrucaoSQL.setString(1, funcionarioExistente.getNome());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Funcionario umFuncionario = new Funcionario();
        umFuncionario.setId(rs.getInt("id"));
        umFuncionario.setNome(rs.getString("nome"));
        umFuncionario.setTelefone(rs.getString("contato"));
        umFuncionario.setEndereco(rs.getString("endereco"));
        
        listaFuncionario.add(umFuncionario);
        }
        
        } catch (Exception e) {
            listaFuncionario = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaFuncionario;   
    }
    public static ArrayList<Funcionario> consultarFuncionarioPorId(Funcionario funcionarioExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Funcionario> listaFuncionario= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id = ?");
        instrucaoSQL.setInt(1, funcionarioExistente.getId());
        
        rs = instrucaoSQL.executeQuery();
        
        
       while(rs.next()){
        Funcionario umFuncionario = new Funcionario();
        umFuncionario.setId(rs.getInt("id"));
        umFuncionario.setNome(rs.getString("nome"));
        umFuncionario.setTelefone(rs.getString("contato"));
        umFuncionario.setEndereco(rs.getString("endereco"));
        
        listaFuncionario.add(umFuncionario);
        }
        
        } catch (Exception e) {
            listaFuncionario = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaFuncionario; 
    }
    public static ArrayList<Funcionario> consultarFuncionarioCpf(Funcionario funcionarioExistente) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Funcionario> listaFuncionario= new ArrayList<>();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE cpf = ?");
        instrucaoSQL.setString(1, funcionarioExistente.getCpf());
        
        rs = instrucaoSQL.executeQuery();
        
        
       while(rs.next()){
        Funcionario umFuncionario = new Funcionario();
        umFuncionario.setId(rs.getInt("id"));
        umFuncionario.setNome(rs.getString("nome"));
        umFuncionario.setCpf(rs.getString("cpf"));
        umFuncionario.setTelefone(rs.getString("contato"));
        umFuncionario.setEndereco(rs.getString("endereco"));
        
        listaFuncionario.add(umFuncionario);
        }
        
        } catch (Exception e) {
            listaFuncionario = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaFuncionario; 
    }
    public static Funcionario consultarFuncionarioId(int ID) throws SQLException{
        // Array list para armazenar os valores
        Funcionario listaFuncionario= new Funcionario();
        // Criar objeto de conexão
        Connection conexao = null;
        // Statement para comando no banco de dados 
        PreparedStatement instrucaoSQL = null;
        // Atribuir o resultado da pesquisa em quantidade de linhas para o laço
        ResultSet rs =null;
        
        
        try {
        //  1 Informando o Driver a ser utilizado
        Class.forName("com.mysql.cj.jdbc.Driver");
        //  2 Utilizar o DriverManager para criar um objeto de conexão
        conexao = DriverManager.getConnection(url, login, senha);
        //  3 execução da consulta geral de clientes
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM funcionario WHERE id = ? ");
        instrucaoSQL.setInt(1, ID);
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        
        listaFuncionario.setId(rs.getInt("id"));
        listaFuncionario.setNome(rs.getString("nome"));
        listaFuncionario.setTelefone(rs.getString("contato"));
        listaFuncionario.setEndereco(rs.getString("endereco"));
            
        
        }
        
        } catch (Exception e) {
            listaFuncionario = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaFuncionario;   
    }

}
