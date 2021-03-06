
package validacao;

import model.bean.Locadora;
import javax.swing.JOptionPane;

public class ValidaLocadora {

    public static boolean validaCadastro(Locadora l) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaLC.nomeVazio(l.getNome()) == true){
            if(txt == null){
               txt = "\nNome vazio";
           }else{
               txt = txt + "\nNome vazio";
           }
           resposta = true;
       }
       if(ValidaLC.emailVazio(l.getEmail())== true){
           if(txt == null){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaL.cnpjVazio(l.getCnpj()) == true){
         if(txt == null){
               txt = "\nCNPJ vazio";
           }else{
               txt = txt + "\nCNPJ vazio";
           }
           resposta = true;
       }else if(ValidaL.validaCnpj(l.getCnpj()) == true){
          if(txt == null){
               txt = "\nCNPJ incorreto";
           }else{
               txt = txt + "\nCNPJ incorreto";
           }
           resposta = true;
       }
       if(ValidaLC.telefoneVazio(l.getTelefone())== true){
          if(txt == null){
               txt = "\nTelefone vazio";
           }else{
               txt = txt + "\nTelefone vazio";
           }
           resposta = true;
       }
 
       if(ValidaLC.validaSenha(l.getSenha()) == true){
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
    
    public static boolean validaLogin(Locadora l) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaLC.emailVazio(l.getEmail())== true){
           if(txt == null){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaLC.validaSenha(l.getSenha()) == true){
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
