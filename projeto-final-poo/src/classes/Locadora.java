
package classes;

public class Locadora extends Everyone{
    
    private int id;
    private int idEndereco;
    private String cnpj;
    private Endereco endereco;
    
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

   
    
}
