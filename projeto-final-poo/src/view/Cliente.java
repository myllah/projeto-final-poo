
package view;

public class Cliente {
    
    private String nome;
    private String senha;
    
    Cliente(){}
    
    public void setNome(String nome){
       this.nome = nome;
    }
    
    public String getNome(){
        return nome;        
    }
    
    public void setSenha(String senha){
      this.senha = senha; 
    }
    
    public String getSenha(){
        return senha;
    }
    
}
