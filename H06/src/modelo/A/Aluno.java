package modelo.A;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Aluno")
public class Aluno extends Cliente implements Serializable{

	private static final long serialVersionUID = 1739708857646363674L;
	private String apelido;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String apelido) {
		super();
		this.apelido = apelido;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}
