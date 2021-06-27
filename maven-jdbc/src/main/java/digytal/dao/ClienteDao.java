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
            instrucaoSql.setCharacterStream(2,cliente.getPf_pj());
            instrucaoSql.setString(3,cliente.getRazao_social());
            instrucaoSql.setString(4,cliente.getCnpj_cpf());
            instrucaoSql.setInt(5,cliente.getCodigo_serial());
            instrucaoSql.setInt(6,cliente.getCodigo_serial());
            instrucaoSql.setInt(7,cliente.getCodigo_serial());
            instrucaoSql.setInt(8,cliente.getCodigo_serial());
            instrucaoSql.setInt(9,cliente.getCodigo_serial());
            instrucaoSql.setInt(10,cliente.getCodigo_serial());
            instrucaoSql.setInt(11,cliente.getCodigo_serial());
            instrucaoSql.setInt(12,cliente.getCodigo_serial());
            instrucaoSql.setInt(13,cliente.getCodigo_serial());
            instrucaoSql.setInt(14,cliente.getCodigo_serial());
            instrucaoSql.setInt(15,cliente.getCodigo_serial());
            instrucaoSql.setInt(16,cliente.getCodigo_serial());

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
