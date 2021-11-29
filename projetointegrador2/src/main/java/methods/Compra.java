/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Date;

/**
 *
 * @author Brendo Rotta
 */
public class Compra {
    private int id;
    private Date dataCompra;
    private Date dataComeco;
    private Date dateFim;
    private String comprador;
    private String produto;
    private int quantidade;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    public String getComprador() {
        return comprador;
    }
    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setDataComeco(Date dataComeco) {
        this.dataComeco = dataComeco;
    }

    public void setDateFim(Date dateFim) {
        this.dateFim = dateFim;
    }

    public Date getDataComeco() {
        return dataComeco;
    }

    public Date getDateFim() {
        return dateFim;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
