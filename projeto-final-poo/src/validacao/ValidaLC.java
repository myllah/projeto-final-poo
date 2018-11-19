// valida da locadora e cliente
package validacao;

public class ValidaLC{
    

     public static boolean nomeVazio(String nome) {
       if(nome.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
     public static boolean telefoneVazio(String telefone) {
       if(telefone.equals("(  )       -    ")){
           return true;
       }else{
           return false;
       }
    }
      public static boolean emailVazio(String email) {
       if(email.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
       public static boolean validaSenha(char[] senha) {
       if(senha.length < 6 || senha.length > 12){
           return true;
       }else{
           return false;
       }
    }
}
