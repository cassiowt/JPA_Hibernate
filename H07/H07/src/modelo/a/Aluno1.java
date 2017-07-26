package modelo.a;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Aluno1 extends Cliente1 implements Serializable {

	private static final long serialVersionUID = 7406626203564843103L;
	private String apelido;
	
	public Aluno1() {
		// TODO Auto-generated constructor stub
	}

	
	public Aluno1(int rg, String nome, String telefone, String endereco, String cnpj, String apelido) {
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