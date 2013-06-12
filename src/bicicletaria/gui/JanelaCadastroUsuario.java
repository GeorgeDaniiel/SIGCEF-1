/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.gui;

import bicicletaria.dao.UsuarioJpaController;
import bicicletaria.modelo.Usuario;
import bicicletaria.negocio.ControladorUsuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//import javax.swing.JOptionPane;


/**
*
* @author George Daniel
*/
public class JanelaCadastroUsuario extends javax.swing.JFrame {
    
    private static Usuario usuario;
    private static ControladorUsuario controladorUsuario = new ControladorUsuario();
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BicicletariaPU");
    private static UsuarioJpaController dao = new UsuarioJpaController(emf);
   
    //List<Usuario> usu = new ArrayList<Usuario>();
    
    public JanelaCadastroUsuario() {
        initComponents();
        //listarUsuarios();
        configurarEventos();
        criarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

		modeloTabela = new DefaultTableModel();
        GrupoSexo = new javax.swing.ButtonGroup();
        panelInformacoesBasicas = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelTipoUsuario = new javax.swing.JLabel();
        textFieldCPF = new javax.swing.JTextField();
		
        try {
            javax.swing.text.MaskFormatter jcpf = new javax.swing.text.MaskFormatter("###.###.###-##");
            textFieldCPF = new javax.swing.JFormattedTextField(jcpf);
        }
        catch (Exception e) {
        }
        labelAnoNascimento = new javax.swing.JLabel();
        textFieldAnoNascimento = new javax.swing.JTextField();
        try {
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            textFieldAnoNascimento = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e) {
        }
        jGerente = new javax.swing.JRadioButton();
        jFuncionario = new javax.swing.JRadioButton();
        panelLoginSenha = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        textFieldLogin = new javax.swing.JTextField();
        jLSenha = new javax.swing.JLabel();
        jLConfirmarSenha = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jConfirmarSenha = new javax.swing.JPasswordField();
        buttonOK = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jExcluir = new javax.swing.JButton();

		tabela.setModel(modeloTabela);
        
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("CPF");
        modeloTabela.addColumn("Data de Nascimento");
        modeloTabela.addColumn("Login");
        modeloTabela.addColumn("Senha");
		
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar usuário");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panelInformacoesBasicas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informações Básicas"));

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNome.setText("Nome: *");

        labelCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCPF.setText("CPF: *");

        labelTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTipoUsuario.setText("Tipo de Usuário: *");

        textFieldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldCPFKeyTyped(evt);
            }
        });

        labelAnoNascimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAnoNascimento.setText("Data de Nascimneto:");

        GrupoSexo.add(jGerente);
        jGerente.setText("Gerente");

        GrupoSexo.add(jFuncionario);
        jFuncionario.setText("Funcionário");

        javax.swing.GroupLayout panelInformacoesBasicasLayout = new javax.swing.GroupLayout(panelInformacoesBasicas);
        panelInformacoesBasicas.setLayout(panelInformacoesBasicasLayout);
        panelInformacoesBasicasLayout.setHorizontalGroup(
            panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesBasicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAnoNascimento)
                    .addComponent(labelNome)
                    .addComponent(labelTipoUsuario))
                .addGroup(panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacoesBasicasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNome)
                            .addGroup(panelInformacoesBasicasLayout.createSequentialGroup()
                                .addComponent(textFieldAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addComponent(labelCPF)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addContainerGap())
                    .addGroup(panelInformacoesBasicasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jGerente)
                        .addGap(18, 18, 18)
                        .addComponent(jFuncionario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelInformacoesBasicasLayout.setVerticalGroup(
            panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesBasicasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnoNascimento)
                    .addComponent(textFieldAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF)
                    .addComponent(textFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoUsuario)
                    .addComponent(jGerente)
                    .addComponent(jFuncionario))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelLoginSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Login e Senha"));

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLogin.setText("Login: *");

        jLSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLSenha.setText("Senha: *");

        jLConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLConfirmarSenha.setText("Confirmar senha: *");

        jConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginSenhaLayout = new javax.swing.GroupLayout(panelLoginSenha);
        panelLoginSenha.setLayout(panelLoginSenhaLayout);
        panelLoginSenhaLayout.setHorizontalGroup(
            panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginSenhaLayout.createSequentialGroup()
                .addGroup(panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginSenhaLayout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(labelLogin)
                            .addGap(18, 18, 18)
                            .addComponent(textFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginSenhaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLConfirmarSenha)
                            .addGap(18, 18, 18)
                            .addComponent(jConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginSenhaLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLSenha)
                        .addGap(18, 18, 18)
                        .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginSenhaLayout.setVerticalGroup(
            panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin)
                    .addComponent(textFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLConfirmarSenha)
                    .addComponent(jConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/Ok.png"))); // NOI18N
        buttonOK.setText("Inserir");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/canc.png"))); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/edit.png"))); // NOI18N
        jEditar.setText("Editar");
        jEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarActionPerformed(evt);
            }
        });
		/*
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Login", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });*/
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/del.png"))); // NOI18N
        jExcluir.setText("Excluir");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelInformacoesBasicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLoginSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInformacoesBasicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed
    
    public String escolheTipo() {
 
        if (jGerente.isSelected()) {
              return "Gerente";
        } else {
             return "Funcionario";
        }
 
}
    
    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        
        usuario = new Usuario();
        usuario.setNome(textFieldNome.getText());
        usuario.setCpf(textFieldCPF.getText());
        usuario.setTipousuario(escolheTipo());
        usuario.setDatanascimento(textFieldAnoNascimento.getText());
        usuario.setLogin(textFieldLogin.getText().toLowerCase());
        usuario.setSenha(jSenha.getText());
        controladorUsuario.inserir(usuario);
        JOptionPane.showMessageDialog(this, controladorUsuario.getMensagem());

        criarTabela();
        limparCampos();
    }//GEN-LAST:event_buttonOKActionPerformed
   
    private void jEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarActionPerformed
        
                  
            Usuario usu = new Usuario();
            usu.setNome(textFieldNome.getText());
            usu.setCpf(textFieldCPF.getText());
            usu.setDatanascimento(textFieldAnoNascimento.getText());
            usu.setLogin(textFieldLogin.getText().toLowerCase());
            usu.setSenha(jSenha.getText());
         
            controladorUsuario.editar(usu);
            limparCampos();
            criarTabela();

    }//GEN-LAST:event_jEditarActionPerformed

    public void configurarEventosTabela(){
 
            int indice = tabela.getSelectedRow();
            //JOptionPane.showMessageDialog(this, indice);
            
            textFieldNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            textFieldCPF.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            textFieldAnoNascimento.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString()); 
            textFieldLogin.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            jSenha.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString()); 
    }
    
    private void configurarEventos(){
        
        //String z = textFieldCPF.getText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        //if(tabela.getValueAt(tabela.getSelectedRow(), 1).toString() != ""){
            tabela.addMouseListener(new MouseAdapter() {
                @Override

                    public void mouseClicked(MouseEvent e){
                        configurarEventosTabela();
                        //configurarTabela();
                    }
            });
        //}
    }
    
    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        
        String cpf = textFieldCPF.getText();
        if(JOptionPane.showConfirmDialog(this, "Deseja excluir esse registro?") == 0){
            controladorUsuario.excluir(cpf);
        }

        limparCampos();
        //listarUsuarios();
        criarTabela();
        
    }//GEN-LAST:event_jExcluirActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
  
    }//GEN-LAST:event_tabelaMouseClicked
    public void confirmarSenha(String x)
    {
        if(jSenha.getText() != x){
            
            JOptionPane.showMessageDialog(this, "A senha não confere; ");
        }
    }
    private void jConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmarSenhaActionPerformed
        
    }//GEN-LAST:event_jConfirmarSenhaActionPerformed

    private void textFieldCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCPFKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
             evt.consume();
        }
    }//GEN-LAST:event_textFieldCPFKeyTyped
    public void limparCampos()
    {
        textFieldNome.setText("");
        textFieldAnoNascimento.setText("");
        textFieldCPF.setText("");
        textFieldLogin.setText("");
        jSenha.setText("");
        jConfirmarSenha.setText("");
    }
   public void criarTabela(){

        List<Usuario> usuario = new ArrayList<Usuario>();
        modeloTabela.setNumRows(0);
        usuario = controladorUsuario.listaUsuario();
        for (Usuario u : usuario) {
            modeloTabela.addRow(new Object[]{u.getNome(), u.getCpf(), u.getDatanascimento(), u.getLogin(), u.getSenha()});
        }  
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaCadastroUsuario().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonOK;
    private javax.swing.JPasswordField jConfirmarSenha;
    private javax.swing.JButton jEditar;
    private javax.swing.JButton jExcluir;
    private javax.swing.JRadioButton jFuncionario;
    private javax.swing.JRadioButton jGerente;
    private javax.swing.JLabel jLConfirmarSenha;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JLabel labelAnoNascimento;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTipoUsuario;
    private javax.swing.JPanel panelInformacoesBasicas;
    private javax.swing.JPanel panelLoginSenha;
    private javax.swing.JTable tabela;
    private DefaultTableModel modeloTabela;
    private javax.swing.JTextField textFieldAnoNascimento;
    private javax.swing.JTextField textFieldCPF;
    private javax.swing.JTextField textFieldLogin;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables
}