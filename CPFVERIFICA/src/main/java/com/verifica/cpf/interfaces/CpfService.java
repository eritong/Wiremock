package com.verifica.cpf.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.verifica.cpf.model.Cpf;

@FeignClient(url= "http://localhost:9090/" , name = "CPFverifica")
public interface CpfService {
	
	@GetMapping("{cpf}/json")
    Cpf validaCpf(@PathVariable("cpf") String cpf);
}
