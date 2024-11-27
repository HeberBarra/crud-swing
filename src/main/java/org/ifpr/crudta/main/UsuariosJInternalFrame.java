/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.ifpr.crudta.main;

import org.ifpr.crudta.usuario.Usuario;
import org.ifpr.crudta.usuario.UsuarioTableModel;

import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author IFPR
 */
public class UsuariosJInternalFrame extends javax.swing.JInternalFrame implements WindowListener {

    private UsuarioFormJDialog usuarioFormJDialog;
    private UsuarioTableModel usuarioTableModel;

    /**
     * Creates new form UsuariosJInternalFrame
     */
    public UsuariosJInternalFrame(JFrame parent) {
        usuarioFormJDialog = new UsuarioFormJDialog(parent, true);
        usuarioFormJDialog.addWindowListener(this);
        usuarioTableModel = new UsuarioTableModel();
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

        usuarioPanel = new javax.swing.JPanel();
        pesquisarPanel = new javax.swing.JPanel();
        nomeLB = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        pesquisarBT = new javax.swing.JButton();
        limparBT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        novoBT = new javax.swing.JButton();
        editarBT = new javax.swing.JButton();
        removerBT = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        usuariosTB = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Gerenciamento de Usuários");

        pesquisarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        nomeLB.setText("Nome:");

        pesquisarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        pesquisarBT.setText("Pesquisar");

        limparBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        limparBT.setText("Limpar");

        javax.swing.GroupLayout pesquisarPanelLayout = new javax.swing.GroupLayout(pesquisarPanel);
        pesquisarPanel.setLayout(pesquisarPanelLayout);
        pesquisarPanelLayout.setHorizontalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisarPanelLayout.createSequentialGroup()
                        .addComponent(nomeLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTF))
                    .addGroup(pesquisarPanelLayout.createSequentialGroup()
                        .addComponent(pesquisarBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limparBT)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pesquisarPanelLayout.setVerticalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparBT)
                    .addComponent(pesquisarBT)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        novoBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-circle.png"))); // NOI18N
        novoBT.setText("Novo");
        novoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBTActionPerformed(evt);
            }
        });

        editarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editarBT.setText("Editar");
        editarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTActionPerformed(evt);
            }
        });

        removerBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus-circle.png"))); // NOI18N
        removerBT.setText("Remover");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerBT)
                .addContainerGap(561, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoBT)
                    .addComponent(editarBT)
                    .addComponent(removerBT))
                .addContainerGap())
        );

        usuariosTB.setModel(usuarioTableModel);
        usuariosTB.setCellSelectionEnabled(true);
        jScrollPane3.setViewportView(usuariosTB);

        javax.swing.GroupLayout usuarioPanelLayout = new javax.swing.GroupLayout(usuarioPanel);
        usuarioPanel.setLayout(usuarioPanelLayout);
        usuarioPanelLayout.setHorizontalGroup(
            usuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        usuarioPanelLayout.setVerticalGroup(
            usuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTActionPerformed
        usuarioFormJDialog.setVisible(true);
    }//GEN-LAST:event_editarBTActionPerformed

    private void novoBTActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton3ActionPerformed
        usuarioFormJDialog.setUsuario(new Usuario());
        usuarioFormJDialog.setVisible(true);
    } // GEN-LAST:event_jButton3ActionPerformed

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {
        usuarioTableModel.atualizarTabela();
    }

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarBT;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limparBT;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JButton novoBT;
    private javax.swing.JButton pesquisarBT;
    private javax.swing.JPanel pesquisarPanel;
    private javax.swing.JButton removerBT;
    private javax.swing.JPanel usuarioPanel;
    private javax.swing.JTable usuariosTB;
    // End of variables declaration//GEN-END:variables
}
