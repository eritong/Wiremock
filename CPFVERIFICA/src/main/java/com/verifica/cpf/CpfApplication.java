package com.verifica.cpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CpfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpfApplication.class, args);
	}

}
