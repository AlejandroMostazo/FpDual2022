package com.company;

public class Array {
    public static void main(String[] args) {
        int array [] = new int[3];

        try {
            for (int i = 0; i < 5; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("la array de ha desbordado");
            a.printStackTrace();
        }
    }
}
