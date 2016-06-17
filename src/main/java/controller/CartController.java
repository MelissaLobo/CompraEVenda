package controller;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Cart;
import model.CartItem;
import model.Product;
import service.ProductService;

@Controller
public class CartController {

	@Autowired
	private ProductService productService;

	@Autowired
	private Cart cart;

	@RequestMapping("/add")
	public ModelAndView add(Long id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/cart");
		CartItem cartItem = criaItem(id);
		cart.add(cartItem);

		return modelAndView;
	}

	/*@RequestMapping(method = RequestMethod.GET)
	public ModelAndView items() {
		return new ModelAndView("cart");
	}*/

	private CartItem criaItem(Long id) {
		Product product = productService.getById(id);
		CartItem cartItem = new CartItem(product);
		return cartItem;
	}

	@RequestMapping("/remove")
	public ModelAndView remove(Long id) {
		cart.remove(id);

		return new ModelAndView("redirect:/cart");
	}
}
