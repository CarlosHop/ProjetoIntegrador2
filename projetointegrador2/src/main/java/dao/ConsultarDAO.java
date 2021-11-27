package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import methods.Cliente;

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
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes");
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Cliente umCliente = new Cliente();
        umCliente.setIdcliente(rs.getInt("idCliente"));
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
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE nome = ?");
        instrucaoSQL.setString(1, clienteExistente.getNomeCliente());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Cliente umCliente = new Cliente();
        umCliente.setIdcliente(rs.getInt("idCliente"));
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
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE cpf = ?");
        instrucaoSQL.setString(1, clienteExistente.getCpfCliente());
        
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Cliente umCliente = new Cliente();
        umCliente.setIdcliente(rs.getInt("idCliente"));
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
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE idCliente = ? ");
        instrucaoSQL.setInt(1, ID);
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        
        listaClientes.setIdcliente(rs.getInt("idCliente"));
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
}
