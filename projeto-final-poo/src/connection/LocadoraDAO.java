/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import classes.Locadora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author myllah
 */
public class LocadoraDAO {
    
    public void create(Locadora l){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO locadora (nome,telefone,email,cnpj) VALUES(?,?,?,?)");
        
            stmt.setString(1, l.getNome());
          //  stmt.setString(1, l.getSenha());
            stmt.setString(2, l.getTelefone());
            stmt.setString(3, l.getEmail());
            stmt.setString(4, l.getCnpj());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo cm sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar: "+ex);
       } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
