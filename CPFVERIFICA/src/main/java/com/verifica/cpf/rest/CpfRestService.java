package com.verifica.cpf.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.verifica.cpf.interfaces.CpfService;
import com.verifica.cpf.model.Cpf;

@RestController
public class CpfRestService {

	@Autowired
	private CpfService cpfService;

	@GetMapping("/{cpf}")
	public ResponseEntity<Cpf> getCpf(@PathVariable String cpf) {
		
		Cpf situacao = cpfService.validaCpf(cpf);
		
		return situacao != null ? ResponseEntity.ok().body(situacao) : ResponseEntity.notFound().build(); 
	}

}
