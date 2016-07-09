package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDao {

	public static void InserirProfessor(int matricula, String nome, String cpf, String sexo) {
		PreparedStatement statement = DAO.criarConexao("INSERT INTO PROFESSOR VALUES(?, ?, ?, ?)");
		
		try {
			statement.setInt(1, matricula);		//Seta os parametros do SQL
			statement.setString(2, nome);
			statement.setString(3, cpf);
			statement.setString(4, sexo);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			DAO.executarInstrucaoSql(statement);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public static void AlterarProfessor(int matricula, String nome, String cpf, String sexo) {
		PreparedStatement statement = DAO.criarConexao("UPDATE PROFESSOR"
													 + "		SET NOME = ?,"
													 + "			CPF = ?,"
													 + "			SEXO = ?"
													 + "  WHERE MATRICULA = ? ");
		
		try {				
			statement.setString(1, nome);		//Seta os parametros do SQL
			statement.setString(2, cpf);
			statement.setString(3, sexo);
			statement.setInt(4, matricula);	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			DAO.executarInstrucaoSql(statement);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ExcluirProfessor(int matricula){
		PreparedStatement statement = DAO.criarConexao("DELETE PROFESSOR WHERE MATRICULA = ?");

		try {			
		
		statement.setInt(1, matricula);		//Seta os parametros do SQL
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		try {
		DAO.executarInstrucaoSql(statement);
		} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
