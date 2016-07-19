package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;

import classes.Aluno;
import classes.Professor;


public class ProfessorDao {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sge");
	
	private static EntityManager em;
	
	public static void InserirProfessor(String nome, String cpf, String sexo) {
		
		Professor prof = new Professor(nome, cpf, sexo);
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(prof);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static void AlterarProfessor(int matricula, String nome, String cpf, String sexo) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Professor original = em.find(Professor.class, matricula);
		original.nome = nome;
		original.cpf = cpf;
		original.sexo = sexo;

		em.getTransaction().commit();
		em.close();
	}
	
	public static void ExcluirProfessor(int matricula){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Professor removido = em.find(Professor.class, matricula);
		em.remove(removido);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static List<Professor> listar() throws SQLException, ParseException {
		
		em = emf.createEntityManager();
				
		Session secao = (Session) em.getDelegate();
		Criteria criteria = secao.createCriteria(Professor.class);
		List<Professor> docentes = criteria.list();
		
		return docentes;
	}
	
	public static Professor getProfessor(int matricula){
		em = emf.createEntityManager();
		
		return em.find(Professor.class, matricula);
		
	}
}
