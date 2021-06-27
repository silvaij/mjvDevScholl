package digytal.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    private String url = "jdbc:mysql://localhost:3306/mjv_db?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "Asc@z125";
    public Connection criarConexao() {
		Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
	}
}
