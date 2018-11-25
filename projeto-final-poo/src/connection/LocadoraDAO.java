
package connection;

import classes.Locadora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LocadoraDAO {
    
    public void create(Locadora l){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO everyone (nome,senha,telefone,email) VALUES(?,?,?,?)");
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getSenha());
            stmt.setString(3, l.getTelefone());
            stmt.setString(4, l.getEmail());
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("INSERT INTO locadora (cnpj) VALUES(?)");
            stmt.setString(1, l.getCnpj());
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("INSERT INTO endereco (cidade,estado,bairro) VALUES(?,?,?)");
            stmt.setString(1, l.getEndereco().getCidade());
            stmt.setString(2, l.getEndereco().getEstado());
            stmt.setString(3, l.getEndereco().getBairro());
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "salvo cm sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
