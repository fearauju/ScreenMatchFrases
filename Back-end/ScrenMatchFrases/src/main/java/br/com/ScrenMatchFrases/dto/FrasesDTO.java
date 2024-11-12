package br.com.example.ScrenMatchFrases.dto;

import jakarta.persistence.Column;

public record FrasesDTO(
        String titulo,
        String frase,
        String personagem,
        String poster
) {
}
