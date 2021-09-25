package com.lojac.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojac.demo.model.Product;
import com.lojac.demo.repository.ProductRepository;
import com.lojac.demo.service.execption.ObjectNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productOb;
	
	
	public List<Product> listarProdutos(){
		return productOb.findAll();
	}
	
	public Product buscaPorId(Integer id) {
		Optional<Product> obj = productOb.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " +id+ ",Tipo: "+Product.class.getName()));
	}
	

}
