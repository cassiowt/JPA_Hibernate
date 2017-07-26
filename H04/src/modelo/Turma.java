package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Turma implements Serializable{

	private static final long serialVersionUID = -8688573021221014157L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "TURMA_ID")
	private int id;
	
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "ID_SALA")
	private Sala sala;
	
	public Turma() {
		// TODO Auto-generated constructor stub
	}

	
	public Turma(String nome, Sala sala) {
		super();
		this.nome = nome;
		this.sala = sala;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Turma [id=" + id + ", nome=" + nome + "]";
	}
	 
	
	
	
			
}
