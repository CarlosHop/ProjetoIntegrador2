package methods;

public class Funcionario {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    

    public Funcionario() {
    }

    /*==============================================================================*/
                 /*                Getters                                    */
    public int getId(){
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    

    /*==============================================================================*/
                /*                  Setters                                   */
    public void setNome(String Nome) {
        this.nome = nome;
    }
    public void setCPF(String CPF) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setId(int id){
        this.id = id;
    }

}
