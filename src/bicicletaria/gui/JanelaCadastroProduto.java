/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.gui;

import bicicletaria.modelo.Produto;
import bicicletaria.negocio.ControladorProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author George
 */
public class JanelaCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCadastroProduto
     */
    private static Produto produto = new Produto();
    private static ControladorProduto controladorProduto = new ControladorProduto();
    
    public JanelaCadastroProduto() {
        initComponents();
		criarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

		modeloTabela = new DefaultTableModel();
        jPanel1 = new javax.swing.JPanel();
        PainelCampos = new javax.swing.JPanel();
        jLProduto = new javax.swing.JLabel();
        jTDescricao = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jLPrecoCompra = new javax.swing.JLabel();
        jTPrecoCompra = new javax.swing.JTextField();
        jLPrecoVenda = new javax.swing.JLabel();
        jTPrecoVenda = new javax.swing.JTextField();
        jLQuantidade = new javax.swing.JLabel();
        jTQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPainelBotoes = new javax.swing.JPanel();
        jBInserir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
		
		tabela.setModel(modeloTabela);
        
        modeloTabela.addColumn("Descrição");
        modeloTabela.addColumn("Código");
        modeloTabela.addColumn("Preço de Compra");
        modeloTabela.addColumn("Preço de Venda");
        modeloTabela.addColumn("Quantidade");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PainelCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLProduto.setText("Descrição");

        jLCodigo.setText("Código:");

        jLPrecoCompra.setText("Preço de Compra: ");

        jLPrecoVenda.setText("Preço de Venda: ");

        jLQuantidade.setText("Quantidade");

        javax.swing.GroupLayout PainelCamposLayout = new javax.swing.GroupLayout(PainelCampos);
        PainelCampos.setLayout(PainelCamposLayout);
        PainelCamposLayout.setHorizontalGroup(
            PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCamposLayout.createSequentialGroup()
                        .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLPrecoVenda)
                            .addComponent(jLQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelCamposLayout.createSequentialGroup()
                        .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCamposLayout.createSequentialGroup()
                                .addComponent(jLCodigo)
                                .addGap(18, 18, 18))
                            .addGroup(PainelCamposLayout.createSequentialGroup()
                                .addComponent(jLPrecoCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCamposLayout.createSequentialGroup()
                                .addComponent(jLProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        PainelCamposLayout.setVerticalGroup(
            PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProduto)
                    .addComponent(jTDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecoCompra)
                    .addComponent(jTPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecoVenda)
                    .addComponent(jTPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidade)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

		/*
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Código", "Preço Compra", "Preço Venda", "Quant"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
		*/
        jScrollPane1.setViewportView(tabela);

        jBInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/Ok.png"))); // NOI18N
        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/edit.png"))); // NOI18N
        jBEditar.setText("Editar");

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/del.png"))); // NOI18N
        jBExcluir.setText("Excluir");

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/canc.png"))); // NOI18N
        jBCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPainelBotoesLayout = new javax.swing.GroupLayout(jPainelBotoes);
        jPainelBotoes.setLayout(jPainelBotoesLayout);
        jPainelBotoesLayout.setHorizontalGroup(
            jPainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPainelBotoesLayout.setVerticalGroup(
            jPainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelBotoesLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPainelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
            
        produto = new Produto();
        produto.setDescricao(jTDescricao.getText());
        produto.setCodigo(Long.parseLong(jTCodigo.getText()));
        produto.setPrecocompra(Float.parseFloat(jTPrecoCompra.getText())); 
        produto.setPrecovenda(Float.parseFloat(jTPrecoVenda.getText()));
        produto.setQuantidade(Integer.parseInt(jTQuantidade.getText()));
        
        
        JOptionPane.showMessageDialog(this, controladorProduto.getMensagem());
        controladorProduto.inserir(produto);
    }//GEN-LAST:event_jBInserirActionPerformed

    /**
     * @param args the command line arguments
     */
	 
     public void criarTabela(){

            List<Produto> produto = new ArrayList<>();
            modeloTabela.setNumRows(0);
            produto = controladorProduto.listaProduto();
            for (Produto p : produto) {
                modeloTabela.addRow(new Object[]{p.getDescricao(), p.getCodigo(), p.getPrecocompra(), p.getPrecovenda(), p.getQuantidade()});
            }  
    }
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
            java.util.logging.Logger.getLogger(JanelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastroProduto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCampos;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLPrecoCompra;
    private javax.swing.JLabel jLPrecoVenda;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JPanel jPainelBotoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDescricao;
    private javax.swing.JTextField jTPrecoCompra;
    private javax.swing.JTextField jTPrecoVenda;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTable tabela;
	private DefaultTableModel modeloTabela;
    // End of variables declaration//GEN-END:variables
}
