package methods;

public class Fornecedor {
private String RazaoSocial;
private int CNPJ;

public Fornecedor(){}

public String getRazaoSocial(){
return RazaoSocial;
}
public int getCNPJ(){
return CNPJ;
}

public void setRazaoSocial(){
    this.RazaoSocial=RazaoSocial;
}
public void setCNPJ(){
    this.CNPJ=CNPJ;
} 
}