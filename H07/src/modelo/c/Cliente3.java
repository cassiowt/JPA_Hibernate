package modelo.c;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverride (name="nome", column=@Column(name="NOME_CLIENTE"))
public class Cliente3 extends Pessoa3 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cnpj;
	
	public Cliente3() {
		// TODO Auto-generated constructor stub
	}

	
	public Cliente3(String nome, String telefone, String endereco, String cnpj) {
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
