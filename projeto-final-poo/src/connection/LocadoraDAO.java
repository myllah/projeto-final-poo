
package connection;
import classes.Locadora;
import exception.InexistentException;
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
            
            stmt = con.prepareStatement("INSERT INTO locadora (cnpj,nome,senha,telefone,email)"
                    + " VALUES(?,?,?,?,?)");
            stmt.setString(1, l.getCnpj());
            stmt.setString(2, l.getNome());
            stmt.setString(3, l.getSenha());
            stmt.setString(4, l.getTelefone());
            stmt.setString(5, l.getEmail());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
     public List<Locadora> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locadora> locadoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM locadora");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Locadora locadora = new Locadora();

                locadora.setId(rs.getInt("id_locadora"));
                locadora.setCnpj(rs.getString("cnpj"));
                locadora.setNome(rs.getString("nome"));
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
    
     public List<Locadora> readForIdLocadora(int idLocadora) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locadora> locadoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM locadora WHERE id_locadora LIKE ?");
            stmt.setString(1, "%"+idLocadora+"%");
            
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
            
            if(locadoras.isEmpty()){
                throw new InexistentException();
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return locadoras;

    }

     public List<Locadora> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locadora> locadoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM locadora WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
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
            
             if(locadoras.isEmpty()){
                throw new InexistentException();
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return locadoras;

    }

      public List<Locadora> readForCnpj(String cnpj) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locadora> locadoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM locadora WHERE cnpj LIKE ?");
            stmt.setString(1, "%"+cnpj+"%");
            
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

             if(locadoras.isEmpty()){
                throw new InexistentException();
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return locadoras;
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
  
    public void delete(int id) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM locadora WHERE id_locadora = ?");
            stmt.setInt(1, id);

            stmt.executeUpdate();
            
            stmt = con.prepareStatement("DELETE FROM veiculo WHERE id_locadora = ?");
            stmt.setInt(1, id);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
