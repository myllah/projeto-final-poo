// valida da locadora e cliente
package validacao;

public class ValidaV{
     public static boolean tipoVeiculoVazio(String tipoVeiculo) {
       if(tipoVeiculo.equalsIgnoreCase("Selecione o Veículo")){
           return true;
       }else{
           return false;
       }
    }
     public static boolean marcaVazia(String marca) {
       if(marca.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
     public static boolean modeloVazio(String modelo) {
       if(modelo.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
     public static boolean anoVazio(int ano) {
       if(ano == 0){
           return true;
       }else{
           return false;
       }
    }
     public static boolean precoVazio(double preco) {
       if(preco == 0){
           return true;
       }else{
           return false;
       }
    }
     public static boolean corVazia(String cor) {
       if(cor.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
     public static boolean combustivelVazio(String combustivel) {
       if(combustivel.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
     public static boolean motorVazio(String motor) {
       if(motor.equalsIgnoreCase("Selecione")){
           return true;
       }else{
           return false;
       }
    }
      public static boolean placaVazia(String placa) {
       if(placa.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
}
