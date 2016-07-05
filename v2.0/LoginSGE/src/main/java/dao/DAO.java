package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {

	private static final String URL = "jdbc:derby:db;create=true";
	private static Connection conexaoComOBanco;
	
	public static PreparedStatement criarConexao(String sql){
		try {
			conexaoComOBanco = DriverManager.getConnection(URL);
			return conexaoComOBanco.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void executarInstrucaoSql(PreparedStatement statement){
		try {
			statement.executeUpdate();
			statement.close();
			conexaoComOBanco.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
