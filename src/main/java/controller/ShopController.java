package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Shop;

@Controller
public class ShopController {

	@RequestMapping("/newShop")
	public String showNewShop(Model model) {
		model.addAttribute("shop", new Shop());
		return "newShop";
	}
	
	@RequestMapping(value = "/createShop", method = RequestMethod.POST)
	public String showCreateShop(Shop shop) {
		
		return "profileUser";

	}
}
