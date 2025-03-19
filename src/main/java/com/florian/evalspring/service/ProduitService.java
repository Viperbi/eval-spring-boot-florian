package com.florian.evalspring.service;

import com.florian.evalspring.exception.NoProduitFoundException;
import com.florian.evalspring.exception.SaveProduitException;
import com.florian.evalspring.model.Produit;
import com.florian.evalspring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Iterable<Produit> findAll() {
        if (produitRepository.count() == 0) {
            throw new NoProduitFoundException();
        }
        return produitRepository.findAll();
    }

    public Optional<Produit> findById(long Id) {
        return produitRepository.findById(Id);
    }

    public Produit save(Produit produit) {
        if(produitRepository.findByNom(produit.getNom()) != null)
        {
            throw new SaveProduitException(produit);
        }
        return produitRepository.save(produit);
    }

}
