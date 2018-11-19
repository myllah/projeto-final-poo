
package validacao;

import classes.Cliente;
import javax.swing.JOptionPane;
////////////////////////////////////faalta só o telefone e cpf

public class ValidaCliente {

    public boolean validaCadastro(Cliente c) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaLC.ValidaNome(c.getNome()) == false){
          txt = "\nNome vazio";
           resposta = false;
       }if(ValidaLC.ValidaEmail(c.getEmail()) == false){
          txt = txt + "\nEmail vazio";
           resposta = false;
       }if(ValidaC.validaCpf(c.getCpf()) == false){
          txt = txt + "\nCPF incorreto";
           resposta = false;
       }
       //       if(ValidaLC.ValidaTelefone(c.getTelefone())== false){
//          txt = txt + "\nTelefone vazio";
//           resposta = false;
//       }
       if(ValidaLC.ValidaSenha(c.getSenha()) == false){
          txt = txt + "\nSenha incorreta";
           resposta = false;
       }

        JOptionPane.showMessageDialog(null, txt);
        return resposta;
    }   
}
