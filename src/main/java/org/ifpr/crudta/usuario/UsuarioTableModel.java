package org.ifpr.crudta.usuario;

import org.ifpr.crudta.usuario.dao.UsuarioDAO;
import javax.swing.table.AbstractTableModel;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UsuarioTableModel extends AbstractTableModel {

    private final UsuarioDAO usuarioDAO;
    private final List<Usuario> usuarios;
    private final String[] columnNames;

    public UsuarioTableModel() {
        this.usuarioDAO = new UsuarioDAO();
        this.usuarios = usuarioDAO.listLastTwenty();
        this.columnNames = new String[]{"ID", "NOME", "E-MAIL", "CPF", "DATA DE NASCIMENTO", "SEXO"};
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);

        if (columnIndex == 0) {
            return usuario.getId();
        }

        if (columnIndex == 1) {
            return usuario.getNome();
        }

        if (columnIndex == 2) {
            return usuario.getEmail();
        }

        if (columnIndex == 3) {
            return usuario.getCpf();
        }

        if (columnIndex == 4) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return usuario.getDataNascimento().format(dateTimeFormatter);
        }

        if (columnIndex == 5) {
            return usuario.getSexoPessoa();
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
