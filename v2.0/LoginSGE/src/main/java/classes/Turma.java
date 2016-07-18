package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int codigo;
	
	public int matric_professor;
	
	public int serie;
	
	public int ano;

}
