package com.company;

public class Ejer5 {

    public static void f() throws ExcepcionF {

        try {
            g();
        } catch (Exceptiong e) {
            e.printStackTrace();
            throw new ExcepcionF();
        }
    }
    public static void g() throws Exceptiong {
        throw new Exceptiong();
    }

    public static void main(String[] args) throws ExcepcionF {
       f();
    }
}
