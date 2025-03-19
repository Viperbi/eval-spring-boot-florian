package com.florian.evalspring.exception;

import com.florian.evalspring.model.Produit;

public class SaveProduitException extends RuntimeException {
    public SaveProduitException(Produit produit) {

        super("Le produit " + produit.getNom() + " existe déjà dans la base de donnée");
    }
}
