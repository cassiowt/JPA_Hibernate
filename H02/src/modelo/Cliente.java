package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -7627038444456200542L;
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CLIENTE")
	private int id;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="ID_CARTAO_CREDITO")
	private CartaoCredito cartaoCredito;
	
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtualizacao;
	
	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(CartaoCredito cartaoCredito, String nome, Date dataAtualizacao) {
		super();
		this.cartaoCredito = cartaoCredito;
		this.nome = nome;
		this.dataAtualizacao = dataAtualizacao;
	}


	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cartaoCredito=" + cartaoCredito + ", nome=" + nome + ", dataAtualizacao="
				+ dataAtualizacao + "]";
	}
	
	
	
}
