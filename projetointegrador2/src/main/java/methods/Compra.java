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
    private String dataCompra;
    private Date dataComeco;
    private Date dateFim;
    private String comprador;
    private int idComprador;
    private String produto;
    private int idProduto;
    private double valorTotal;

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public int getIdProduto() {
        return idProduto;
    }
    private int quantidade;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(String dataCompra) {
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
    
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
