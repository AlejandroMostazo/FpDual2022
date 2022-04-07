package com.company;

public class Exceptiong extends Throwable {
    public Exceptiong () {
        super("Esto es la excepcion de g");
    }
    public void Nonpoint () throws NullPointerException {
        throw new NullPointerException();
    }
}
