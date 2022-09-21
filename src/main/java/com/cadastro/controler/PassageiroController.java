package com.cadastro.controler;

import org.springframework.web.bind.annotation.GetMapping;

public class PassageiroController {
	
	@GetMapping("/user")
	public String helloWorld() {
		return "Ola Mundo";
	}

}
