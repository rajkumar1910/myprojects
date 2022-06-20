package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.model.Product;
import net.codejava.repo.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> listAll() {
		return repo.findAll();
	}

	public void save(Product product) {
		repo.save(product);
	}

	public Product get(int product_item_id) {
		return repo.findById(product_item_id).get();
	}

	public void delete(int product_item_id) {
		repo.deleteById(product_item_id);
	}



}
