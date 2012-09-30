// Wagner

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
	
	public static List<Estado> listarEstados() {
		List<Estado> lista = new ArrayList<Estado>(0);
				StringBuilder sb = new StringBuilder("select * from tb_estados");

		try {
			ResultSet listaAux = Conexao.obterStatement().executeQuery(sb.toString());
			
			while (listaAux.next()) {
				lista.add(new Estado(listaAux.getInt("idestado"), listaAux.getString("sigla"), listaAux.getString("descricao")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public static List<Cidade> listarCidades() {
		List<Cidade> lista = new ArrayList<Cidade>(0);
		StringBuilder sb = new StringBuilder("select * from tb_cidades");
		
		try {
			ResultSet listaAux = Conexao.obterStatement().executeQuery(sb.toString());
			
			while (listaAux.next()) {
				lista.add(new Cidade(listaAux.getInt("idcidade"), listaAux.getString("descricao"), listaAux.getString("fk_idestado")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
