package Interface.Produto;

import Banco.ProdutoDAO;
import Interface.*;
import Controle.GerenciaProduto;
import Model.Produto;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AlterarProduto extends javax.swing.JDialog {

    GerenciaProduto gp;
    ProdutoDAO proDAO = new ProdutoDAO();
    Produto produto;

    public AlterarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AlterarProduto(javax.swing.JDialog parent, boolean modal, Produto produto) {
        super(parent, modal);
        initComponents();
        this.produto = produto;
        this.gp = gp;
        mostrar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbAviso = new javax.swing.JLabel();
        JCBoxUva = new javax.swing.JComboBox<>();
        tfNome = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        tfPaisOrigem = new javax.swing.JTextField();
        tfCodigoBarras = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbTipoUva = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbPaisOrigem = new javax.swing.JLabel();
        lbCodigoBarras = new javax.swing.JLabel();
        lbTipoVinho = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        closeIcon = new javax.swing.JLabel();
        JCBoxVinho = new javax.swing.JComboBox<>();
        tfEstoque = new javax.swing.JTextField();
        lbCodigoBarras1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroProduto.setBackground(new java.awt.Color(0, 0, 51));
        CadastroProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CadastroProduto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CadastroProdutoComponentShown(evt);
            }
        });
        CadastroProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALTERAÇÃO DE PRODUTO");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 360, 43));

        lbAviso.setForeground(new java.awt.Color(255, 255, 255));
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroProduto.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        JCBoxUva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Aglianico", "Barbera", "Bobal", "Cabernet", "Sauvignon", "Cape Riesling", "Chardonnay", "Corte Bordalês", "Dolcetto", "Gamay", "Grenache", "Grillo", "Malbec", "Merlot", "Monastrell", "Montepulciano", "Nero D'Avola", "Petit Verdot", "Pinot Grigio", "Pinot Noir", "Primitivo", "Sangiovese", "Sauvignon Blanc", "Syrah", "Tannat", "Tempranillo", "Trebbiano", "Várias Uvas", "Viognier" }));
        JCBoxUva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBoxUvaActionPerformed(evt);
            }
        });
        CadastroProduto.add(JCBoxUva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 300, 30));

        tfNome.setNextFocusableComponent(tfPreco);
        CadastroProduto.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 300, 29));

        tfPreco.setNextFocusableComponent(tfCodigoBarras);
        CadastroProduto.add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, 29));
        CadastroProduto.add(tfPaisOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 300, 29));
        CadastroProduto.add(tfCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 300, 29));

        lbNome.setDisplayedMnemonic('n');
        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setLabelFor(lbNome);
        lbNome.setText(" NOME*:");
        CadastroProduto.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        lbTipoUva.setDisplayedMnemonic('t');
        lbTipoUva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoUva.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoUva.setText("TIPO DE UVA*:");
        CadastroProduto.add(lbTipoUva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 20));

        lbPreco.setDisplayedMnemonic('p');
        lbPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPreco.setForeground(new java.awt.Color(255, 255, 255));
        lbPreco.setLabelFor(tfPreco);
        lbPreco.setText("PREÇO*:");
        CadastroProduto.add(lbPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        lbPaisOrigem.setDisplayedMnemonic('a');
        lbPaisOrigem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPaisOrigem.setForeground(new java.awt.Color(255, 255, 255));
        lbPaisOrigem.setLabelFor(tfPaisOrigem);
        lbPaisOrigem.setText("PAÍS DE ORIGEM*:");
        CadastroProduto.add(lbPaisOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        lbCodigoBarras.setDisplayedMnemonic('c');
        lbCodigoBarras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigoBarras.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoBarras.setLabelFor(tfCodigoBarras);
        lbCodigoBarras.setText("ESTOQUE*:");
        CadastroProduto.add(lbCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        lbTipoVinho.setDisplayedMnemonic('I');
        lbTipoVinho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoVinho.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoVinho.setText("TIPO DE VINHO*:");
        CadastroProduto.add(lbTipoVinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        btnFechar.setBackground(new java.awt.Color(255, 255, 255));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-32.png"))); // NOI18N
        btnFechar.setText("Cancelar");
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 140, 60));

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        btnConfirmar.setText("Alterar");
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 60));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-apagar-32.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setFocusPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        btnLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimparKeyPressed(evt);
            }
        });
        CadastroProduto.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 140, 60));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        JCBoxVinho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Tinto", "Branco", "Espumante Branco", "Espumante Rosé", "Fortificado", "Rosé", "Vários tipos" }));
        JCBoxVinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBoxVinhoActionPerformed(evt);
            }
        });
        CadastroProduto.add(JCBoxVinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 300, 30));
        CadastroProduto.add(tfEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 300, 29));

        lbCodigoBarras1.setDisplayedMnemonic('c');
        lbCodigoBarras1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigoBarras1.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoBarras1.setLabelFor(tfCodigoBarras);
        lbCodigoBarras1.setText("CÓDIGO DE BARRAS*:");
        CadastroProduto.add(lbCodigoBarras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (!tfNome.getText().isEmpty()) {
            if (!tfPreco.getText().isEmpty()) {
                if (!tfCodigoBarras.getText().isEmpty()) {
                    if (!JCBoxUva.getItemAt(JCBoxUva.getSelectedIndex()).equals("- Selecione -")) {
                        if (!tfPaisOrigem.getText().isEmpty()) {
                            if (!JCBoxVinho.getItemAt(JCBoxVinho.getSelectedIndex()).equals("- Selecione -")) {
                               
                                int opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente alterar o Produto?");

                                if (JOptionPane.YES_OPTION == opcao) {                                   
                                    
                                    produto.setNome(tfNome.getText());
                                    produto.setPreco(Double.parseDouble(tfPreco.getText()));
                                    produto.setEstoque(Integer.parseInt(tfEstoque.getText()));
                                    produto.setTipoUva(JCBoxUva.getItemAt(JCBoxUva.getSelectedIndex()));
                                    produto.setPaisOrigem(tfPaisOrigem.getText());
                                    produto.setTipoVinho(JCBoxVinho.getItemAt(JCBoxVinho.getSelectedIndex()));
                                    proDAO.alterarProduto(produto);

                                    JOptionPane.showMessageDialog(rootPane, "Produto alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                                    this.dispose();
                                } else if (JOptionPane.NO_OPTION == opcao) {
                                    JOptionPane.showMessageDialog(rootPane, "Produto não alterado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                                    this.dispose();
                                } 

                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Campo País de Origem obrigatório!");
                                tfCodigoBarras.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Uva obrigatório!");
                            JCBoxUva.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Código de Barras obrigatório!");
                        tfPaisOrigem.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Preço obrigatório!");
                    JCBoxVinho.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Nome obrigatório!");
                tfNome.requestFocus();
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown

    }//GEN-LAST:event_CadastroProdutoComponentShown

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed

    }//GEN-LAST:event_btnLimparKeyPressed

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void JCBoxUvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBoxUvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBoxUvaActionPerformed

    private void JCBoxVinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBoxVinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBoxVinhoActionPerformed

    public void limpaCampos() {
        tfNome.setText(null);
        tfPreco.setText(null);
        tfCodigoBarras.setText(null);
        tfPaisOrigem.setText(null);
        JCBoxUva.setSelectedIndex(0);
        JCBoxVinho.setSelectedIndex(0);
    }

    public void habilitaCampos(boolean status) {
        tfNome.setEnabled(status);
        tfPreco.setEnabled(status);
        tfCodigoBarras.setEnabled(status);
        tfPaisOrigem.setEnabled(status);
    }

    public void mostrar() {

        tfNome.setText(produto.getNome());

        tfPreco.setText(String.valueOf(produto.getPreco()));

        tfCodigoBarras.setText(produto.getCodigoBarras());

        tfPaisOrigem.setText(produto.getPaisOrigem());

        JCBoxUva.setSelectedItem(produto.getTipoUva());

        JCBoxVinho.setSelectedItem(produto.getTipoVinho());

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientebackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlterarProduto dialog = new AlterarProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.JComboBox<String> JCBoxUva;
    private javax.swing.JComboBox<String> JCBoxVinho;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbCodigoBarras;
    private javax.swing.JLabel lbCodigoBarras1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPaisOrigem;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipoUva;
    private javax.swing.JLabel lbTipoVinho;
    private javax.swing.JTextField tfCodigoBarras;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPaisOrigem;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
