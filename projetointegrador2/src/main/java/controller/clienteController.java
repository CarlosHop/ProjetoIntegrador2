package controller;

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
    
}
