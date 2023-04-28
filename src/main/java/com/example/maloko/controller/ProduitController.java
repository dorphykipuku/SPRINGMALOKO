package com.example.maloko.controller;

import com.example.maloko.model.NomAndPrixRequest;
import com.example.maloko.model.Produit;
import com.example.maloko.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("get")
    public List<Produit> getAllproduits(){
        return produitService.getAllproduct();
    }
    @PostMapping("pos")
    public Produit Ajouter(@RequestBody Produit produit){
        return produitService.ajouter(produit);
    }
    @GetMapping("get/{id}")
    public Produit getbyId(@PathVariable Long id){
        return produitService.getById(id);
    }

    @PutMapping("put/{id}")
    public Produit modifier(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id, produit);
    }
    @DeleteMapping("del/{id}")
    public String supprimer(@PathVariable Long id){
        produitService.deleteProduit(id);
        return "un produit supprimer";
    }

    @GetMapping("findbynomprix/{nom}/{prix}")
    public List<Produit> findbynomandprix(@PathVariable String nom, @PathVariable String prix){
        return produitService.findbynomAndprix(nom, prix);
    }
}
