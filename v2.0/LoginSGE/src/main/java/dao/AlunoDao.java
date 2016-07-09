package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class AlunoDao {
	
	public static void InserirAluno(int matricula, String nome, String nomeMae, String nomePai, String cep, String endereco, Date dtNasc)  {
		PreparedStatement statement = DAO.criarConexao("INSERT INTO ALUNO VALUES(?, ?, ?, ?, ?, ?, ?)");
		
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

	public static void ExlcuirAluno(int matricula) {
		PreparedStatement statement = DAO.criarConexao("DELETE ALUNO WHERE MATRICULA = ?");
		
		try {
			statement.setInt(1, matricula);		//Seta os parametros do SQL
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

	public static void AlterarAluno(int matricula, String nome, String nomeMae, String nomePai, String cep,
			String endereco, Date dtNascimento) {
		PreparedStatement statement = DAO.criarConexao("   UPDATE ALUNO SET 		"
											   + "		NOME = ?,			"
											   + "		NOME_MAE = ?,		"
											   + "		NOME_PAI = ?,		"
											   + "		CEP = ?,			"
											   + "		ENDERECO = ?,		"
											   + "		DATA_NASCIMENTO = ? "
											   + "  WHERE MATRICULA = ?		");
		
		try {
				//Seta os parametros do SQL
			statement.setString(1, nome);
			statement.setString(2, nomeMae);
			statement.setString(3, nomePai);
			statement.setString(4, cep);
			statement.setString(5, endereco);
			statement.setDate(6, new java.sql.Date(dtNascimento.getTime()));
			
			statement.setInt(7, matricula);	
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
