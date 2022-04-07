package edu.fpdual.ejemplo.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// EUC que contenga un método que reciba un arreglo tipo int y que retorne otro
// arreglo que contenga los mismos valores del arreglo recibidos por parámetros pero invertidos.
public class Ejer64 {

    public static void main(String[] args) {
        List<Integer> Lista = new ArrayList<>();
        Lista.add(1);
        Lista.add(2);
        Lista.add(3);
        Lista.add(4);
        Lista.add(5);
        System.out.println(Lista);
        Collections.reverse(Lista);
        for (int N: Lista) {
            System.out.print(N+", ");
        }
    }
}
