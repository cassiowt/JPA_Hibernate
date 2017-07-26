package modelo;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Aluno")
public class Aluno extends Cliente implements Serializable {

	private static final long serialVersionUID = 7406626203564843103L;
	private String apelido;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	
	public Aluno(int rg, String nome, String telefone, String endereco, String cnpj, String apelido) {
		super(rg, nome, telefone, endereco, cnpj);
		this.apelido = apelido;
	}


	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
}