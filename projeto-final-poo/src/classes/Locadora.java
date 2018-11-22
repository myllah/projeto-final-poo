
package classes;

public class Locadora extends Everyone{
    
    private String cnpj;
    private Endereco endereco;
    private Veiculo[] veiculos;
    
    public Locadora(){}
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
}
