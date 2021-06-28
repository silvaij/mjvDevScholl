package digytal.dao;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    private Connection conBd = null;
    private static final String INSERT_CADASTRO_SQL = "insert into tab_cliente (codigo_serial,pf_pj,razao_social,cnpj_cpf,inscr_estadual_rg ,telefone1,email,ativ_profissao,cep,estado,cidade,rua,numero,complemento,bairro,site_instagram)\n " +
            "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    private static final String UPDATE_CADASTRO_SQL = "update tab_cliente set nome = ?, telefone = ? where id = ?;";
    private static final String DELETE_USERS_SQL = "delete from tab_cliente where id = ?;";
    private static final String SELECT_ALL_USERS = "select * from tab_cliente";
    private static  final String SELECT_BY_ID = "select * from tab_cliente where id = ?";

    public ClienteDao(){
        FabricaConexao conexaoBd = new FabricaConexao();
        conBd = conexaoBd.criarConexao();
    }

    public void incluirRegistroBd(Cliente cliente){
        try{
            PreparedStatement instrucaoSql = conBd.prepareStatement(INSERT_CADASTRO_SQL);
            instrucaoSql.setInt(1,cliente.getCodigo_serial());
            instrucaoSql.setString(2,cliente.getPf_pj());
            instrucaoSql.setString(3,cliente.getRazao_social());
            instrucaoSql.setString(4,cliente.getCnpj_cpf());
            instrucaoSql.setString(5,cliente.getInscr_estadual_rg());
            instrucaoSql.setString(6,cliente.getTelefone1());
            instrucaoSql.setString(7,cliente.getEmail());
            instrucaoSql.setString(8,cliente.getAtiv_profissao());
            instrucaoSql.setString(9,cliente.getCep());
            instrucaoSql.setString(10,cliente.getEstado());
            instrucaoSql.setString(11,cliente.getCidade());
            instrucaoSql.setString(12,cliente.getRua());
            instrucaoSql.setString(13,cliente.getNumero());
            instrucaoSql.setString(14,cliente.getComplemento());
            instrucaoSql.setString(15,cliente.getBairro());
            instrucaoSql.setString(16,cliente.getSite_instagem());
            instrucaoSql.execute();
            instrucaoSql.close();
            System.out.println("Registro Inserido");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
