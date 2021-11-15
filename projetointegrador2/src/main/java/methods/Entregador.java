/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Brendo Rotta
 */
public class Entregador {
        private String nome;
        private String placa;
        private int celular;
        
        public Entregador(){}
        
/*============================================================================*/
/*                              Métodos Get's                                 */
public String getNome(){
    return nome;
}
public String getPlaca(){
    return placa;
}
public int getCelular(){
    return celular;
}

/*============================================================================*/
/*                              Métodos Set's                                 */
public void setNome(String nome){
    this.nome=nome;
    }
public void setPlaca(String placa) {
    this.placa = placa;
    }
public void setCelular(int celular) {
    this.celular = celular;
    }

}
