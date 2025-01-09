package org.example.microservico;

import controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MicroServicoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicoApplication.class, args);
        Controller controller = new Controller();
        List<BigDecimal> lista = new ArrayList<>();
        lista.add(new BigDecimal("100.00"));
        lista.add(new BigDecimal("200.00"));
        lista.add(new BigDecimal("300.00"));
        lista.add(new BigDecimal("400.00"));
        for(BigDecimal valor : lista){
            controller.maiorValor(lista.getLast(), valor);
        }


    }

}
