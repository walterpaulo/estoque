package com.lojac.test;

import com.lojac.modelo.CriadorDeItem;
import com.lojac.modelo.Item;
import com.lojac.modelo.Produto;

public class Main {
	public static void main(String[] args) {
		CriadorDeItem criador = new CriadorDeItem();
		Item item = criador.pegarItem(new Produto("Teclado",20), 20).constroi();
		System.out.println(item);
	}

}
