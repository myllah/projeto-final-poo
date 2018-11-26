package classes;

public class Cliente extends Everyone{

    private String cpf;
    
    public Cliente(){}
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString() {
        String s = "nome" + this.getNome();
        
        return s;
    }

    
}
