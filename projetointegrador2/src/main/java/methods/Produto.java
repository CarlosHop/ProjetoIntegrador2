package methods;

public class Produto {

    private int codigo;
    private String marcaProduto;
    private String nomeProduto;
    private double precoProduto;
    private int estoque;
    
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
    public int getEstoque(){
        return estoque;
    }
    public int getCodigo() {
        return codigo;
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
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
}
