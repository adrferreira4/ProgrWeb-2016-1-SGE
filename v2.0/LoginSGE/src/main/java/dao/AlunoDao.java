package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import classes.Aluno;

import java.util.Date;

public class AlunoDao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sge");
	
	private static EntityManager em;
	
	public static void InserirAluno(String nome, String nomeMae, String nomePai, String cep, String endereco, Date dtNasc)  {
		
		Aluno student = new Aluno(nome, nomeMae, nomePai, cep, endereco, new java.sql.Date(dtNasc.getTime()));
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
	}

	public static void ExlcuirAluno(int matricula) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Aluno removido = em.find(Aluno.class, matricula);
		em.remove(removido);
		em.getTransaction().commit();
		em.close();
	}

	public static void AlterarAluno(int matricula, String nome, String nomeMae, String nomePai, String cep, String endereco, Date dtNascimento) {
		
		Aluno student = new Aluno(nome, nomeMae, nomePai, cep, endereco, new java.sql.Date(dtNascimento.getTime()));
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.refresh(student);
		em.getTransaction().commit();
		em.close();
	}

	public static List<Aluno> listar() throws SQLException, ParseException {
			
		em = emf.createEntityManager();
		
		String jpql = "from ALUNO";
		
		TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
		
		List<Aluno> alunos = query.getResultList();
		
		return alunos;
	}
	

	
	


}
