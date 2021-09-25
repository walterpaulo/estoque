package com.lojac.test;

import com.lojac.controller.ProdutoController;
import com.lojac.dao.ProdutoDAO;
import com.lojac.modelo.CriadorDeItem;
import com.lojac.modelo.Item;
import com.lojac.modelo.Produto;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		ProdutoController produto = new ProdutoController();
		
		produto.adicionar(new Produto(null, "teclado",19))
			   .adicionar(new Produto(null, "mouse", 20))
			   .adicionar(new Produto(null, "tela", 100))
			   .adicionar(new Produto(null, "notebook", 2500.00));
		System.out.println(produto.getLista());
		
		produto.retirar(1);
		System.out.println(produto.getLista());
		
	
		produto.retirar(2);
		System.out.println(produto.getLista());
	}

}
