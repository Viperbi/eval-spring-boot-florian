package com.florian.evalspring.exception;

public class NoCategorieFoundException extends RuntimeException {
    public NoCategorieFoundException() {

        super("Aucun produit dans la base de donnée");
    }
}
