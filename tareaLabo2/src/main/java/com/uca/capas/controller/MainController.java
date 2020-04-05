package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		//usuario
		String user = "ricardo";
		//contraseña
		String pass = "123";
		if(usuario.usuario.equals(user) && usuario.contra.equals(pass)) {
			
			return "MostrarMensajeV";
		}
		return "MostrarMensajeF";
	}

}
