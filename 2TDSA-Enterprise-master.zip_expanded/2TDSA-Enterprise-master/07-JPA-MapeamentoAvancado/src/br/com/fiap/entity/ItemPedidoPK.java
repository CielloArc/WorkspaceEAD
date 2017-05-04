package br.com.fiap.entity;

import java.io.Serializable;

/***
 * Classe que armazena as chaves primárias da entidade
 * os atributos devem possuir o mesmo nome dos 
 * atributos da entidade
 */
public class ItemPedidoPK implements Serializable {

	private int produto;
 
	private int pedido;

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
}
