package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable{

	private static final long serialVersionUID = -3896264704369407349L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String numeroTelefone;
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public Telefone(String numeroTelefone) {
		super();
		this.numeroTelefone = numeroTelefone;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", numeroTelefone=" + numeroTelefone + "]";
	}
	
	
}
