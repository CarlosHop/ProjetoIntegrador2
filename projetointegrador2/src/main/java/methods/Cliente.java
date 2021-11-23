package methods;

public class Cliente {
    
    private int idcliente;
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String cep;
    private String email;
    private String contato;

    
/*============================================================================*/
/*                             Métodos Get's                                  */
    public int getIdcliente(){
        return idcliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getCpfCliente() {
        return cpfCliente;
    }
    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public String getCep(){
        return cep;
    }
    public String getEmail(){
        return email;
    }
    public String getContato(){
        return contato;
    }
    
/*============================================================================*/
/*                             Métodos Set's                                  */
    public void setIdcliente(int idcliente){
        this.idcliente = idcliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setContato(String contato){
        this.contato = contato;
    }
    
}
