package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Adress;
import service.AdressService;

@Controller
public class AdressController {

	@Autowired
	private AdressService adressService;
	
	@RequestMapping("/newAdress")
	public String showNewAdress(Model model) {
		model.addAttribute("adress", new Adress());
		return "newAdress";
	}

	@RequestMapping(value = "/createAdress", method = RequestMethod.POST)
	public String showCreateAdress(Adress adress) {
		adressService.createAdress(adress);
		return "adressCreated";
	}
}
