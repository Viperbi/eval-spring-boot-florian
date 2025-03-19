package com.florian.evalspring.controller;

import com.florian.evalspring.model.Produit;
import com.florian.evalspring.service.ProduitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/produits")
    public Iterable<Produit> getAllProduits() {
        return produitService.findAll();
    }

    @GetMapping("/produit/{id}")
    public Optional<Produit> getProduitById(@PathVariable long id) {
        return produitService.findById(id);
    }

    @PostMapping("/produit/save")
    public Produit saveProduit(@Valid @RequestBody Produit produit) {
        return produitService.save(produit);
    }

}
