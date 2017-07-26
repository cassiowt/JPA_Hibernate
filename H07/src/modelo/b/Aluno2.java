package modelo.b;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn (name="CODIGO_ALUNO")

public class Aluno2 extends Cliente2 implements Serializable {

	private static final long serialVersionUID = 7406626203564843103L;
	private String apelido;
	
	public Aluno2() {
		// TODO Auto-generated constructor stub
	}

	
	public Aluno2( String nome, String telefone, String endereco, String cnpj, String apelido) {
		super( nome, telefone, endereco, cnpj);
		this.apelido = apelido;
	}


	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	
}