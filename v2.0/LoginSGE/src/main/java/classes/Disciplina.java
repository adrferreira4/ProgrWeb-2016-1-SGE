package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int codigo;
	
	public String nome;

}
