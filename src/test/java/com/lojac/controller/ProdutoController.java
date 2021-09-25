package com.lojac.controller;


import java.util.ArrayList;
import java.util.List;

import com.lojac.dao.ProdutoDAO;
import com.lojac.modelo.Produto;

public class ProdutoController {
	private Produto produto;
	private ProdutoDAO dao;

	
	public ProdutoController() {
		super();
		this.dao = new ProdutoDAO();
	}

	public Produto getProduto() {
		return produto;
	
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ProdutoDAO getDao() {
		return dao;
	}

	public void setDao(ProdutoDAO dao) {
		this.dao = dao;
	}

	public ProdutoController adicionar(Produto produto) {
		dao.incluir(produto);
		return this;
	}

	public List<Produto> getLista() throws ClassNotFoundException {
		List<Produto> listaproduto = new ArrayList<>();
		try {
			listaproduto = dao.listar();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao realizar: " + e.getMessage());
		}
		return listaproduto;
	}

	public void retirar(int id) {
		produto = new Produto();
		produto = dao.pesquisaPorId(id);
		dao.excluir(produto);
	}
}
