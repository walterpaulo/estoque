package com.lojac.modelo;


public class CriadorDeItem {
	private Item item;

	public CriadorDeItem() {
	}

	public CriadorDeItem(Item item) {
		super();
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public CriadorDeItem pegarItem(Produto produto, double qtde) {
		getItem().incluirProdutos(produto, qtde);
		return this;
	}

	public Item constroi() {
		return getItem();
	}

	public void mostar() {
		for (ItemProdutos item : getItem().getListaprodutos()) {
			System.out.println("Nome" + item.getProduto().getDescricao());
		}
	}

}
