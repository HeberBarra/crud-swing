package org.ifpr.crudta.produto;

import org.ifpr.crudta.produto.dao.ProdutoDAO;

import javax.swing.table.AbstractTableModel;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ProdutoTableModel extends AbstractTableModel {

    private DateTimeFormatter dateTimeFormatter;
    private ProdutoDAO produtoDAO;
    private String[] columnNames;
    private List<Produto> produtos;

    public ProdutoTableModel() {
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.produtoDAO = new ProdutoDAO();
        this.columnNames = new String[]{"ID", "NOME", "MARCA", "DATA FABRICAÇÃO", "PREÇO"};
        this.produtos = produtoDAO.listLastTwenty();
    }

    public void atualizarTabela() {
        produtos = produtoDAO.listLastTwenty();
        fireTableDataChanged();
    }

    public void pesquisarPorNome(String nome) {
        produtos = produtoDAO.searchByName(nome);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);

        if (columnIndex == 0) {
            return produto.getId();
        }

        if (columnIndex == 1) {
            return produto.getNome();
        }

        if (columnIndex == 2) {
            return produto.getMarca();
        }

        if (columnIndex == 3) {
            return dateTimeFormatter.format(produto.getDataFabricacao());
        }

        if (columnIndex == 4) {
            return produto.getPreco();
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
