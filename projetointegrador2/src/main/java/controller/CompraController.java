/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConsultarDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import methods.Compra;

/**
 *
 * @author Brendo Rotta
 */
public class CompraController {
    public static boolean Comprar(int idComprador,int idProduto,String datacompra,int quantidade) throws SQLException{
        Compra novaCompra = new Compra();
        novaCompra.setIdComprador(idComprador);
        novaCompra.setIdProduto(idProduto);
        novaCompra.setDataCompra(datacompra);
        novaCompra.setQuantidade(quantidade);
        
        
        return dao.CadastrarDao.venda(novaCompra);
    }
    
    public static ArrayList<String[]> consulta() throws SQLException{
        ArrayList<Compra> Compra = ConsultarDAO.consultarCompraSintetico();
        ArrayList<String[]> compraView= new ArrayList<>();
        for (Compra compra:Compra){
            compraView.add(new String[]{
                            String.valueOf(compra.getId()),
                            String.valueOf(compra.getComprador()),
                            String.valueOf(compra.getDataCompra()),
                            String.valueOf(compra.getValorTotal()),
                            } // Chave do vetor de string
                            ); // Chave do retornoView 
        }
    return compraView;
    }
}
