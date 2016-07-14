package classes;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int matricula;
	
	public String nome;
	
	public String nome_mae;
	
	public String nome_pai;
	
	public String cep;
	
	public String endereco;
	
	public Date data_nascimento;
	
	public Aluno(String nome, String nomeMae, String nomePai, String cep, String endereco, Date dataNascimento){
		this.nome = nome;
		this.nome_mae = nomeMae;
		this.nome_pai = nomePai;
		this.cep = cep;
		this.endereco = endereco;
		this.data_nascimento = dataNascimento;
	}
	
	
	
	
}
