package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import service.ProductService;

@Controller
public class CatalogController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/catalog", method = RequestMethod.GET)
	public ModelAndView listProduct(Model model) {
		ModelAndView modelAndView = new ModelAndView("catalog");
		List<Product> lista = productService.listProduct();
		modelAndView.addObject("listProduct", lista);
		return modelAndView;

	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String showCart(Model model) {
		ArrayList<ArrayList<String>> cartName = new ArrayList<ArrayList<String>>(0);
		model.addAttribute("products", cartName);
		return "cart";
	}
}
