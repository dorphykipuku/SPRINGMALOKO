package com.example.maloko.repository;

import com.example.maloko.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProduitRepository extends JpaRepository<Produit, Long> {
  @Query("FROM Produit p WHERE p.nom=?1 OR p.prix=?2")
  List<Produit> findByNomAndprix(String nom, String prix);

}
