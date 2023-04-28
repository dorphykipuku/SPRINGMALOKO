package com.example.maloko.service;

import com.example.maloko.model.Produit;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProduitService {

    List<Produit> getAllproduct();
    Produit getById(Long id);
    Produit ajouter(Produit produit);
    void deleteProduit(Long id);
    Produit modifier(Long id, Produit produit);
    List<Produit> findbynomAndprix(String nom, String prix);

}
