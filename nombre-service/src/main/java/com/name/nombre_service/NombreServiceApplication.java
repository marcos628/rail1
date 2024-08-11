package com.name.nombre_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NombreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NombreServiceApplication.class, args);
	}
	@RestController
	class NombreController {
		@GetMapping("/nombre")
		public String obtenerNombre() {
			return "Marcos1";
		}
	}

}
