package com.florian.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom", nullable = false)
    @NotBlank(message = "Le nom du produit est obligatoire")
    @Size(min = 2, max = 50, message = "Le nom du produit doit contenir entre 2 et 50 caractères")
    private String nom;

    @Column(name = "prix", nullable = false)
    @NotNull(message = "Le prix du produit est obligatoire")
    @Positive(message = "Le prix du produit doit être positif")
    private double prix;

    public Produit() {}

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
