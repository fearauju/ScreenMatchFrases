package br.com.example.ScrenMatchFrases.controller;

import br.com.example.ScrenMatchFrases.dto.FrasesDTO;
import br.com.example.ScrenMatchFrases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FrasesController {

    @Autowired
    private FrasesService servico;

    @GetMapping("/series/frases")
    public FrasesDTO obterFrases() {
        return servico.obterFraseAleatoria();
    }

//    @GetMapping("/frases/teste")
//    public String testeEndpoint() {
//        return "Endpoint de teste funcionando";
//    }

}
