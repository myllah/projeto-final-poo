// valida da locadora e cliente
package validacao;

public class ValidaLC{
     public static boolean ValidaSenha(char[] senha) {
       if(senha.length < 6 || senha.length > 12){
           return false;
       }else{
           return true;
       }
    }
     public static boolean ValidaNome(String nome) {
       if(nome.isEmpty()){
           return false;
       }else{
           return true;
       }
    }
     //n dá certo, acho q por causa da máscara
//     public static boolean ValidaTelefone(String telefone) {
//       if(telefone.isEmpty()){
//           return false;
//       }else{
//           return true;
//       }
//    }
      public static boolean ValidaEmail(String email) {
       if(email.isEmpty()){
           return false;
       }else{
           return true;
       }
    }
}
