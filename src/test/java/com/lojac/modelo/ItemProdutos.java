package com.lojac.modelo;

public class ItemProdutos {
	private double qtde;
	private Produto produto;

	public ItemProdutos(double qtde, Produto produto) {
		super();
		this.qtde = qtde;
		this.produto = produto;
	}

	public double getQtde() {
		return qtde;
	}

	public void setQtde(double qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ItemProdutos [qtde=" + qtde + ", produto=" + produto + "]";
	}
	

}
