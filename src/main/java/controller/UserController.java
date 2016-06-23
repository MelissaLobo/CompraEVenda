package controller;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;
import service.UserService;

//O @Contreller avisa que a classe é uma configuração do spring e que dentro dela tem suas anotações com suas funcoes

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/newAccount")
	public String showNewAccount(Model model) {
		model.addAttribute("user", new User());
		return "newAccount";
	}

	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public String showCreateAccount(User user, BindingResult result, Model model) {
		userService.createAccount(user);
		System.out.println("user");
		return "profileUser";

	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm(BindingResult result) {
		
		if(result.hasErrors()){
			return showNewAccount(null);
		}	
		
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
		// É uma boa pratica redirecionar para a pagina de login novamente

	}

	@RequestMapping(value = "/profileUser", method = RequestMethod.GET)
	public ModelAndView profile(User user) {
		ModelAndView modelAndView = new ModelAndView("user");
		userService.entityExists(user);
		modelAndView.addObject("user", user);
		modelAndView.addObject("pageTitle", "user.userName");
		modelAndView.addObject("pageTitleArg", user.getUserName());
		return modelAndView;
	}
}
