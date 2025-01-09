package br.microservicos.microservico;

import controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import servico.Servico;

@SpringBootApplication
public class MicroServicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicoApplication.class, args);
		Controller controller = new Controller();
	}

}
