package com.lojac.demo.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lojac.demo.model.Product;
import com.lojac.demo.repository.ProductRepository;

@Configuration
public class Initation implements CommandLineRunner {

	@Autowired
	ProductRepository productOb;

	@Override
	public void run(String... args) throws Exception {
		Product prod1 = new Product(null, "Bolacha", "123456123", new BigDecimal("2"));
		Product prod2 = new Product(null, "Refrigerente", "12345457", new BigDecimal("7"));

		productOb.saveAll(Arrays.asList(prod1, prod2));

	}

}
