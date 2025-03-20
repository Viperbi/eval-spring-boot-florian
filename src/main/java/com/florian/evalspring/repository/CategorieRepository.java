package com.florian.evalspring.repository;

import com.florian.evalspring.model.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long> {
    public Optional<Categorie> findByLibelle(String libelle);
}
