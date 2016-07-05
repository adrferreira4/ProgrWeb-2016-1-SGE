package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DisciplinaDao {

	public void InserirDisciplina(int codigo, String nome){
		PreparedStatement statement = DAO.criarConexao("INSERT INTO DISCIPLINA VALUES(?, ?, ?");
		
		try {
			statement.setInt(1, codigo);		//Seta os parametros do SQL
			statement.setString(2, nome);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DAO.executarInstrucaoSql(statement);
	}
}
