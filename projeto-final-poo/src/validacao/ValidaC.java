// Valida só da locadora
package validacao;

public class ValidaC {
    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
  
   public static boolean cpfVazio(String cpf) {
       if(cpf.equalsIgnoreCase("  .   .   .    -  ")){
            return true;
       }else{
           return false;
       }
    }
   
  public static boolean validaCpf(String cpf) {
      
      // if ((cpf==null) || (cpf.length()!=11)) return true;

//      Integer digito1;
//      
//      int soma = 0;
//      for (int indice=cpf.substring(0,9).length()-1, digito; indice >= 0; indice-- ) {
//         digito = Integer.parseInt(cpf.substring(0,9).substring(indice,indice+1));
//         soma += digito*pesoCPF[pesoCPF.length-cpf.substring(0,9).length()+indice];
//      }
//      soma = 11 - soma % 11;
//      digito1 =  soma > 9 ? 0 : soma;
//      
//      Integer digito2;
//      
//      soma = 0;
//      for (int indice=(cpf.substring(0,9) + digito1).length()-1, digito; indice >= 0; indice-- ) {
//         digito = Integer.parseInt((cpf.substring(0,9) + digito1).substring(indice,indice+1));
//         soma += digito*pesoCPF[pesoCPF.length-(cpf.substring(0,9) + digito1).length()+indice];
//      }
//      soma = 11 - soma % 11;
//      digito2 =  soma > 9 ? 0 : soma;
      
     // return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
      
      //desativando ValidaCPF
      return false;
   }
}