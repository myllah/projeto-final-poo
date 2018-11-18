
package validacao;

import classes.Locadora;
import javax.swing.JOptionPane;

public class ValidaLocadora {

    public boolean validaCadastro(Locadora l) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaL.validaCnpj(l.getCnpj()) == false){
          txt = "CNPJ incorreto";
           resposta = false;
       }if(ValidaLC.ValidaSenha(l.getSenha()) == false){
          txt = txt + "\nSenha incorreta";
           resposta = false;
       }if(ValidaLC.ValidaNome(l.getNome()) == false){
          txt = txt + "\nNome vazio";
           resposta = false;
       }
//       if(ValidaLC.ValidaTelefone(l.getTelefone())== false){
//          txt = txt + "\nTelefone vazio";
//           resposta = false;
//       }
       if(ValidaLC.ValidaEmail(l.getEmail())== false){
          txt = txt + "\nEmail vazio";
           resposta = false;
       }
       
        JOptionPane.showMessageDialog(null, txt);
        return resposta;
    }   
}
