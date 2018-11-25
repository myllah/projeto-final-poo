
package connection;

import classes.Carro;
import classes.Locadora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CarroDAO {
    
    public void create(Carro c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO veiculo (marca,placa,modelo,ano,precoDia,motor,combustivel,cor)"
                    + " VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getMarca());
            stmt.setString(2, c.getPlaca());
            stmt.setString(3, c.getModelo());
            stmt.setInt(4, c.getAno());
            stmt.setDouble(5, c.getPrecoDia());
            stmt.setString(6, c.getMotor());
            stmt.setString(7, c.getCombustivel());
            stmt.setString(8, c.getCor());
            stmt.executeUpdate();
                          
            JOptionPane.showMessageDialog(null, "salvo cm sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
