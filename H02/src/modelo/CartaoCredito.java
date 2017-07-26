package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CartaoCredito implements Serializable{

	private static final long serialVersionUID = -169159731714933382L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CARTAO_CREDITO")
	private int id;
	
	@OneToOne(mappedBy="cartaoCredito")
	private Cliente cliente;

	private String numeroCartaoCredito;
	private String bandeira;
	
	public CartaoCredito() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CartaoCredito(String numeroCartaoCredito, String bandeira) {
		this.numeroCartaoCredito = numeroCartaoCredito;
		this.bandeira = bandeira;
	}


	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNumeroCartaoCredito() {
		return numeroCartaoCredito;
	}
	public void setNumeroCartaoCredito(String numeroCartaoCredito) {
		this.numeroCartaoCredito = numeroCartaoCredito;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "CartaoCredito [id=" + id + ", cliente=" + cliente + ", numeroCartaoCredito=" + numeroCartaoCredito
				+ ", bandeira=" + bandeira + "]";
	}
	
	
}
