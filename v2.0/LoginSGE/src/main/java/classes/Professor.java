package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int matricula;
	
	public String nome;
	
	public String cpf;
	
	public String sexo;
	
	public Professor(String nome, String cpf, String sexo){
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public Professor(){
		
	}

}
