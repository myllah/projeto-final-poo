
package exception;

import javax.swing.JOptionPane;

public class InexistentException extends RuntimeException{
    
     public InexistentException() {
        super("Você está pesquisando algo que não existe");
        JOptionPane.showMessageDialog(null, "Você está pesquisando algo que não existe");
    }


}