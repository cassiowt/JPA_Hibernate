package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = -3940344296486233345L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	
	private String cpf;
	private String primeiroNome;
	private String ultimoNome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtualizacao;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_CLIENTE")
	private Collection<Telefone> telefones = new ArrayList<Telefone>();
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpf, String primeiroNome, String ultimoNome, Date dataAtualizacao,
			Collection<Telefone> telefones) {
		super();
		this.cpf = cpf;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.dataAtualizacao = dataAtualizacao;
		this.telefones = telefones;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", cpf=" + cpf + ", primeiroNome=" + primeiroNome + ", ultimoNome="
				+ ultimoNome + ", dataAtualizacao=" + dataAtualizacao + ", telefones=" + telefones + "]";
	}
	
	
	
}
