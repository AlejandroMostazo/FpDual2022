package com.company;

public class ExceptionEm extends Exception {

    public ExceptionEm (String mensaje) {
        super(mensaje);
    }
    public static void Error (Empleado em) throws ExceptionEm {
        throw new ExceptionEm ("AAAagh");
    }

}
