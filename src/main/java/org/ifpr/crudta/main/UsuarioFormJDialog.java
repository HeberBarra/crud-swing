/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.ifpr.crudta.main;

/**
 *
 * @author IFPR
 */
public class UsuarioFormJDialog extends javax.swing.JDialog {

    /**
     * Creates new form UsuarioFormJDialog
     */
    public UsuarioFormJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        painelPrincipal = new javax.swing.JPanel();
        dadosUsuarioLB = new javax.swing.JLabel();
        nomeLB = new javax.swing.JLabel();
        emailLB = new javax.swing.JLabel();
        cpfLB = new javax.swing.JLabel();
        dataNascimentoLB = new javax.swing.JLabel();
        sexoLB = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        dataNascimentoTF = new javax.swing.JFormattedTextField();
        cpfTF = new javax.swing.JFormattedTextField();
        dadosObrigatoriosLB = new javax.swing.JLabel();
        masculinoRB = new javax.swing.JRadioButton();
        femininoRB = new javax.swing.JRadioButton();
        outroRB = new javax.swing.JRadioButton();
        salvarBT = new javax.swing.JButton();
        cancelarBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dadosUsuarioLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadosUsuarioLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadosUsuarioLB.setText("Dados do usuário");

        nomeLB.setText("Nome: *");

        emailLB.setText("E-mail: *");

        cpfLB.setText("CPF: *");

        dataNascimentoLB.setText("Data de nascimento:");

        sexoLB.setText("Sexo:");

        dadosObrigatoriosLB.setForeground(new java.awt.Color(255, 153, 153));
        dadosObrigatoriosLB.setText("* Dados obrigatórios");

        masculinoRB.setText("Masculino");
        masculinoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoRBActionPerformed(evt);
            }
        });

        femininoRB.setText("Feminino");

        outroRB.setText("Outro");
        outroRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outroRBActionPerformed(evt);
            }
        });

        salvarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        salvarBT.setText("Salvar");

        cancelarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-circle.png"))); // NOI18N
        cancelarBT.setText("Cancelar");
        cancelarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dadosUsuarioLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLB, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(nomeLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTF)
                                    .addComponent(nomeTF)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addComponent(dataNascimentoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataNascimentoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(dadosObrigatoriosLB)
                                .addGap(30, 30, 30))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cpfLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(masculinoRB)
                                .addGap(18, 18, 18)
                                .addComponent(femininoRB)
                                .addGap(24, 24, 24)
                                .addComponent(outroRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelarBT)
                                .addGap(18, 18, 18)
                                .addComponent(salvarBT))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(cpfTF)
                                .addContainerGap())))))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosUsuarioLB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLB)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascimentoLB)
                    .addComponent(dataNascimentoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLB)
                    .addComponent(cpfTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoLB)
                    .addComponent(masculinoRB)
                    .addComponent(femininoRB)
                    .addComponent(outroRB))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadosObrigatoriosLB)
                    .addComponent(salvarBT)
                    .addComponent(cancelarBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBTActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_cancelarBTActionPerformed
        this.dispose();
    } // GEN-LAST:event_cancelarBTActionPerformed

    private void outroRBActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_outroRBActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_outroRBActionPerformed

    private void masculinoRBActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_masculinoRBActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_masculinoRBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBT;
    private javax.swing.JLabel cpfLB;
    private javax.swing.JFormattedTextField cpfTF;
    private javax.swing.JLabel dadosObrigatoriosLB;
    private javax.swing.JLabel dadosUsuarioLB;
    private javax.swing.JLabel dataNascimentoLB;
    private javax.swing.JFormattedTextField dataNascimentoTF;
    private javax.swing.JLabel emailLB;
    private javax.swing.JTextField emailTF;
    private javax.swing.JRadioButton femininoRB;
    private javax.swing.JRadioButton masculinoRB;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JRadioButton outroRB;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JButton salvarBT;
    private javax.swing.JLabel sexoLB;
    // End of variables declaration//GEN-END:variables
}
