package digytal;

import digytal.dao.CadastroDao;
import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;

import java.sql.SQLException;

public class JDBCApplication {
	public static void main(String[] args) throws SQLException {
		CadastroDao dao = new CadastroDao();
		Cadastro cadastro = new Cadastro();

		cadastro.setNome("Joseph");
		cadastro.setTelefone(59295403l);
		cadastro.setId(2);

		//dao.incluir(cadastro); // teste ok
		//System.out.println(dao.alterar(cadastro)); // teste ok
		//System.out.println(dao.excluir(cadastro.getId()));// teste ok
		dao.listar();
		//System.out.println(dao.buscar(1));// teste ok

	}
}
