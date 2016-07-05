package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDao {
	
	public static void InserirAluno(int matricula, String nome, int serie)  {
		PreparedStatement statement = DAO.criarConexao("INSERT INTO ALUNO VALUES(?, ?, ?");
		
		try {
			statement.setInt(1, matricula);		//Seta os parametros do SQL
			statement.setString(2, nome);
			statement.setInt(3, serie);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			DAO.executarInstrucaoSql(statement);
		} catch (Throwable e) {
			//Ocorreu um erro
			e.printStackTrace();
		}				
	}
	
	
	
	public static void AlterarAluno(int matricula, String nome, int serie)  {
		PreparedStatement statement = DAO.criarConexao("ALTER ALUNO SET (?, ?, ?");
		
		try {
			statement.setInt(1, matricula);		//Seta os parametros do SQL
			statement.setString(2, nome);
			statement.setInt(3, serie);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			DAO.executarInstrucaoSql(statement);
		} catch (Throwable e) {
			//Ocorreu um erro
			e.printStackTrace();
		}				
	}

}
