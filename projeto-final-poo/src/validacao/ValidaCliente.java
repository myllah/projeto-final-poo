
package validacao;

import classes.Cliente;
import classes.Locadora;
import javax.swing.JOptionPane;

public class ValidaCliente {

    public boolean validaCadastro(Cliente c) {

        boolean resposta = false;
        String txt = "txt";
        
       if(ValidaLC.nomeVazio(c.getNome()) == true){
           if(txt.equals("txt")){
               txt = "\nNome vazio";
           }else{
               txt = txt + "\nNome vazio";
           }
           resposta = true;
       }
       if(ValidaLC.emailVazio(c.getEmail()) == true){
           if(txt.equals("txt")){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaC.cpfVazio(c.getCpf()) == true){
            if(txt.equals("txt")){
               txt = "\nCPF vazio";
           }else{
               txt = txt + "\nCPF vazio";
           }
           resposta = true;
       }else if(ValidaC.validaCpf(c.getCpf()) == true){
           if(txt.equals("txt")){
               txt = "\nCPF incorreto";
           }else{
               txt = txt + "\nCPF incorreto";
           }
           resposta = true;
       }
        if(ValidaLC.telefoneVazio(c.getTelefone())== true){
            if(txt.equals("txt")){
               txt = "\nTelefone vazio";
           }else{
               txt = txt + "\nTelefone vazio";
           }
           resposta = true;
       }
        if(ValidaLC.validaSenha(c.getSenha()) == true){
            if(txt.equals("txt")){
               txt = "\nSenha incorreta";
           }else{
               txt = txt + "\nSenha incorreta";
           }
           resposta = true;
       }
        
        if(txt.equals("txt")){
            txt = "Seja bem vindo!!";
        }
        
        JOptionPane.showMessageDialog(null, txt);
        return resposta;
    }   
    
    public boolean validaLogin(Cliente c) {

        boolean resposta = false;
        String txt = "txt";
        
       if(ValidaLC.emailVazio(c.getEmail())== true){
           if(txt.equals("txt")){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaLC.validaSenha(c.getSenha()) == true){
           if(txt.equals("txt")){
               txt = "\nA Senha deve ter entre 6 e 12 caracteres";
           }else{
               txt = txt + "\nA Senha deve ter entre 6 e 12 caracteres";
           }
           resposta = true;
       }
       
       if(txt.equals("txt")){
            txt = "Olá novamente!!";
        }
       
        JOptionPane.showMessageDialog(null, txt);
        return resposta;
    }   
}
