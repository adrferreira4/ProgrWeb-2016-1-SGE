package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDao {

	public static void InserirProfessor(int matricula, String nome, String cpf, String sexo) {
		PreparedStatement statement = DAO.criarConexao("INSERT INTO PROFESSOR VALUES(?, ?, ?, ?");
		
		try {
			statement.setInt(1, matricula);		//Seta os parametros do SQL
			statement.setString(2, nome);
			statement.setString(3, cpf);
			statement.setString(4, sexo);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DAO.executarInstrucaoSql(statement);				
	}
}
