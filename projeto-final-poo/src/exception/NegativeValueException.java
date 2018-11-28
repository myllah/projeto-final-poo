
package exception;

import javax.swing.JOptionPane;

public class NegativeValueException extends RuntimeException{
    
     public NegativeValueException() {
        super("Valor Negativo Não é Permitido.");
        JOptionPane.showMessageDialog(null, "Valor Negativo Não é Permitido.");
    }


}