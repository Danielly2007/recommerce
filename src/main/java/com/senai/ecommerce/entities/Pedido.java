package com.senai.ecommerce.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedidos")
public class Pedido {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	private String status;
	
	@OneToMany(mappedBy = "id.pedido")
	private Set<ItemDoPedido> items = new HashSet<>();
	
	
	public Pedido() {
	
	}
	
	public Pedido(Long id, Instant momento, String status) {
		
		this.id = id;
		this.momento = momento;
		this.status = status;
	}


	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Instant getMomento() {
		return momento;
	}




	public void setMomento(Instant momento) {
		this.momento = momento;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}
	
	public Set<ItemDoPedido> getItems() {
		return items;
	}

	public List<Produto> getProduto() {
		return items.stream().map(x -> x.getProduto()).toList();
	}




	
}
