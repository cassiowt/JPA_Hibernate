package modelo;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_HIERARQUIA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISCRIMINADOR", discriminatorType = DiscriminatorType.STRING)

@DiscriminatorValue("Pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -5916977967258563752L;

	@Id
	private int rg;
	private String nome;
	private String telefone;
	private String endereco;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(int rg, String nome, String telefone, String endereco) {
		this.rg = rg;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pessoa [rg=" + rg + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
	
}