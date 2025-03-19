package com.florian.evalspring.controller;

import com.florian.evalspring.model.Categorie;
import com.florian.evalspring.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("/categorie/save")
    public Categorie save(Categorie categorie) {
        return categorieService.save(categorie);
    }
}
