package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import methods.Cliente;
import methods.Compra;
import methods.Produto;

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
     public static Cliente consultarClienteCpfUnico(String cpf) throws SQLException{
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
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE cpf = ? ");
        instrucaoSQL.setString(1, cpf);
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
        Produto produto= new Produto();
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
        
        produto.setCodigo(rs.getInt("id"));
        produto.setNomeProduto(rs.getString("descricao"));
        produto.setMarcaProduto(rs.getString("marca"));
        produto.setPrecoProduto(rs.getDouble("valoruni"));
        produto.setEstoque(rs.getInt("estoque"));
        }
        
        } catch (Exception e) {
            produto = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return produto;   
    }

    public static ArrayList<Compra> consultarCompra() throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Compra> listaCompras= new ArrayList<>();
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
        instrucaoSQL = conexao.prepareStatement("SELECT * FROM compra");
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Compra umaCompra = new Compra();
        umaCompra.setId(rs.getInt("id"));
        umaCompra.setDataCompra(rs.getDate("data"));
        umaCompra.setComprador(rs.getString("id_cliente"));
        umaCompra.setProduto(rs.getString("id_produto"));
            
        listaCompras.add(umaCompra);
        }
        
        } catch (Exception e) {
            listaCompras = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaCompras;   
    }
    public static ArrayList<Compra> consultarCompraComData(Compra compra) throws SQLException{
        // Array list para armazenar os valores
        ArrayList<Compra> listaCompras= new ArrayList<>();
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
        instrucaoSQL = conexao.prepareStatement("SELECT id, data, quantidade, id_cliente, id_produto\n" +
                                                "FROM compra\n" +
                                                "WHERE data >= ? " +
                                                "AND data < ?");
        instrucaoSQL.setDate(1, (Date)compra.getDataComeco());
        instrucaoSQL.setDate(2, (Date) compra.getDateFim());
        rs = instrucaoSQL.executeQuery();
        
        
        // Loop para acrescentar todos os clientes no arraylist
        while(rs.next()){
        Compra umaCompra = new Compra();
        umaCompra.setId(rs.getInt("id"));
        umaCompra.setDataCompra(rs.getDate("data"));
        umaCompra.setComprador(rs.getString("id_cliente"));
        umaCompra.setProduto(rs.getString("id_produto"));
            
        listaCompras.add(umaCompra);
        }
        
        } catch (Exception e) {
            listaCompras = null;
        }finally{
        if(conexao!=null){
            conexao.close(); 
        }
        if(rs!=null){
            rs.close(); 
        }
        }
        
     return listaCompras;   
    }
    
}
