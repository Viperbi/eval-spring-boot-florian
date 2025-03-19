package com.florian.evalspring.exception;

public class NoProduitFoundException extends RuntimeException {
    public NoProduitFoundException() {
        super("Aucun produit dans la base de donnée");
    }
}
