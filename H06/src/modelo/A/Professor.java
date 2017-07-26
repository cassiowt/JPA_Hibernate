package modelo.A;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Professor")
public class Professor extends Pessoa implements Serializable{

	private static final long serialVersionUID = 6741950917065015215L;
	private String pisPasep;
	private int salario;

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String pisPasep, int salario) {
		super();
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
