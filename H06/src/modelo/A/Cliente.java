package modelo.A;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cliente")
public class Cliente extends Pessoa implements Serializable{

	private static final long serialVersionUID = 6667546309767589685L;
	private String cnpj;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
