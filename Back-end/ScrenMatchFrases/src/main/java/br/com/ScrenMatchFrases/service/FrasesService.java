package br.com.example.ScrenMatchFrases.service;

import br.com.example.ScrenMatchFrases.dto.FrasesDTO;
import br.com.example.ScrenMatchFrases.model.Frases;
import br.com.example.ScrenMatchFrases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;


@Service
public class FrasesService {

    @Autowired
    private FrasesRepository repository;

    public FrasesDTO obterFraseAleatoria() {
        List<Frases> frases = repository.findAll();
        Random random = new Random();
       int  idAleatorio = random.nextInt(frases.size());

        Frases frase = frases.get(idAleatorio);

       // Optional<Frases> frase = repository.findById(idAleatorio.nextLong());
        return new FrasesDTO(frase.getTitulo(),frase.getFrase(),
                frase.getPersonagem(),frase.getPoster());


    }
}
