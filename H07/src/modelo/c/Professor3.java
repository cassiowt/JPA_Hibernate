package modelo.c;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverride (name="nome", column=@Column(name="NOME_PROFESSOR"))
public class Professor3 extends Pessoa3 implements Serializable {

	private static final long serialVersionUID = -8547111621408720031L;
	private String pisPasep;
	private int salario;
	
	public Professor3() {
		// TODO Auto-generated constructor stub
	}

	



	public Professor3( String nome, String telefone, String endereco, String pisPasep, int salario) {
		super( nome, telefone, endereco);
		this.pisPasep = pisPasep;
		this.salario = salario;
	}





	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
}
