package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Shop;
import model.User;
import service.ShopService;

@Controller
public class ShopController {

	@Autowired
	private ShopService shopService;

	@RequestMapping("/newShop")
	public ModelAndView showNewShop() {
		return new ModelAndView("newShop");
	}

	@RequestMapping(value = "/createShop", method = RequestMethod.POST)
	public String showCreateShop(@AuthenticationPrincipal User user, Shop shop) {
		shopService.createShop(shop, user.getId());
		return "profileUser";
	}
}
