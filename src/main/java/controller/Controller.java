package controller;


import org.springframework.web.bind.annotation.RestController;
import servico.Servico;

import java.math.BigDecimal;

@RestController(value="/controller")
public class Controller {

    public void maiorValor(BigDecimal valor, BigDecimal valor2) {
        Servico servico = new Servico();
        servico.max(valor, valor2);
    }

    public void menorValor(BigDecimal valor, BigDecimal valor2) {
        Servico servico = new Servico();
        servico.min(valor, valor2);
    }
}
