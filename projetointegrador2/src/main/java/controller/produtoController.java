/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConsultarDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import methods.Produto;

/**
 *
 * @author BrendoRotta
 *
 */
public class produtoController {

    public static boolean salvar(String marca, String descricao, double valorUni) throws Exception {
        Produto novoProduto = new Produto();
        novoProduto.setMarcaProduto(marca);
        novoProduto.setNomeProduto(descricao);
        novoProduto.setPrecoProduto(valorUni);

        return dao.CadastrarDao.salvarProduto(novoProduto);
    }
    public static boolean excluir(int idProduto) throws Exception{
    return dao.CadastrarDao.ExcluirProduto(idProduto);
    }
    public static boolean editar(int ID,String marca, String descricao, double valor) throws Exception{
       Produto novoProduto = new Produto();
       novoProduto.setCodigo(ID);
       novoProduto.setMarcaProduto(marca);
       novoProduto.setNomeProduto(descricao);
       novoProduto.setPrecoProduto(valor);
        
        return dao.CadastrarDao.editarProduto(novoProduto);
    }
 
    
    public static ArrayList<String[]> consulta() throws SQLException{
        ArrayList<Produto> listaProduto= ConsultarDAO.consultarProduto();
        ArrayList<String[]> retornoView= new ArrayList<>();
        for (Produto produto:listaProduto){
            retornoView.add(new String[]{
                            String.valueOf(produto.getCodigo()),
                            String.valueOf(produto.getMarcaProduto()),
                            String.valueOf(produto.getNomeProduto()),
                            String.valueOf(produto.getPrecoProduto()),
                            String.valueOf(produto.getEstoque())
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
   return retornoView;
    }
    public static ArrayList<String[]> consultaNome(String nome) throws SQLException{
        Produto umProduto = new Produto();
        umProduto.setNomeProduto(nome);
        ArrayList<Produto> listaProduto= ConsultarDAO.consultarProdutoPorNome(umProduto);
        ArrayList<String[]> retornoView= new ArrayList<>();
        for (Produto produto:listaProduto){
            retornoView.add(new String[]{
                            String.valueOf(produto.getCodigo()),
                            String.valueOf(produto.getMarcaProduto()),
                            String.valueOf(produto.getNomeProduto()),
                            String.valueOf(produto.getPrecoProduto()),
                            String.valueOf(produto.getEstoque())
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
        
   return retornoView;
    }
    public static ArrayList<String[]> consultaCodigo(int ID) throws SQLException{
        Produto umProduto = new Produto();
        umProduto.setCodigo(ID);
        ArrayList<Produto> listaProduto= ConsultarDAO.consultarProdutoPorCodigo(umProduto);
        ArrayList<String[]> retornoView= new ArrayList<>();
        for (Produto produto:listaProduto){
            retornoView.add(new String[]{
                            String.valueOf(produto.getCodigo()),
                            String.valueOf(produto.getMarcaProduto()),
                            String.valueOf(produto.getNomeProduto()),
                            String.valueOf(produto.getPrecoProduto()),
                            String.valueOf(produto.getEstoque())
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
   return retornoView;
    }
    
    public static Produto itemParaCompra(int Codigo) throws SQLException{
            return dao.ConsultarDAO.consultarProdutoId(Codigo);
    }
    
    




}
