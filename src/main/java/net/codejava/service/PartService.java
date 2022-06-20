package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.model.PartNumber;
import net.codejava.model.Product;
import net.codejava.repo.ProductPartRepo;

@Service
@Transactional
public class PartService {

	@Autowired
	private ProductPartRepo pprepo;
	
	List<PartNumber> findAllParts() {
		return pprepo.findAll();
	}

	void savePart(PartNumber product) {
		pprepo.save(product);
	}

	public PartNumber get(int product_item_id) {
		return pprepo.findById(product_item_id).get();
	}

	public void delete(int product_item_id) {
		pprepo.deleteById(product_item_id);
	}
}
