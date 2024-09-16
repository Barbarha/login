package com.sesi.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutentificacaoController {
	
	@GetMapping("/login")
	public String Login() {
		return "login";
		
	}
}
