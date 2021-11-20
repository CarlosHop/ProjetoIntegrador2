package methods;

public class Produto {

    private String codigo;
    private String marcaProduto;
    private String nomeProduto;
    private double precoProduto;

    
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

    public String getCodigo() {
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
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
