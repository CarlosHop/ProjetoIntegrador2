/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import methods.Fornecedor;

/**
 *
 * @author Gamer
 */
public class fornecedorController {
    public static boolean salvar(String razaoSocial,String cnpj) throws Exception{
    Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.setRazaoSocial(razaoSocial);
        novoFornecedor.setCnpj(cnpj);
        return dao.CadastrarDao.salvarFornecedor(novoFornecedor);
    }
    
}
