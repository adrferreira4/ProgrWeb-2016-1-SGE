package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TurmaDao {

	public static void InserirTurma(int codigo, int Matr_Prof, int serie, int ano){
		
		PreparedStatement statement = DAO.criarConexao("INSERT INTO TURMA VALUES(?, ?, ?, ?)");
		
		try {
			statement.setInt(1, codigo);		//Seta os parametros do SQL
			statement.setInt(2, Matr_Prof);
			statement.setInt(3, serie);
			statement.setInt(4, ano);
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
	
	public static void AlterarTurma(int codigo, int Matr_Prof, int serie, int ano){
		PreparedStatement statement = DAO.criarConexao("UPDATE TURMA "
													 + "			SET MATRIC_PROFESSOR = ?,"
													 + "				SERIE = ?,"
													 + "				ANO = ?"
													 + "  WHERE CODIGO = ?");
		
		try {		
			statement.setInt(1, Matr_Prof);	//Seta os parametros do SQL
			statement.setInt(2, serie);
			statement.setInt(3, ano);
			statement.setInt(4, codigo);
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
	
	public static void ExcluirTurma(int codigo){
		PreparedStatement statement = DAO.criarConexao("DELETE TURMA WHERE CODIGIO = ?");
		
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
