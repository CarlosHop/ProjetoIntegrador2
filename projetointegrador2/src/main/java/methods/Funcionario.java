package methods;

public class Funcionario {

private String Nome;
private int CPF;
private int telefone;
private String sexo;
private String endereco;

public Funcionario(){}

/*==============================================================================*/
                                   /*Getters*/
    public String getNome() {
        return Nome;
    }
    public int getCPF() {
        return CPF;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getSexo() {
        return sexo;
    }
    public String getEndereco() {
        return endereco;
    }
/*==============================================================================*/
                                  /*Setters*/
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    
}
