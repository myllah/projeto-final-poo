
package connection;
import classes.Locadora;
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

public class LocadoraDAO {
    
    public void create(Locadora l){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO locadora (cnpj) VALUES(?)");
            stmt.setString(1, l.getCnpj());
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getSenha());
            stmt.setString(3, l.getTelefone());
            stmt.setString(4, l.getEmail());
            stmt.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "salvo cm sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
//     public List<Locadora> read() {
//
//        Connection con = ConnectionFactory.getConnection();
//        
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        List<Locadora> locadoras = new ArrayList<>();
//
//        try {
//            stmt = con.prepareStatement("SELECT * FROM locadora INNER JOIN everyone");
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//
//                Locadora locadora = new Locadora();
//
//                locadora.setIdEveryone(rs.getInt("id_everyone"));
//                locadora.setIdLocadora(rs.getInt("id_locadora"));
//                //locadora.setIdLocadora(rs.getInt("id_endereco"));
//                locadora.setCnpj(rs.getString("cnpj"));
//                locadora.setNome(rs.getString("nome"));
//                
//                
//                locadoras.add(locadora); 
//     
//                
//            }
            
            //    private Endereco endereco;
//      private int id;
//    private String nome;
//    private String senha;
//    private String telefone;
//    private String email;

//        } catch (SQLException ex) {
//            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt, rs);
//        }
//
//        return locadoras;
//
//    }
    public List<Veiculo> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo WHERE marca LIKE ?");
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

     public List<Locadora> readForDescLocadora(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locadora> locadoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM locadora WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Locadora locadora = new Locadora();
                locadora.setNome(rs.getString("nome"));
                locadora.setId(rs.getInt("id_locadora"));
                locadora.setCnpj(rs.getString("cnpj"));
                locadora.setSenha(rs.getString("senha"));
                locadora.setTelefone(rs.getString("telefone"));
                locadora.setEmail(rs.getString("email"));
                
                locadoras.add(locadora);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return locadoras;

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
    
    public Locadora getLogin(String email, String senha) {

        Connection con = ConnectionFactory.getConnection();
        Locadora l = new Locadora();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            stmt = con.prepareStatement("SELECT * FROM locadora WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                l.setId(rs.getInt("id_locadora"));
                l.setNome(rs.getString("nome"));
                l.setEmail(rs.getString("email"));
                l.setTelefone(rs.getString("telefone"));
                l.setSenha(rs.getString("senha"));
                
      
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return l;

    }
    public boolean checklogin(String email, String senha) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM locadora WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                
                check = true;
      
            }

        } catch (SQLException ex) {
            Logger.getLogger(LocadoraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
      public void update(Locadora l) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE locadora "
                    + "SET nome = ? ,email = ? ,telefone = ? ,senha = ? "
                    + "WHERE id_locadora = ?");
            
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getEmail());
            stmt.setString(3, l.getTelefone());
            stmt.setString(4, l.getSenha());  
            stmt.setInt(5, l.getId());
            
            stmt.executeUpdate();
 

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
