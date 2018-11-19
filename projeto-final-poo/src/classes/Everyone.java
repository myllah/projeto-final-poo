
package classes;

public abstract class Everyone {
    
    private int id;
    private String nome;
    private char[] senha;
    private String telefone;
    private String email;
    
    public int getId(){
        return id;
    }
    
     public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public char[] getSenha(){
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}
