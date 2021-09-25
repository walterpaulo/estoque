package com.lojac.dao;

import java.util.ArrayList;
import java.util.List;

import com.lojac.modelo.Produto;

public class ProdutoDAO {
	private List<Produto> listaProduto;
	int i, n = 0;
	int contador = 1;

	public ProdutoDAO() {
		super();
		this.listaProduto = new ArrayList<Produto>();
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public long contadadorId() {
		return contador ++;
	}

	public void incluir(Produto produto) {
		produto.setId(contadadorId());
		getListaProduto().add(produto);
	}

	public void alterar(Produto produto) {

	}

	public void excluir(Produto produto) {
		if (produto.getId() == null) {
		
		}else {
			getListaProduto().remove(produto);
		}
	}

	public Produto pesquisaPorId(int id) {
		Produto produto = getListaProduto().get(id);
		return produto;
	}

	public List<Produto> listar() {
		n = getListaProduto().size();
		i = 0;
		List<Produto> listaRetorno = new ArrayList<>();
		for (i = 0; i < n; i++) {
			listaRetorno.add(getListaProduto().get(i));
		}
		return listaRetorno;
	}

}
