/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConsultarDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import methods.Cliente;
import methods.Funcionario;

/**
 *
 * @author BrendoRotta
 */
public class FuncionarioController {
    
    public static boolean salvar(String nome,String CPF,String telefone,String endereco) throws Exception{
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome(nome);
        novoFuncionario.setTelefone(telefone);
        novoFuncionario.setEndereco(endereco);
        
    return dao.CadastrarDao.salvarFuncionario(novoFuncionario);
    }
    public static boolean excluir(int idFuncionario) throws Exception{
    return dao.CadastrarDao.ExcluirFuncionario(idFuncionario);
    }
    public static boolean editar(String nome, String Cpf, String Endereco,String contato, int ID) throws Exception{
       Funcionario novoFuncionario = new Funcionario();
       novoFuncionario.setId(ID);
       novoFuncionario.setNome(nome);
       novoFuncionario.setTelefone(contato);
       novoFuncionario.setEndereco(Endereco);
        return dao.CadastrarDao.editarFuncionario(novoFuncionario);
    }
    
    public static ArrayList<String[]> consulta() throws SQLException{
        ArrayList<Funcionario> listaFuncionario= ConsultarDAO.consultarFuncionario();
        ArrayList<String[]> retornoView= new ArrayList<>();
        for (Funcionario funcionario:listaFuncionario){
            retornoView.add(new String[]{
                            String.valueOf(funcionario.getId()),
                            String.valueOf(funcionario.getNome()),
                            String.valueOf(funcionario.getTelefone()),
                            String.valueOf(funcionario.getEndereco()),
                            
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
   return retornoView;
    }
    public static ArrayList<String[]> consultaNome(String nome) throws SQLException{
        Funcionario umFuncionario = new Funcionario();
        umFuncionario.setNome(nome);
        ArrayList<Funcionario> listaFuncionario= ConsultarDAO.consultarFuncionarioPorNome(umFuncionario);
        ArrayList<String[]> retornoView= new ArrayList<>();
        for (Funcionario cliente:listaFuncionario){
            retornoView.add(new String[]{
                            String.valueOf(cliente.getId()),
                            String.valueOf(cliente.getNome()),
                            String.valueOf(cliente.getTelefone()),
                            String.valueOf(cliente.getEndereco()),
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
   return retornoView;
    }
    
}
