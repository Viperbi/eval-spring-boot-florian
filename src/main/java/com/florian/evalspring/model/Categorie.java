package com.florian.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle", nullable = false)
    @NotBlank(message = "Le libelle de la catégorie est obligatoire")
    @Size(min = 2, max = 50, message = "Le libelle de la catégorie doit contenir entre 2 et 50 caractères")
    private String libelle;

    public Categorie() {
    }

    public Categorie(String nom) {
        this.libelle = nom;
    }

    public Long getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLibelle(String nom) {
        this.libelle = nom;
    }
}
