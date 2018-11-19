
package validacao;

import classes.Locadora;
import javax.swing.JOptionPane;

public class ValidaLocadora {

    public boolean validaCadastro(Locadora l) {

        boolean resposta = false;
        String txt = "txt";
        
       if(ValidaLC.nomeVazio(l.getNome()) == true){
            if(txt.equals("txt")){
               txt = "\nNome vazio";
           }else{
               txt = txt + "\nNome vazio";
           }
           resposta = true;
       }
       if(ValidaLC.emailVazio(l.getEmail())== true){
           if(txt.equals("txt")){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaL.cnpjVazio(l.getCnpj()) == true){
           if(txt.equals("txt")){
               txt = "\nCNPJ vazio";
           }else{
               txt = txt + "\nCNPJ vazio";
           }
           resposta = true;
       }else if(ValidaL.validaCnpj(l.getCnpj()) == true){
           if(txt.equals("txt")){
               txt = "\nCNPJ incorreto";
           }else{
               txt = txt + "\nCNPJ incorreto";
           }
           resposta = true;
       }
       if(ValidaLC.telefoneVazio(l.getTelefone())== true){
           if(txt.equals("txt")){
               txt = "\nTelefone vazio";
           }else{
               txt = txt + "\nTelefone vazio";
           }
           resposta = true;
       }
       if(ValidaL.estadoVazio(l.getEndereco().getEstado())== true){
           if(txt.equals("txt")){
               txt = "\nEstado vazio";
           }else{
               txt = txt + "\nEstado vazio";
           }
           resposta = true;
       }
       if(ValidaL.cidadeVazia(l.getEndereco().getCidade())== true){
           if(txt.equals("txt")){
               txt = "\nCidade vazia";
           }else{
               txt = txt + "\nCidade vazia";
           }
           resposta = true;
       } 
        if(ValidaL.bairroVazio(l.getEndereco().getBairro())== true){
            if(txt.equals("txt")){
               txt = "\nBairro vazio";
           }else{
               txt = txt + "\nBairro vazio";
           }
           resposta = true;
       } 
       if(ValidaLC.validaSenha(l.getSenha()) == true){
           if(txt.equals("txt")){
               txt = "\nA Senha deve ter entre 6 e 12 caracteres";
           }else{
               txt = txt + "\nA Senha deve ter entre 6 e 12 caracteres";
           }
           resposta = true;
       }
       
       if(txt.equals("txt")){
            txt = "Seja bem vindo!!";
        }
       
        JOptionPane.showMessageDialog(null, txt);
        return resposta;
    }
    
    public boolean validaLogin(Locadora l) {

        boolean resposta = false;
        String txt = "txt";
        
       if(ValidaLC.emailVazio(l.getEmail())== true){
           if(txt.equals("txt")){
               txt = "\nEmail vazio";
           }else{
               txt = txt + "\nEmail vazio";
           }
           resposta = true;
       }
       if(ValidaLC.validaSenha(l.getSenha()) == true){
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
