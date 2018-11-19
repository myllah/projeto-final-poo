
package classes;

public class Endereco {
    
    private String cidade;
    private String estado;
    private String bairro;

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }
        
}
