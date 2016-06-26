package controller;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import model.Product;
import model.User;
import service.ProductService;
import service.ShopService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/newProduct", method = RequestMethod.POST)
	public ModelAndView showNewProduct() {
		return new ModelAndView("newProduct");
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public RedirectView showCreateProduct(@AuthenticationPrincipal User user, Product product) {
		shopService.addProduct(user, product);
		return new RedirectView("/catalog");
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