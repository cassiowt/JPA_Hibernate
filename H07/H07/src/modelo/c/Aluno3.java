package modelo.c;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn (name="CODIGO_ALUNO")
@AttributeOverride (name="nome", column=@Column(name="NOME_ALUNO"))
public class Aluno3 extends Cliente3 implements Serializable {

	private static final long serialVersionUID = 7406626203564843103L;
	private String apelido;
	
	public Aluno3() {
		// TODO Auto-generated constructor stub
	}

	
	public Aluno3( String nome, String telefone, String endereco, String cnpj, String apelido) {
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