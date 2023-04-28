package com.example.maloko.service;

import com.example.maloko.model.Produit;
import com.example.maloko.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    private ProduitRepository produitRepository;
    @Override
    public List<Produit> getAllproduct() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getById(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public Produit ajouter(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Long id) {
     produitRepository.deleteById(id);
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
      Produit existingProduit = getById(id);
      existingProduit.setNom(produit.getNom());
      existingProduit.setPrix(produit.getPrix());

      return produitRepository.save(existingProduit);
    }

    @Override
    public List<Produit> findbynomAndprix(String nom, String prix) {
        return produitRepository.findByNomAndprix(nom, prix);
    }


}
