package com.company;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int array [] = new int[3];
        int length = 0;
        boolean excepcion = true;
        while (excepcion) {
            try {
                System.out.println("introduce la longitud correcta (3 - 1)");
                length = dato.nextInt();
                for (int i = 0; i < length; i++) {
                    array[i] = i;
                }
                excepcion = false;
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Te has equivocado vuelve a intentarlo: ");
                excepcion = true;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}

