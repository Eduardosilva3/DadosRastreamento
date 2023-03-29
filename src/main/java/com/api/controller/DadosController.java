package com.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DadosController {

	@PostMapping("/")
	public ResponseEntity<String> receberDados (@RequestBody String dados){
		System.out.println(dados);
		
		return ResponseEntity.ok(dados);
	}
	
	@GetMapping("/")
	public String teste() {
		return "Chegou";
	}
}
