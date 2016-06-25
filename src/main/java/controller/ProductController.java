package controller;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/newProduct")
	public String showNewProduct(Model model) {
		model.addAttribute("product", new Product());
		return "newProduct";
	}

	@RequestMapping("/createProduct")
	public String showCreateProduct(@Valid Product product, BindingResult result) {
		if(result.hasErrors()){
			return showNewProduct(null);
		}
		BigDecimal big = new BigDecimal(product.getPrice().toString());
		productService.createProduct(product);
		return "productCreated";
	}

	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView showListProduct(Model model) {
		ModelAndView modelAndView = new ModelAndView("listProduct");
		List<Product> list = productService.listProduct();
		modelAndView.addObject("listProduct", list);

		return modelAndView;
	}
	
	@RequestMapping("/productDescription/{id}")
	public ModelAndView description(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView("productDescription");
		Product product = productService.getById(id);
		modelAndView.addObject("product", product);
	
		return modelAndView;
	}
}