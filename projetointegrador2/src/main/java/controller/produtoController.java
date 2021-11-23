/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import methods.Produto;

/**
 *
 * @author BrendoRotta
 *
 */
public class produtoController {

    public static boolean salvar(String cod, String marca, String descricao, double valorUni, int chaveEstrangeira) throws Exception {
        Produto novoProduto = new Produto();
        novoProduto.setCodigo(cod);
        novoProduto.setMarcaProduto(marca);
        novoProduto.setNomeProduto(descricao);
        novoProduto.setPrecoProduto(valorUni);

        return dao.CadastrarDao.salvarProduto(novoProduto,chaveEstrangeira);
    }

}
