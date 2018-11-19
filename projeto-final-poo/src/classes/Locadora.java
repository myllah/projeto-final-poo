
package classes;

public class Locadora extends Everyone{
    
    private String cnpj;
    private Endereco endereco;
    private String site;
    private Veiculo[] veiculos;
    
    public Locadora(){}
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public Endereco GetEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public String GetSite(){
        return site;
    }
    
    public void setSite(String site){
        this.site = site;
    }
}
