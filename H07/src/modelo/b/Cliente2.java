package modelo.b;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Cliente2 extends Pessoa2 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cnpj;
	
	public Cliente2() {
		// TODO Auto-generated constructor stub
	}

	
	public Cliente2(String nome, String telefone, String endereco, String cnpj) {
		super( nome, telefone, endereco);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
