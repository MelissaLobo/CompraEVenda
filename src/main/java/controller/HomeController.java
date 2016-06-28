package controller;
/**
 * @author MelissaLobo mellobomel@gmail.com
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Entering the Home Compra e Venda");
		return "index";
	}
	
	@RequestMapping("/category")
	public String categoroy() {
		System.out.println("Categorias");
		return "category";
	}
	
	@RequestMapping("/contatoEmpresa")
	public String contatoEmpresa() {
		System.out.println("Contato da Empresa");
		return "contatoEmpresa";
	}
}
