package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexaoBD {

	private static final String url = "jdbc:mysql://localhost:3306/grafosa3";
	private static final String user = "root";
	private static final String password = "91234674";
	
	private static Connection conn;
	
	public static Connection getConexaoMySql() {
		
		try {
			if(conn == null) {
				conn = DriverManager.getConnection(url, user, password);
				return conn;
			}else {
				return conn;
			}
			
		} catch (SQLException erro) {
			System.out.println("Error class conexaoBD:" + erro.getMessage());
			return null;
		}
	}

}
