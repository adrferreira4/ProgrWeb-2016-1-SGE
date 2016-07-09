package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DisciplinaDao {

	public static void InserirDisciplina(int codigo, String nome){
		PreparedStatement statement = DAO.criarConexao("INSERT INTO DISCIPLINA VALUES(?, ?)");
		
		try {
			statement.setInt(1, codigo);		//Seta os parametros do SQL
			statement.setString(2, nome);
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

	public static void AlterarDisciplina(int codigo, String nome) {
		PreparedStatement statement = DAO.criarConexao("UPDATE DISCIPLINA SET NOME = ?"
											 + "WHERE CODIGO = ?");
		
		try {			
			statement.setString(1, nome); 	//Seta os parametros do SQL
			statement.setInt(2, codigo);
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

	public static void ExlcuirDisciplina(int codigo) {
		
		PreparedStatement statement = DAO.criarConexao("DELETE DISCIPLINA WHERE CODIGO = ?");

		try {
		statement.setInt(1, codigo);		//Seta os parametros do SQL
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
