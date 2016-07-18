package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;

import classes.Aluno;

import java.util.Date;

public class AlunoDao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sge");
	
	private static EntityManager em;
	
	Entity a;
	
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
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Aluno original = em.find(Aluno.class, matricula);
		original.nome = nome;
		original.nome_mae = nomeMae;
		original.nome_pai = nomePai;
		original.cep = cep;
		original.endereco = endereco;
		original.data_nascimento = new java.sql.Date(dtNascimento.getTime());

		em.getTransaction().commit();
		em.close();
	}

	public static List<Aluno> listar() throws SQLException, ParseException {
			
		em = emf.createEntityManager();
				
		Session secao = (Session) em.getDelegate();
		Criteria criteria = secao.createCriteria(Aluno.class);
		List<Aluno> alunos = criteria.list();
		
		return alunos;
	}
	
	public static Aluno getAluno(int matricula){
		em = emf.createEntityManager();
		
		return em.find(Aluno.class, matricula);
		
	}
	

	
	


}
