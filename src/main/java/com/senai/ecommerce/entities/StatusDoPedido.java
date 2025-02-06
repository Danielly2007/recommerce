package com.senai.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ItemDoPedido")
public class StatusDoPedido {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aguardandopag;
	private int pago;
	private int enviado;
	private int entregue;
	private int cancelado;
	
	
	public StatusDoPedido() {
		
	}


	public int getAguardandopag() {
		return aguardandopag;
	}


	public void setAguardandopag(int aguardandopag) {
		this.aguardandopag = aguardandopag;
	}


	public int getPago() {
		return pago;
	}


	public void setPago(int pago) {
		this.pago = pago;
	}


	public int getEnviado() {
		return enviado;
	}


	public void setEnviado(int enviado) {
		this.enviado = enviado;
	}


	public int getEntregue() {
		return entregue;
	}


	public void setEntregue(int entregue) {
		this.entregue = entregue;
	}


	public int getCancelado() {
		return cancelado;
	}


	public void setCancelado(int cancelado) {
		this.cancelado = cancelado;
	}


	public StatusDoPedido(int aguardandopag, int pago, int enviado, int entregue, int cancelado) {
		
		this.aguardandopag = aguardandopag;
		this.pago = pago;
		this.enviado = enviado;
		this.entregue = entregue;
		this.cancelado = cancelado;
	}
	
	

}
