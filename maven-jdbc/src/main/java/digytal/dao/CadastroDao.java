package digytal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;

public class CadastroDao {
	private Connection conexaoBd;
	private static final String INSERT_CADASTRO_SQL = "insert into tab_cadastro (nome,telefone) values (?,?);";
	private static final String UPDATE_CADASTRO_SQL = "update tab_cadastro set nome = ?, telefone = ? where id = ?;";
	private static final String DELETE_USERS_SQL = "delete from tab_cadastro where id = ?;";
	private static final String SELECT_ALL_USERS = "select * from tab_cadastro";
	private static  final String SELECT_BY_ID = "select * from tab_cadastro where id = ?";

	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		conexaoBd = fc.criarConexao();
	}

	public void incluir(Cadastro cadastro) {
		try {
			//String sql= "INSERT INTO mjv_db.tab_cadastro (nome,telefone) VALUES (?,?);";
			PreparedStatement st = conexaoBd.prepareStatement(INSERT_CADASTRO_SQL);
			st.setString(1, cadastro.getNome());
			st.setLong(2, cadastro.getTelefone());
			st.execute();
			st.close();
			System.out.println("Registro Inserido");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//IMPLEMENTAR
	public boolean alterar(Cadastro cadastro) {
		boolean linhaAtualizada = false;
		try(PreparedStatement instrucaoSql = conexaoBd.prepareStatement(UPDATE_CADASTRO_SQL);){
			instrucaoSql.setString(1,cadastro.getNome());
			instrucaoSql.setLong(2,cadastro.getTelefone());
			instrucaoSql.setInt(3,cadastro.getId());
			linhaAtualizada=instrucaoSql.executeUpdate()>0;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return linhaAtualizada;
	}

	public boolean excluir(int id) throws SQLException {
		boolean linhaDeletada;
		try (PreparedStatement instrucaoSql = conexaoBd.prepareStatement(DELETE_USERS_SQL);){
			instrucaoSql.setInt(1,id);
			linhaDeletada = instrucaoSql.executeUpdate() > 0;
		}
		return linhaDeletada;
	}

	public List<Cadastro> listar() {
		List<Cadastro> lista = new ArrayList<Cadastro>();
		try {
			PreparedStatement instrucaoSql = conexaoBd.prepareStatement(SELECT_ALL_USERS);
			ResultSet rs = instrucaoSql.executeQuery();
			while(rs.next()) {
				Cadastro cadastro = new Cadastro();
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				Long telefone = rs.getLong("telefone");
				cadastro.setId(id);
				cadastro.setNome(nome);
				cadastro.setTelefone(telefone) ;
				lista.add(cadastro);
			}
			for (Cadastro cad:lista) {
				System.out.println(cad.getId()+"|"+cad.getNome()+"|"+cad.getTelefone());
			}
			instrucaoSql.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public Cadastro buscar(int id) {
		Cadastro cad = null;
		try {
			PreparedStatement instrucaoSql = conexaoBd.prepareStatement(SELECT_BY_ID);
			instrucaoSql.setInt(1,id);
			ResultSet rs = instrucaoSql.executeQuery();
			while(rs.next()){
				cad = new Cadastro();
				cad.setId(rs.getInt("id"));
				cad.setNome(rs.getString("nome"));
				cad.setTelefone(rs.getLong("telefone"));
			}

		}catch (SQLException e){
			e.printStackTrace();
		}

		return cad;
	}
}
