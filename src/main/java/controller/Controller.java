package controller;

import org.springframework.web.bind.annotation.RestController;
import servico.Servico;

@org.springframework.stereotype.Controller
@RestController
public class Controller {

    Servico servico;

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
