package modelo;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cliente")
public class Cliente extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cnpj;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	
	public Cliente(int rg, String nome, String telefone, String endereco, String cnpj) {
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
