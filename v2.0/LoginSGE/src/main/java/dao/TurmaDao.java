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

import classes.Turma;


public class TurmaDao {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sge");
	
	private static EntityManager em;
	
	public static void InserirTurma(int Matr_Prof, int serie, int ano){
		
		Turma t = new Turma(Matr_Prof, serie, ano);
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static void AlterarTurma(int codigo, int Matr_Prof, int serie, int ano){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Turma original = em.find(Turma.class, codigo);
		original.matric_professor = Matr_Prof;
		original.serie = serie;
		original.ano = ano;

		em.getTransaction().commit();
		em.close();
	}
	
	public static void ExcluirTurma(int codigo){
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Turma removida = em.find(Turma.class, codigo);
		em.remove(removida);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Turma> listar() throws SQLException, ParseException {
		
		em = emf.createEntityManager();
				
		Session secao = (Session) em.getDelegate();
		Criteria criteria = secao.createCriteria(Turma.class);
		List<Turma> turmas = criteria.list();
		
		return turmas;
	}
	
	public static Turma getTurma(int codigo){
		em = emf.createEntityManager();
		
		return em.find(Turma.class, codigo);
		
	}
}
