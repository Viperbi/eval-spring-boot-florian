package com.florian.evalspring.controller;

import com.florian.evalspring.model.Categorie;
import com.florian.evalspring.model.Produit;
import com.florian.evalspring.service.CategorieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/categories")
    public Iterable<Categorie> getAllCategories() {
        return categorieService.findAllCategorie();
    }

    @GetMapping("/categorie/{id}")
    public Optional<Categorie> getCategorietById(@PathVariable long id) {
        return categorieService.findByIdCat(id);
    }

    @PostMapping("/categorie")
    public Categorie addCategorie(@Valid @RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);
    }
}
