package edu.fpdual.ejemplo.project1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

// EUC que contenga un método que reciba un arreglo tipo int y que retorne true
// (verdadero) si en la
//primera o en la última posición hay un 6, y falso (false) si no.
public class Ejer6 {
    public static boolean EsUnSeis (ArrayList<Integer> lista) {
        if (lista.get(0) == 6 || lista.get(lista.size()-1) == 6) {
            return true;
        } return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        System.out.println(EsUnSeis(list));
    }


}
