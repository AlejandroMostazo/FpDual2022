package com.company;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        try {
            throw new NuevaExcepcion("Mensaje de error");
        } catch (NuevaExcepcion e) {
            e.printStackTrace();
        }
    }
}
