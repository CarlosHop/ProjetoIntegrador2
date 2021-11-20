package methods;

public class Funcionario {

private String Nome;
private String CPF;
private String telefone;
private String endereco;
private String login;
private String senha;

public Funcionario(){}

/*==============================================================================*/
                                   /*Getters*/
    public String getNome() {
        return Nome;
    }
    public String getCPF() {
        return CPF;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getLogin(){
        return login;
    }
    public String getSenha(){
        return senha;
    }
/*==============================================================================*/
                                  /*Setters*/
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    


    
}
