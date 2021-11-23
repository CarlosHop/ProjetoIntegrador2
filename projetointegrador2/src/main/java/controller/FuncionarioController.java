/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import methods.Funcionario;

/**
 *
 * @author BrendoRotta
 */
public class FuncionarioController {
    
    public static boolean salvar(String nome,String CPF,String telefone,String endereco,String login,String senha) throws Exception{
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome(nome);
        novoFuncionario.setCPF(CPF);
        novoFuncionario.setTelefone(telefone);
        novoFuncionario.setEndereco(endereco);
        novoFuncionario.setLogin(login);
        novoFuncionario.setSenha(senha);
        
       
        
    return dao.CadastrarDao.salvarFuncionario(novoFuncionario);
    }
    
}
