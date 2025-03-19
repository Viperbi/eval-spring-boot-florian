package com.florian.evalspring.repository;


import com.florian.evalspring.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {
    public Produit findByNom(String nom);
}
