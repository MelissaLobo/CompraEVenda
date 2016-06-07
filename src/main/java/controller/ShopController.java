package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Shop;
import service.ShopService;

@Controller
public class ShopController {

	@Autowired
	private ShopService shopService;
	
	@RequestMapping("/newShop")
	public String showNewShop(Model model) {
		model.addAttribute("shop", new Shop());
		return "newShop";
	}
	
	@RequestMapping(value = "/createShop", method = RequestMethod.POST)
	public String showCreateShop(Shop shop) {
		shopService.createAdress(shop);
		return "profileUser";
	}
	
}
