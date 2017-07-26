package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala implements Serializable {
 
	private static final long serialVersionUID = -4599119607899496301L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_SALA")
	private int id;
	
	private String nome;

	public Sala() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sala(String nome) {
		super();
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
