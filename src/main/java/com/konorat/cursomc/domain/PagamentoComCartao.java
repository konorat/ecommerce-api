package com.konorat.cursomc.domain;

import com.konorat.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDePacelas;
	
	public PagamentoComCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDePacelas) {
		super(id, estado, pedido);
		this.numeroDePacelas = numeroDePacelas;
	}

	public Integer getNumeroDePacelas() {
		return numeroDePacelas;
	}

	public void setNumeroDePacelas(Integer numeroDePacelas) {
		this.numeroDePacelas = numeroDePacelas;
	}
	
	
}
