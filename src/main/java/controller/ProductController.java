package controller;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String showCreateProduct(Product product) {
		BigDecimal big = new BigDecimal(product.getPrice().toString());
		productService.createProduct(product);
		return "productCreated";
	}

	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView ShowListProduct(Model model) {
		ModelAndView modelAndView = new ModelAndView("listProduct");
		List<Product> lista = productService.listProduct();
		modelAndView.addObject("listProduct", lista);

		return modelAndView;
	}
}