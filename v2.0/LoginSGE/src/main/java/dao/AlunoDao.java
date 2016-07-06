package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class AlunoDao {
	
	public static void InserirAluno(int matricula, String nome, String nomeMae, String nomePai, String cep, String endereco, Date dtNasc)  {
		PreparedStatement statement = DAO.criarConexao("INSERT INTO ALUNO VALUES(?, ?, ?, ?, ?, ?, ?");
		
		try {
			statement.setInt(1, matricula);		//Seta os parametros do SQL
			statement.setString(2, nome);
			statement.setString(3, nomeMae);
			statement.setString(4, nomePai);
			statement.setString(5, cep);
			statement.setString(6, endereco);
			statement.setDate(7, new java.sql.Date(dtNasc.getTime()));
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
	
	
	//SQL de update:
	/*UPDATE ALUNO SET MATRICULA = ?,
					   NOME = ?,
					   NOME_MAE = ?,
					   NOME_PAI = ?,
					   CEP = ?,
					   ENDERECO = ?,
					   DATA_NASCIMENTO = ?
				  WHERE MATRICULA = ?
							   */
	
	


}
