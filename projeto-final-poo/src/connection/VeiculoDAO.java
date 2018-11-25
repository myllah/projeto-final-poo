
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

public class VeiculoDAO {
    
    public void create(Veiculo v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO veiculo (veiculo_tipo,marca,modelo,precoDia,ano,cor,combustivel,motor,placa)"
                    + " VALUES(?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, v.getVeiculo());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getModelo());
            stmt.setDouble(4, v.getPrecoDia());
            stmt.setInt(5, v.getAno());
            stmt.setString(6, v.getCor());
            stmt.setString(7, v.getCombustivel());
            stmt.setString(8, v.getMotor());
            stmt.setString(9, v.getPlaca());           
            
            stmt.executeUpdate();
                          
            JOptionPane.showMessageDialog(null, "Salvo cm sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<Veiculo> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo");
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
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return veiculos;

    }
    public List<Veiculo> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
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
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return veiculos;

    }

    public void update(Veiculo v) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculo "
                    + "SET veiculo_tipo = ?, marca = ? ,modelo = ? ,precoDia = ? ,ano = ?, "
                    + "cor = ? ,combustivel = ? ,motor = ? ,placa = ? "
                    + "WHERE id_veiculo = ?");
            
            stmt.setString(1, v.getVeiculo());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getModelo());
            stmt.setDouble(4, v.getPrecoDia());
            stmt.setInt(5, v.getAno());
            stmt.setString(6, v.getCor());
            stmt.setString(7, v.getCombustivel());
            stmt.setString(8, v.getMotor());
            stmt.setString(9, v.getPlaca());   
            stmt.setInt(10, v.getId());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Veiculo v) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM veiculo WHERE id_veiculo = ?");
            stmt.setInt(1, v.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}
