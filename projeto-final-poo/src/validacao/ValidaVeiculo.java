
package validacao;

import classes.Veiculo;
import exception.NegativeValueException;
import javax.swing.JOptionPane;

public class ValidaVeiculo {
 
    public static boolean validaCadastro(Veiculo v) {

        boolean resposta = false;
        String txt = null;
        
       if(ValidaV.tipoVeiculoVazio(v.getVeiculo()) == true){
            if(txt == null){
               txt = "\nTipo de veículo vazio";
           }else{
               txt = txt + "\nTipo de veículo vazio";
           }
           resposta = true;
       }
       
       if(ValidaV.marcaVazia(v.getMarca())== true){
            if(txt == null){
               txt = "\nMarca vazia";
           }else{
               txt = txt + "\nMarca vazia";
           }
           resposta = true;
       }
       if(ValidaV.modeloVazio(v.getModelo()) == true){
            if(txt == null){
               txt = "\nModelo vazio";
           }else{
               txt = txt + "\nModelo vazio";
           }
           resposta = true;
       }
       if(v.getAno() < 0){
           throw new NegativeValueException();
       }
       if(ValidaV.anoVazio(v.getAno()) == true){
            if(txt == null){
               txt = "\nAno vazio";
           }else{
               txt = txt + "\nAno vazio";
           }
           resposta = true;
       }
       if(v.getPrecoDia()< 0){
           throw new NegativeValueException();
       }
       if(ValidaV.precoVazio(v.getPrecoDia())== true){
           if(txt == null){
               txt = "\nPreço por dia vazio";
           }else{
               txt = txt + "\nPreço por dia vazio";
           }
           resposta = true;
       }
       if(ValidaV.corVazia(v.getCor())== true){
           if(txt == null){
               txt = "\nCor vazia";
           }else{
               txt = txt + "\nCor vazia";
           }
           resposta = true;
       }
       if(ValidaV.combustivelVazio(v.getCombustivel())== true){
           if(txt == null){
               txt = "\nCombustível vazio";
           }else{
               txt = txt + "\nCombustível vazio";
           }
           resposta = true;
       } 
        if(ValidaV.motorVazio(v.getMotor())== true){
            if(txt == null){
               txt = "\nMotor vazio";
           }else{
               txt = txt + "\nMotor vazio";
           }
           resposta = true;
       } 
       if(ValidaV.placaVazia(v.getPlaca()) == true){
           if(txt == null){
               txt = "\nPlaca vazia";
           }else{
               txt = txt + "\nPlaca vazia";
           }
           resposta = true;
       }
       
       if(txt != null){
           JOptionPane.showMessageDialog(null, txt);
       }
        
        return resposta;
    }
    
}