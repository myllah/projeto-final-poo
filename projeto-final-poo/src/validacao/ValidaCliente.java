
package validacao;

import model.bean.Cliente;
import javax.swing.JOptionPane;

public class ValidaCliente {

    public boolean validaCadastro(Cliente c) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaLC.nomeVazio(c.getNome()) == true){
           if(txt == null){
               txt = "\nNome vazio";
           }else{
               txt = txt + "\nNome vazio";
           }
           resposta = true;
       }
       if(ValidaLC.emailVazio(c.getEmail()) == true){
           if(txt == null){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaC.cpfVazio(c.getCpf()) == true){
            if(txt == null){
               txt = "\nCPF vazio";
           }else{
               txt = txt + "\nCPF vazio";
           }
           resposta = true;
       }else if(ValidaC.validaCpf(c.getCpf()) == true){
           if(txt == null){
               txt = "\nCPF incorreto";
           }else{
               txt = txt + "\nCPF incorreto";
           }
           resposta = true;
       }
        if(ValidaLC.telefoneVazio(c.getTelefone())== true){
            if(txt == null){
               txt = "\nTelefone vazio";
           }else{
               txt = txt + "\nTelefone vazio";
           }
           resposta = true;
       }
        if(ValidaLC.validaSenha(c.getSenha()) == true){
            if(txt == null){
               txt = "\nSenha incorreta";
           }else{
               txt = txt + "\nSenha incorreta";
           }
           resposta = true;
       }
        
        if(txt != null){
            JOptionPane.showMessageDialog(null, txt);
        }
        
        return resposta;
    }   
    
    public boolean validaLogin(Cliente c) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaLC.emailVazio(c.getEmail())== true){
           if(txt == null){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaLC.validaSenha(c.getSenha()) == true){
            if(txt == null){
               txt = "\nA Senha deve ter entre 6 e 12 caracteres";
           }else{
               txt = txt + "\nA Senha deve ter entre 6 e 12 caracteres";
           }
           resposta = true;
       }
       
        if(txt != null){
            JOptionPane.showMessageDialog(null, txt);
        }
       
        return resposta;
    }   
}
