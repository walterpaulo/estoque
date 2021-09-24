package com.lojac.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojac.demo.model.Product;
import com.lojac.demo.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {
	
	@Autowired
	private ProductService productServ;
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> findAll(){
		List<Product> obj = productServ.listarProdutos();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> buscaPorId(@PathVariable Integer id){
		Product obj = productServ.buscaPorId(id);
		return ResponseEntity.ok(obj);
	}
}
