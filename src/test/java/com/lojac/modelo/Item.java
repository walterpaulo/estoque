package com.lojac.modelo;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private List<ItemProdutos> listaprodutos;
	private Item item;

	public Item() {
		super();
		this.listaprodutos = new ArrayList<>();
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<ItemProdutos> getListaprodutos() {
		return listaprodutos;
	}

	public void setListaprodutos(List<ItemProdutos> listaprodutos) {
		this.listaprodutos = listaprodutos;
	}

	public void incluirProdutos(Produto produto, double qtde) {
		getListaprodutos().add(new ItemProdutos(qtde, produto));
	}

	public double valorTotalVenda() {
		double valortotal = 0;
		for (ItemProdutos produtos : getListaprodutos()) {
			valortotal += (produtos.getQtde() * produtos.getProduto().getValorUnitario());
		}
		return valortotal;
	}
}
