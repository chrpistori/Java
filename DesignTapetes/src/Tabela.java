// Wagner

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela {
	private JTable tabela;
	public JTable getTabela() {
		return tabela;
	}
	private JScrollPane jScrollPane;
	private DefaultTableModel modelo;

	public JScrollPane getJScrollPane() {
		jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(getJTable());
		jScrollPane.setBounds(25, 175, 580, 300);

		return jScrollPane;
	}

	// table properties
	public JTable getJTable() {
		String[] colunas = { "CPF", "Nome", "Sobrenome"};

		Object[][] dados = {};
		modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);
		tabela.getTableHeader().setResizingAllowed(false); // desabilita para arrastar a tabela
		tabela.getTableHeader().setReorderingAllowed(false);
		tabela.getColumnModel().getColumn(0).setMaxWidth(50);
		tabela.getColumnModel().getColumn(1).setMaxWidth(50);

		return tabela;
	}

	public void atualizarTabela() {

		modelo.setNumRows(0); // Zerar tabela

		try {
			ResultSet listaAux = Conexao
					.obterStatement()
					.executeQuery(
							"SELECT  tb_cidades.idcidade, tb_estados.sigla, tb_estados.descricao, tb_cidades.descricao "
									+ "FROM tb_estados "
									+ "INNER JOIN tb_cidades ON tb_estados.idestado = tb_cidades.fk_idestado");

			while (listaAux.next()) {
				modelo.addRow(new Object[] { listaAux.getInt(1),
						listaAux.getString(2), listaAux.getString(3).toUpperCase(),
						listaAux.getString(4) });
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro: Falha na conex�o com o banco de dados: " + e);
		}
	}

	public void deletarDados() {

		int viewRow = tabela.getSelectedRow();

		String colunaId = tabela.getModel().getValueAt(viewRow, 0).toString();
		String txtSql = "delete from tb_cidades where idcidade =" + colunaId
				+ ";";

		try {
			Conexao.obterStatement().executeUpdate(txtSql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public boolean contador(){
		if(tabela.getRowCount()!=0){
			
			return true;
		}
		else{
			return false;
		}
	}

}
