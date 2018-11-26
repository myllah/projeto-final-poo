
package connection;

import classes.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class testeDAO {
   
    public List<Veiculo> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo INNER JOIN locadora"
                    + "ON veiculo.id_locadora = locadora.id_locadora; ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setId(rs.getInt("id_veiculo"));
                veiculo.setVeiculo(rs.getString("veiculo_tipo"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setPrecoDia(rs.getDouble("precoDia"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setCombustivel(rs.getString("combustivel"));
                veiculo.setMotor(rs.getString("motor"));
                veiculo.setPlaca(rs.getString("placa"));
                
                veiculos.add(veiculo); 
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(testeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return veiculos;

    }
}
