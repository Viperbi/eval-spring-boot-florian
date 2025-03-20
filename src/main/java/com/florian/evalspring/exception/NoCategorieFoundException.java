package com.florian.evalspring.exception;

public class NoCategorieFoundException extends RuntimeException {
    public NoCategorieFoundException() {
        super("Aucune catégorie dans la base de donnée");
    }
}
