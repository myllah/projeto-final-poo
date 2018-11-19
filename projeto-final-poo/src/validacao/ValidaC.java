// Valida só da locadora
package validacao;

import java.util.InputMismatchException;

public class ValidaC {
  
   public static boolean cpfVazio(String cpf) {
       if(cpf.equalsIgnoreCase("  .   .   .    -  ")){
            return true;
       }else{
           return false;
       }
    }
   
  public static boolean validaCpf(String cpf) {
    return false;
    }
}