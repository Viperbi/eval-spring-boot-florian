package com.florian.evalspring.exception;

import com.florian.evalspring.model.Categorie;

public class SaveCategorieException extends RuntimeException {
    public SaveCategorieException(Categorie categorie) {
        super(
                "La catégorie " + categorie.getLibelle() + " existe déjà dans la base de donnée"
        );
    }
}
