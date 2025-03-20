package com.florian.evalspring.service;

import com.florian.evalspring.exception.NoCategorieFoundException;
import com.florian.evalspring.exception.SaveCategorieException;
import com.florian.evalspring.model.Categorie;
import com.florian.evalspring.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Iterable<Categorie> findAllCategorie() {
        if(categorieRepository.count() == 0) {
            throw new NoCategorieFoundException();
        }
        return categorieRepository.findAll();
    }

    public Optional<Categorie> findByIdCat(long id) {
        return categorieRepository.findById(id);
    }

    public Categorie saveCategorie(Categorie categorie) {
        if(categorieRepository.findByLibelle(categorie.getLibelle()).isPresent()) {
            throw new SaveCategorieException(categorie);
        }
        return categorieRepository.save(categorie);
    }
}
