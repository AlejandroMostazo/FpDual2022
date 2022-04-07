

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejer7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        double numero;
        System.out.println("introduce un numero:");

        try {
            numero = dato.nextDouble();
            impar(numero);
            System.out.println(numero);
        } catch (Exception71 | Exception72 | Exception73 | InputMismatchException e) {
            e.printStackTrace();
        }


    }


    static void impar(double imPar) throws Exception73, Exception71, Exception72 {
        if (imPar / (int) imPar > 0) {
            throw new Exception71("Número flotante");
        }
        if (imPar % 2 != 0) {
            throw new Exception73("El Número es impar");
        }
        if (imPar % 2 == 0) {
            throw new Exception72("El Número es par");
        }
    }




}
