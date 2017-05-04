package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PEDIDO")
@SequenceGenerator(name="seqPedido",sequenceName="SQ_T_PEDIDO",allocationSize=1)
public class Pedido {

	@Id
	@Column(name="CD_PEDIDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqPedido")
	private int codigo;
	
	@Column(name="DT_PEDIDO",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPedido;
	
	@Column(name="DT_ENTREGA")
	@Temporal(TemporalType.DATE)
	private Calendar dataEntrega;
	
	@Column(name="NM_CLIENTE")
	private String cliente;
	
	public Pedido(Calendar dataPedido, Calendar dataEntrega, String cliente) {
		super();
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.cliente = cliente;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}
