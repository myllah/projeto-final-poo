
package validacao;

import classes.Locadora;
import javax.swing.JOptionPane;

public class ValidaLocadora {

    public boolean validaCadastro(Locadora l) {

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
       if(ValidaL.estadoVazio(l.getEndereco().getEstado())== true){
           if(txt == null){
               txt = "\nEstado vazio";
           }else{
               txt = txt + "\nEstado vazio";
           }
           resposta = true;
       }
       if(ValidaL.cidadeVazia(l.getEndereco().getCidade())== true){
          if(txt == null){
               txt = "\nCidade vazia";
           }else{
               txt = txt + "\nCidade vazia";
           }
           resposta = true;
       } 
        if(ValidaL.bairroVazio(l.getEndereco().getBairro())== true){
           if(txt == null){
               txt = "\nBairro vazio";
           }else{
               txt = txt + "\nBairro vazio";
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
    
    public boolean validaLogin(Locadora l) {

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
