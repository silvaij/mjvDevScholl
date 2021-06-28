package digytal;

import digytal.dao.CadastroDao;
import digytal.dao.ClienteDao;
import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;
import digytal.model.Cliente;

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
		//dao.listar();
		//System.out.println(dao.buscar(1));// teste ok

		Cliente cliente = new Cliente(1986,"PF","null","312.956.280-07","14.119.193-4",
				"(87) 2846-5438","beatrizelianeduarte@hormail.com","Contadora","56508-130","PE",
				"Arcoverde","Rua Projetada 06","905","nenhum","Boa Esperança",
				"https://www.instagram.com/larimirela/?hl=pt");
		ClienteDao cdao = new ClienteDao();
		cdao.incluirRegistroBd(cliente);


	}
}
