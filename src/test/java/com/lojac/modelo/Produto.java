package com.lojac.modelo;

public class Produto {
	private Long id;
	private String descricao;
	private double valorUnitario;
	


	public Produto() {
		super();
	}

	public Produto(Long i, String descricao, double valorUnitario) {
		super();
		this.id = i;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorUnitario=" + valorUnitario + "]\n";
	}
	
	
		
}
