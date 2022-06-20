package net.codejava.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.model.PartNumber;
import net.codejava.model.Product;
import net.codejava.repo.ProductPartRepo;
import net.codejava.service.ProductService;

@RestController
public class AppController {

	@Autowired
	@Resource(name="ProductService")
	private ProductService service; 
	
	@Autowired
	@Resource(name="ProductPartRepo")
	private ProductPartRepo repo;	
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		if(listProducts.isEmpty()) {
			System.out.print("No data");
		}
		model.addAttribute("listProducts", listProducts);
		
		return "index";
	}
	
	@RequestMapping("/isbuilk")
	public String showViewProductPart(Model model) {
		List<PartNumber> listProducts = repo.findAll();
		 model.addAttribute("listProducts", listProducts);
		return "product_part";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("Product", product);
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("Product") Product product) {
		service.save(product);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/savePart", method = RequestMethod.POST)
	public String savePartProduct(@ModelAttribute("PartNumber")PartNumber product) {
		repo.save(product);
		
		return "index2";
	}
	
	
	
	@RequestMapping("/product/{id}")
	public ModelAndView showProductPage(@PathVariable(name = "id") int product_item_id) {
		ModelAndView mav = new ModelAndView("Product");
		Product product = service.get(product_item_id);
		mav.addObject("Product", product);
		
		return mav;
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int product_item_id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = service.get(product_item_id);
		mav.addObject("Product", product);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int product_item_id) {
		service.delete(product_item_id);
		return "redirect:/";		
	}
	
}
