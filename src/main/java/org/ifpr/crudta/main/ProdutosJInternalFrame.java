/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.ifpr.crudta.main;

import org.ifpr.crudta.produto.Produto;
import org.ifpr.crudta.produto.ProdutoTableModel;
import org.ifpr.crudta.produto.dao.ProdutoDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author IFPR
 */
public class ProdutosJInternalFrame extends javax.swing.JInternalFrame implements WindowListener {

    private ProdutoDAO produtoDAO;
    private ProdutoFormJDialog produtoFormJDialog;
    private ProdutoTableModel produtoTableModel;

    /**
     * Creates new form ProdutosJInternalFrame
     */
    public ProdutosJInternalFrame(JFrame parent) {
        this.produtoFormJDialog = new ProdutoFormJDialog(parent, true);
        produtoFormJDialog.addWindowListener(this);
        this.produtoDAO = new ProdutoDAO();
        this.produtoTableModel = new ProdutoTableModel();
        initComponents();
        editarBT.setEnabled(false);
        removerBT.setEnabled(false);
        produtosTB.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        produtosTB.getTableHeader().setReorderingAllowed(false);
        produtosTB.getTableHeader().setResizingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        produtosPanel = new javax.swing.JPanel();
        pesquisarPanel = new javax.swing.JPanel();
        nomeLB = new javax.swing.JLabel();
        pesquisarNomeTF = new javax.swing.JTextField();
        pesquisarBT = new javax.swing.JButton();
        limparBT = new javax.swing.JButton();
        botoesPanel = new javax.swing.JPanel();
        editarBT = new javax.swing.JButton();
        removerBT = new javax.swing.JButton();
        novoBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosTB = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gerenciamento de Produtos");

        pesquisarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        nomeLB.setText("Nome:");

        pesquisarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        pesquisarBT.setText("Pesquisar");
        pesquisarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBTActionPerformed(evt);
            }
        });

        limparBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        limparBT.setText("Limpar");
        limparBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisarPanelLayout = new javax.swing.GroupLayout(pesquisarPanel);
        pesquisarPanel.setLayout(pesquisarPanelLayout);
        pesquisarPanelLayout.setHorizontalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisarPanelLayout.createSequentialGroup()
                        .addComponent(pesquisarBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparBT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pesquisarPanelLayout.createSequentialGroup()
                        .addComponent(nomeLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarNomeTF)))
                .addContainerGap())
        );
        pesquisarPanelLayout.setVerticalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB)
                    .addComponent(pesquisarNomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limparBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        botoesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        editarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editarBT.setText("Editar");
        editarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTActionPerformed(evt);
            }
        });

        removerBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus-circle.png"))); // NOI18N
        removerBT.setText("Remover");
        removerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTActionPerformed(evt);
            }
        });

        novoBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-circle.png"))); // NOI18N
        novoBT.setText("Novo");
        novoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesPanelLayout = new javax.swing.GroupLayout(botoesPanel);
        botoesPanel.setLayout(botoesPanelLayout);
        botoesPanelLayout.setHorizontalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(novoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoesPanelLayout.setVerticalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        produtosTB.setModel(produtoTableModel);
        produtosTB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                produtosTBFocusLost(evt);
            }
        });
        produtosTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produtosTB);

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesquisarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                .addContainerGap())
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pesquisarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produtosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(produtosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBTActionPerformed
        String nomeParaPesquisa = pesquisarNomeTF.getText().strip();
        produtoTableModel.pesquisarPorNome(nomeParaPesquisa);
    }//GEN-LAST:event_pesquisarBTActionPerformed

    private void produtosTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosTBMouseClicked
        if (produtosTB.getSelectedRow() != -1) {
            editarBT.setEnabled(true);
            removerBT.setEnabled(true);
        } else {
            editarBT.setEnabled(false);
            removerBT.setEnabled(false);
        }
    }//GEN-LAST:event_produtosTBMouseClicked

    private void novoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBTActionPerformed
        produtoFormJDialog.limparCampos();
        produtoFormJDialog.setProduto(new Produto());
        produtoFormJDialog.setVisible(true);
    }//GEN-LAST:event_novoBTActionPerformed

    private void limparBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBTActionPerformed
        produtoTableModel.atualizarTabela();
        pesquisarNomeTF.setText("");
        pesquisarNomeTF.requestFocus();
    }//GEN-LAST:event_limparBTActionPerformed

    private void editarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTActionPerformed
        int selectedRow = produtosTB.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        int id = (int) produtosTB.getValueAt(selectedRow, 0);
        Produto produto = produtoDAO.findById(id);
        produtoFormJDialog.setProduto(produto);
        produtoFormJDialog.objectToForm();
        produtoFormJDialog.setVisible(true);
    }//GEN-LAST:event_editarBTActionPerformed

    private void removerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTActionPerformed
        int selectedRow = produtosTB.getSelectedRow();
        int id = (int) produtosTB.getValueAt(selectedRow, 0);

        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja apagar o produto de ID: %d".formatted(id), "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirmacao == JOptionPane.YES_OPTION) {
            Produto produto = produtoDAO.findById(id);
            produtoDAO.delete(produto);
            produtoTableModel.atualizarTabela();
            JOptionPane.showMessageDialog(this, "Produto apagado com sucesso");
        }
    }//GEN-LAST:event_removerBTActionPerformed

    private void produtosTBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_produtosTBFocusLost
        if (produtosTB.getSelectedRow() == -1) {
            editarBT.setEnabled(false);
            removerBT.setEnabled(false);
        }
    }//GEN-LAST:event_produtosTBFocusLost

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {
        produtoTableModel.atualizarTabela();
        editarBT.setEnabled(false);
        removerBT.setEnabled(false);
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
    private javax.swing.JPanel botoesPanel;
    private javax.swing.JButton editarBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparBT;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JButton novoBT;
    private javax.swing.JButton pesquisarBT;
    private javax.swing.JTextField pesquisarNomeTF;
    private javax.swing.JPanel pesquisarPanel;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JTable produtosTB;
    private javax.swing.JButton removerBT;
    // End of variables declaration//GEN-END:variables
}
