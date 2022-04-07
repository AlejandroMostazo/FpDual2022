package com.company;



public class Ejer4 {

    public static void main(String[] args) {
        Empleado E1 = null;
        try {
            E1.Metodo();
        } catch (NullPointerException e) {
            System.out.println("El objeto no tiene ferencia en memoria");
            e.printStackTrace();
        }

    }
}