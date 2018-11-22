/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Carro;
import classes.Endereco;
import classes.Locadora;
import connection.LocadoraDAO;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import validacao.ValidaLocadora;

/**
 *
 * @author myllah
 */
public class PrincipalLocadora extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalLocadora() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        
     //   jCBMotorMoto.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGCambio = new javax.swing.ButtonGroup();
        BGDirecao = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jPCadastrar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCBVeiculo = new javax.swing.JComboBox<>();
        jLMarca = new javax.swing.JLabel();
        jTFMarca = new javax.swing.JTextField();
        jLModelo = new javax.swing.JLabel();
        jTFModelo = new javax.swing.JTextField();
        jLCor = new javax.swing.JLabel();
        jTFCor = new javax.swing.JTextField();
        jLAno = new javax.swing.JLabel();
        jTFAno = new javax.swing.JTextField();
        jLCombustivel = new javax.swing.JLabel();
        jTFCombustivel = new javax.swing.JTextField();
        jLPreco = new javax.swing.JLabel();
        jTFPreco = new javax.swing.JTextField();
        jLPlaca = new javax.swing.JLabel();
        jTFPlaca = new javax.swing.JTextField();
        jCBMotor = new javax.swing.JComboBox<>();
        jLMotor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jPMeuPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPPesquisar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPSobre = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMMeuPerfil = new javax.swing.JMenu();
        jMCadastrarVeiculo = new javax.swing.JMenu();
        jMPesquisarVeiculos = new javax.swing.JMenu();
        jMSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel1FocusLost(evt);
            }
        });

        jCBVeiculo.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jCBVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o veículo", "Carro", "Motocicleta" }));
        jCBVeiculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBVeiculoFocusLost(evt);
            }
        });
        jCBVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBVeiculoActionPerformed(evt);
            }
        });

        jLMarca.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLMarca.setText("Marca");

        jLModelo.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLModelo.setText("Modelo");

        jLCor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLCor.setText("Cor");

        jLAno.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLAno.setText("Ano");

        jLCombustivel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLCombustivel.setText("Combustível");

        jLPreco.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLPreco.setText("Preço p/ dia");

        jLPlaca.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLPlaca.setText("Placa");

        jTFPlaca.setNextFocusableComponent(cadastrar);

        jCBMotor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jCBMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1.0", "1.4", "1.6", "1.8", "2.0", "a", "b", "c", "d", "e", "f" }));
        jCBMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMotorActionPerformed(evt);
            }
        });

        jLMotor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLMotor.setText("Motor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLAno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLCombustivel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLMotor)
                                                .addComponent(jLPlaca))
                                            .addGap(56, 56, 56)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jCBMotor, 0, 287, Short.MAX_VALUE)
                                                .addComponent(jTFPlaca))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLCor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLPreco)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLModelo)
                                    .addComponent(jLMarca))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFModelo)
                                    .addComponent(jTFMarca))))
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jCBVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMarca)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLModelo)
                    .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreco)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAno)
                    .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCor)
                    .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCombustivel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMotor))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPlaca))
                .addGap(25, 25, 25))
        );

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Veículo", "Marca", "Modelo", "Preço", "Ano", "Cor", "Combustível", "Motor", "Placa"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        excluir.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        excluir.setText("EXCLUIR");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        atualizar.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        atualizar.setText("ATUALIZAR");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrar)
                .addGap(18, 18, 18)
                .addComponent(atualizar)
                .addGap(18, 18, 18)
                .addComponent(excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(atualizar)
                    .addComponent(excluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPCadastrarLayout = new javax.swing.GroupLayout(jPCadastrar);
        jPCadastrar.setLayout(jPCadastrarLayout);
        jPCadastrarLayout.setHorizontalGroup(
            jPCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPCadastrarLayout.setVerticalGroup(
            jPCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPCadastrarLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPCadastrar, "cadastrar");

        jLabel1.setText("meu perfil");

        javax.swing.GroupLayout jPMeuPerfilLayout = new javax.swing.GroupLayout(jPMeuPerfil);
        jPMeuPerfil.setLayout(jPMeuPerfilLayout);
        jPMeuPerfilLayout.setHorizontalGroup(
            jPMeuPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMeuPerfilLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(1070, Short.MAX_VALUE))
        );
        jPMeuPerfilLayout.setVerticalGroup(
            jPMeuPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMeuPerfilLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPMeuPerfil, "meuPerfil");

        jLabel3.setText("pesquisar veiculo");

        javax.swing.GroupLayout jPPesquisarLayout = new javax.swing.GroupLayout(jPPesquisar);
        jPPesquisar.setLayout(jPPesquisarLayout);
        jPPesquisarLayout.setHorizontalGroup(
            jPPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesquisarLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel3)
                .addContainerGap(1038, Short.MAX_VALUE))
        );
        jPPesquisarLayout.setVerticalGroup(
            jPPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesquisarLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel3)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPPesquisar, "pesquisar");

        jLabel4.setText("sobre");

        javax.swing.GroupLayout jPSobreLayout = new javax.swing.GroupLayout(jPSobre);
        jPSobre.setLayout(jPSobreLayout);
        jPSobreLayout.setHorizontalGroup(
            jPSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSobreLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel4)
                .addContainerGap(1073, Short.MAX_VALUE))
        );
        jPSobreLayout.setVerticalGroup(
            jPSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSobreLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPSobre, "sobre");

        jMMeuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon25.png"))); // NOI18N
        jMMeuPerfil.setText("Meu perfil");
        jMMeuPerfil.setToolTipText("");
        jMMeuPerfil.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMMeuPerfil.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jMMeuPerfil.setRolloverEnabled(true);
        jMMeuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMMeuPerfilMouseClicked(evt);
            }
        });
        jMenuBar.add(jMMeuPerfil);

        jMCadastrarVeiculo.setText("Cadastrar/Atualizar/Excluir Veículos");
        jMCadastrarVeiculo.setContentAreaFilled(false);
        jMCadastrarVeiculo.setFocusable(false);
        jMCadastrarVeiculo.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMCadastrarVeiculo.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jMCadastrarVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMCadastrarVeiculoMouseClicked(evt);
            }
        });
        jMenuBar.add(jMCadastrarVeiculo);

        jMPesquisarVeiculos.setText("Pesquisar Veículo");
        jMPesquisarVeiculos.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMPesquisarVeiculos.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jMPesquisarVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMPesquisarVeiculosMouseClicked(evt);
            }
        });
        jMenuBar.add(jMPesquisarVeiculos);

        jMSobre.setText("Sobre");
        jMSobre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMSobre.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jMSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSobreMouseClicked(evt);
            }
        });
        jMenuBar.add(jMSobre);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMMeuPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMMeuPerfilMouseClicked
        CardLayout cl = (CardLayout) jPanelPrincipal.getLayout();
        cl.show(jPanelPrincipal, "meuPerfil");
        jMMeuPerfil.setSelected(false);
    }//GEN-LAST:event_jMMeuPerfilMouseClicked

    private void jMCadastrarVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMCadastrarVeiculoMouseClicked
        CardLayout cl = (CardLayout) jPanelPrincipal.getLayout();
        cl.show(jPanelPrincipal, "cadastrar");
        jMCadastrarVeiculo.setSelected(false);
    }//GEN-LAST:event_jMCadastrarVeiculoMouseClicked

    private void jMPesquisarVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMPesquisarVeiculosMouseClicked
        CardLayout cl = (CardLayout) jPanelPrincipal.getLayout();
        cl.show(jPanelPrincipal, "pesquisar");
        jMPesquisarVeiculos.setSelected(false);
    }//GEN-LAST:event_jMPesquisarVeiculosMouseClicked

    private void jMSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSobreMouseClicked
        CardLayout cl = (CardLayout) jPanelPrincipal.getLayout();
        cl.show(jPanelPrincipal, "sobre");
        jMSobre.setSelected(false);
       
    }//GEN-LAST:event_jMSobreMouseClicked

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
        DefaultTableModel a = (DefaultTableModel) jTable1.getModel();
 
            Object[] dados = { 

                jCBVeiculo.getSelectedItem(),
                jTFMarca.getText(),
                jTFModelo.getText(), 
                jTFPreco.getText(),
                jTFAno.getText(),
                jTFCor.getText(),
                jTFCombustivel.getText(),
                jCBMotor.getSelectedItem(),      
                jTFPlaca.getText()
                    
            };
          
            a.addRow(dados); 
            
             testar();
                
          limpar();
       
    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        
        if(jTable1.getSelectedRow() != -1){

            DefaultTableModel a = (DefaultTableModel) jTable1.getModel();
            a.removeRow(jTable1.getSelectedRow());
        }
        limpar();
    }//GEN-LAST:event_excluirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        
            if(jTable1.getSelectedRow() != -1){
                    jCBVeiculo.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    jTFMarca.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    jTFModelo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    jTFPreco.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                    jTFAno.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                    jTFCor.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
                    jTFCombustivel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                    jCBMotor.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
                    jTFPlaca.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
        
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
            
       
            if(jTable1.getSelectedRow() != -1){
                jTable1.setValueAt(jCBVeiculo.getSelectedItem(),jTable1.getSelectedRow(), 0);
                jTable1.setValueAt(jTFMarca.getText(),jTable1.getSelectedRow(), 1);
                jTable1.setValueAt(jTFModelo.getText(),jTable1.getSelectedRow(), 2);
                jTable1.setValueAt(jTFPreco.getText(),jTable1.getSelectedRow(), 3);
                jTable1.setValueAt(jTFAno.getText(),jTable1.getSelectedRow(), 4);
                jTable1.setValueAt(jTFCor.getText(),jTable1.getSelectedRow(), 5);
                jTable1.setValueAt(jTFCombustivel.getText(),jTable1.getSelectedRow(), 6);
                jTable1.setValueAt(jCBMotor.getSelectedItem(),jTable1.getSelectedRow(), 7);
                jTable1.setValueAt(jTFPlaca.getText(),jTable1.getSelectedRow(), 8);
       }
            
        limpar();
    }//GEN-LAST:event_atualizarActionPerformed

    private void jCBMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMotorActionPerformed

    private void jCBVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBVeiculoActionPerformed

    }//GEN-LAST:event_jCBVeiculoActionPerformed

    private void jPanel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusLost
      
    }//GEN-LAST:event_jPanel1FocusLost

    private void jCBVeiculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBVeiculoFocusLost

    }//GEN-LAST:event_jCBVeiculoFocusLost

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
            java.util.logging.Logger.getLogger(PrincipalLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalLocadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalLocadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGCambio;
    private javax.swing.ButtonGroup BGDirecao;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JComboBox<String> jCBMotor;
    private javax.swing.JComboBox<String> jCBVeiculo;
    private javax.swing.JLabel jLAno;
    private javax.swing.JLabel jLCombustivel;
    private javax.swing.JLabel jLCor;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLMotor;
    private javax.swing.JLabel jLPlaca;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMCadastrarVeiculo;
    private javax.swing.JMenu jMMeuPerfil;
    private javax.swing.JMenu jMPesquisarVeiculos;
    private javax.swing.JMenu jMSobre;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPCadastrar;
    private javax.swing.JPanel jPMeuPerfil;
    private javax.swing.JPanel jPPesquisar;
    private javax.swing.JPanel jPSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFCombustivel;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTextField jTFPreco;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void limpar(){

        jCBMotor.setSelectedIndex(0);
        jCBVeiculo.setSelectedIndex(0);

        BGCambio.clearSelection();
        BGDirecao.clearSelection();
        
        jTFAno.setText(null);
        jTFCombustivel.setText(null);
        jTFCor.setText(null);
        jTFMarca.setText(null);
        jTFModelo.setText(null);
        jTFPreco.setText(null);
        jTFPlaca.setText(null);

    }
    
      public void testar(){
        
        Carro c = new Carro();
        
        c.setMarca(jTFMarca.getText());
        c.setPlaca(jTFPlaca.getText());
        c.setModelo(jTFModelo.getText());
        c.setAno(Integer.parseInt(jTFAno.getText()));
        c.setPrecoDia(Double.parseDouble(jTFPreco.getText()));
        c.setMotor((String) jCBMotor.getSelectedItem());
        c.setCombustivel(jTFCombustivel.getText());
        c.setCor(jTFCor.getText());
       
            
    }

}
