
package connection;

import classes.Cliente;
import classes.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    public void create(Cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome,senha,telefone,email,cpf) VALUES(?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getCpf());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo cm sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
     public Cliente getLogin(String email, String senha) {

        Connection con = ConnectionFactory.getConnection();
           Cliente c = new Cliente();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            stmt = con.prepareStatement("SELECT * FROM cliente WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setSenha(rs.getString("senha"));
      
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return c;

    }
     
      public boolean checkLogin(String email, String senha) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM cliente WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
               
      
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
             return check;
        }

    }
      
       public void update(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente "
                    + "SET nome = ? ,email = ? ,telefone = ? ,senha = ? "
                    + "WHERE id_cliente = ?");
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getSenha());  
            stmt.setInt(5, c.getId());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
