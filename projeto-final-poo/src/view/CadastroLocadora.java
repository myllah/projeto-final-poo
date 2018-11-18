
package view;

import classes.Locadora;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import validacao.ValidaLocadora;

public class CadastroLocadora extends javax.swing.JFrame {

    public CadastroLocadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preencha = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLCnpj = new javax.swing.JLabel();
        cnpj = new javax.swing.JFormattedTextField();
        jLTelefone = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        jLEstado = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLCidade = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLBairro = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLRua = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        jLSenha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Locadora");
        setResizable(false);

        preencha.setBackground(new java.awt.Color(109, 142, 200));
        preencha.setForeground(new java.awt.Color(176, 140, 140));

        jLabel20.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel20.setText("Preencha os campos abaixo!!");

        javax.swing.GroupLayout preenchaLayout = new javax.swing.GroupLayout(preencha);
        preencha.setLayout(preenchaLayout);
        preenchaLayout.setHorizontalGroup(
            preenchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preenchaLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(162, 162, 162))
        );
        preenchaLayout.setVerticalGroup(
            preenchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preenchaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(70, 70, 70))
        );

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(266, 253));

        jLNome.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLNome.setText("Nome");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLEmail.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLEmail.setText("E-mail");

        jLCnpj.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLCnpj.setText("CNPJ");

        try {
            cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###.####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjActionPerformed(evt);
            }
        });

        jLTelefone.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLTelefone.setText("Telefone");

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLEstado.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLEstado.setText("Estado");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLCidade.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLCidade.setText("Cidade");

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });

        jLBairro.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLBairro.setText("Bairro");

        jLRua.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLRua.setText("Rua");

        rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaActionPerformed(evt);
            }
        });

        jLSenha.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLSenha.setText("Senha");

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(estado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(rua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome)
                            .addComponent(jLEmail)
                            .addComponent(jLCnpj))
                        .addGap(30, 30, 30)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(cnpj)
                            .addComponent(nome)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTelefone)
                            .addComponent(jLCidade)
                            .addComponent(jLRua)
                            .addComponent(jLSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rua)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(telefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEstado)
                                    .addComponent(jLBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bairro)
                                    .addComponent(estado)))))))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(cadastrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEmail)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCnpj))
                        .addGap(7, 7, 7)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefone)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jLBairro)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRua)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrar)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preencha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(preencha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
        if(teste()){
            this.dispose();
            new PrincipalLocadora().setVisible(true);
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLocadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cnpj;
    private javax.swing.JTextField email;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JPanel preencha;
    private javax.swing.JTextField rua;
    private javax.swing.JPasswordField senha;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
   
    public boolean teste(){
        
        Locadora l = new Locadora();

        l.setNome(nome.getText());
        l.setSenha(senha.getPassword());
        l.setTelefone(telefone.getText());
        l.setEmail(email.getText());
        l.setCnpj(cnpj.getText());
        
        ValidaLocadora vl = new ValidaLocadora();
        if(vl.validaCadastro(l)){
            return true;
        }else{
            return false;
        }

    }
}