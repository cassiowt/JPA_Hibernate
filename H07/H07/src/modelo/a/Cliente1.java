package modelo.a;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Cliente1 extends Pessoa1 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cnpj;
	
	public Cliente1() {
		// TODO Auto-generated constructor stub
	}

	
	public Cliente1(int rg, String nome, String telefone, String endereco, String cnpj) {
		super(rg, nome, telefone, endereco);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
