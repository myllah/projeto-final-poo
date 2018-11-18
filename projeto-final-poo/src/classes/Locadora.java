
package classes;

public class Locadora {
    
    private int id;
    private String nome;
    private char[] senha;
    private String telefone;
    private String email;
    private String cnpj;
    private Endereco endereco;
    private String website;
    private Veiculo[] veiculos;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
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

    public void setSenha(char[] a) {
        this.senha = a;
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
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
}

//    private Endereco endereco;
//    private String website;
//    private Veiculo[] veiculos;