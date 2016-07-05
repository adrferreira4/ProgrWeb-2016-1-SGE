package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TurmaDao {

	public void InserirTurma(int codigo, String Matr_Prof, int serie, int ano){
		
		PreparedStatement statement = DAO.criarConexao("INSERT INTO DISCIPLINA VALUES(?, ?, ?");
		
		try {
			statement.setInt(1, codigo);		//Seta os parametros do SQL
			statement.setString(2, Matr_Prof);
			statement.setInt(3, serie);
			statement.setInt(4, ano);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DAO.executarInstrucaoSql(statement);
		
	}
}
