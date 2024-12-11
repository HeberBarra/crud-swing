/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.ifpr.crudta.main;

import org.ifpr.crudta.usuario.SexoPessoa;
import org.ifpr.crudta.usuario.Usuario;
import org.ifpr.crudta.usuario.dao.UsuarioDAO;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

/**
 *
 * @author IFPR
 */
public class UsuarioFormJDialog extends javax.swing.JDialog {

    private final DateTimeFormatter dateTimeFormatter;
    private final UsuarioDAO usuarioDAO;
    private final Border bordaOriginal;
    private final Border bordaErro;
    private Usuario usuario;

    /**
     * Creates new form UsuarioFormJDialog
     */
    public UsuarioFormJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        usuarioDAO = new UsuarioDAO();
        bordaOriginal = nomeTF.getBorder();
        bordaErro = BorderFactory.createLineBorder(Color.RED);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoGrupoRB = new javax.swing.ButtonGroup();
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

        try {
            dataNascimentoTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpfTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dadosObrigatoriosLB.setForeground(new java.awt.Color(255, 153, 153));
        dadosObrigatoriosLB.setText("* Dados obrigatórios");

        sexoGrupoRB.add(masculinoRB);
        masculinoRB.setText("Masculino");
        masculinoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoRBActionPerformed(evt);
            }
        });

        sexoGrupoRB.add(femininoRB);
        femininoRB.setText("Feminino");

        sexoGrupoRB.add(outroRB);
        outroRB.setText("Outro");
        outroRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outroRBActionPerformed(evt);
            }
        });

        salvarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        salvarBT.setText("Salvar");
        salvarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBTActionPerformed(evt);
            }
        });

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
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dataNascimentoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailLB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(nomeLB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dataNascimentoTF)
                                    .addComponent(nomeTF))))
                        .addContainerGap())
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(cpfLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dadosObrigatoriosLB)
                                    .addComponent(sexoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelarBT)
                                .addGap(18, 18, 18)
                                .addComponent(salvarBT))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cpfTF)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(masculinoRB)
                                        .addGap(25, 25, 25)
                                        .addComponent(femininoRB)
                                        .addGap(18, 18, 18)
                                        .addComponent(outroRB, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
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

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void objectToForm() {
        nomeTF.setText(usuario.getNome());
        emailTF.setText(usuario.getEmail());
        cpfTF.setText(usuario.getCpf());
        dataNascimentoTF.setText(usuario.getDataNascimento().format(dateTimeFormatter));

        SexoPessoa sexoPessoa = usuario.getSexoPessoa();
        for (Enumeration<AbstractButton> abstractButtonEnumeration = sexoGrupoRB.getElements(); abstractButtonEnumeration.hasMoreElements();) {
            AbstractButton abstractButton = abstractButtonEnumeration.nextElement();

            if (abstractButton.getText().toUpperCase().equals(sexoPessoa.toString())) {
                abstractButton.setSelected(true);
            }
        }

    }

    public void formToObject() {
        usuario.setNome(nomeTF.getText());
        usuario.setEmail(emailTF.getText());
        usuario.setCpf(cpfTF.getText());
        usuario.setDataNascimento(LocalDate.parse(dataNascimentoTF.getText(), dateTimeFormatter));

        for (Enumeration<AbstractButton> abstractButtonEnumeration = sexoGrupoRB.getElements(); abstractButtonEnumeration.hasMoreElements();) {
            AbstractButton abstractButton = abstractButtonEnumeration.nextElement();

            if (abstractButton.isSelected()) {
                usuario.setSexoPessoa(SexoPessoa.valueOf(abstractButton.getText().toUpperCase()));
            }

        }
    }

    private void salvarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBTActionPerformed
        if (!isFormValid()) {
            JOptionPane.showMessageDialog(this, "Formulário inválido, por favor verifique os campos em vermelho.", "ERRO DE VALIDAÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        formToObject();

        if (usuario.getId() == 0) {
            usuarioDAO.create(usuario);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            usuarioDAO.update(usuario);
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        }

        this.dispose();
    }//GEN-LAST:event_salvarBTActionPerformed

    private boolean isFormValid() {
        boolean isValid = true;

        if (nomeTF.getText().strip().isBlank()) {
            nomeTF.setBorder(bordaErro);
            isValid = false;
        } else {
            nomeTF.setBorder(bordaOriginal);
        }

        if (emailTF.getText().strip().isBlank()) {
            emailTF.setBorder(bordaErro);
            isValid = false;
        } else {
            emailTF.setBorder(bordaOriginal);
        }

        if (cpfTF.getText().strip().isBlank()) {
            cpfTF.setBorder(bordaErro);
            isValid = false;
        } else {
            cpfTF.setBorder(bordaOriginal);
        }

        if (cpfTF.getText().strip().length() != 14) {
            cpfTF.setBorder(bordaErro);
            isValid = false;
        } else {
            cpfTF.setBorder(bordaOriginal);
        }

        return isValid;
    }

    public void limparCampos() {
        nomeTF.setText("");
        nomeTF.setBorder(bordaOriginal);
        emailTF.setText("");
        emailTF.setBorder(bordaOriginal);
        cpfTF.setText("");
        cpfTF.setValue(null);
        cpfTF.setBorder(bordaOriginal);
        dataNascimentoTF.setText("");
        dataNascimentoTF.setValue(null);
        dataNascimentoTF.setBorder(bordaOriginal);
        sexoGrupoRB.clearSelection();
    }

    private void cancelarBTActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_cancelarBTActionPerformed
        this.dispose();
        limparCampos();
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
    private javax.swing.ButtonGroup sexoGrupoRB;
    private javax.swing.JLabel sexoLB;
    // End of variables declaration//GEN-END:variables
}
