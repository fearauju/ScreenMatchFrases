package br.com.example.ScrenMatchFrases.repository;

import br.com.example.ScrenMatchFrases.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FrasesRepository extends JpaRepository<Frases,Long> {
//
//    @Query("SELECT f FROM Frases WHERE f.id =:id")
//    Optional<Frases> ObterFrases(Long id);
}
