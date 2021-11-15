package methods;

public class Produto {

    private String marcaProduto;
    private String nomeProduto;
    private double precoProduto;
    private int quantProduto;

    
    public Produto(){}
    
/*============================================================================*/
/*                              Métodos Get's                                 */
    public String getMarcaProduto() {
        return marcaProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public int getQuantProduto() {
        return quantProduto;
    }
    
/*============================================================================*/
/*                              Métodos Set's                                 */ 
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }
}
