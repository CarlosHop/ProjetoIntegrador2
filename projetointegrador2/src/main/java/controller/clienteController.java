package controller;

import dao.ConsultarDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import methods.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BrendoRotta
 */
public class clienteController {
    
    public static boolean salvar(String nome, String Cpf, String Endereco,String Cep, String email,String contato) throws Exception{
    Cliente novoCliente = new Cliente();
       novoCliente.setNomeCliente(nome);
       novoCliente.setCpfCliente(Cpf);
       novoCliente.setEnderecoCliente(Endereco);
       novoCliente.setCep(Cep);
       novoCliente.setEmail(email);
       novoCliente.setContato(contato);
       
        
        return dao.CadastrarDao.salvarCliente(novoCliente);
    }
    
    public static ArrayList<String[]> consulta() throws SQLException{
        ArrayList<Cliente> listaCliente= ConsultarDAO.consultarCliente();
        ArrayList<String[]> retornoView= new ArrayList<>();
        for (Cliente cliente:listaCliente){
            retornoView.add(new String[]{
                            String.valueOf(cliente.getIdcliente()),
                            String.valueOf(cliente.getNomeCliente()),
                            String.valueOf(cliente.getCpfCliente()),
                            String.valueOf(cliente.getCep()),
                            String.valueOf(cliente.getContato()),
                            String.valueOf(cliente.getEnderecoCliente()),
                            String.valueOf(cliente.getEmail())
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
   return retornoView;
    }
    
}
