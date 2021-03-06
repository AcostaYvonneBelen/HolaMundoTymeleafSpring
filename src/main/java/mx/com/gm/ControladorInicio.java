package mx.com.gm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Value("${index.saludo}")
	private String saludo;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var mensaje ="Hola Mundo con Tymeleaf";
		
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("saludo", saludo);
		return "index";
	}
}
