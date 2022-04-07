package edu.fpdual.ejemplo.project;

import java.util.*;

//- EUC que contenga un método que reciba un arreglo tipo int y que retorne true
// (verdadero) este no contiene un 2 o un 3 en sus valores, y falso (false)
// si contiene un 2 o un 3 en sus valores.
public class Ejer62 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(7);



        System.out.println(list.containsAll(Arrays.asList(new Integer[]{2, 3})));
    }
}
