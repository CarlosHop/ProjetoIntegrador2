package methods;

public class Cliente {
    
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private int cep;
    private String email;

    
/*============================================================================*/
/*                             Métodos Get's                                  */
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getCpfCliente() {
        return cpfCliente;
    }
    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public int getCep(){
        return cep;
    }
    public String getEmail(){
        return email;
    }
    
/*============================================================================*/
/*                             Métodos Set's                                  */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public void setEmail(){
        this.email = email;
    }
    
}
