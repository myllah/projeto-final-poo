
package model.bean;

public class Locadora extends Everyone{
    
    private int id;
    private String cnpj;
    
    public Locadora(){}
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
  
}
