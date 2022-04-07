package edu.fpdual.ejemplo.project1;

import java.util.ArrayList;
import java.util.List;

//EUC    que  contenga  un  método  que  reciba  un  arreglo  tipo  int
// y  que retorne otro  arreglo  de  enteros que  contenga  los  2  valores
// centrales  del  mismo.  Ojo:  debe  validar  que  solo  pueda  trabajar  con
// arreglos de longitud par.
public class Ejer63 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(7);

        System.out.println(ArrayCentral(list));

    }

    public static List<Integer> ArrayCentral (List<Integer> lista) {
        List<Integer> aux = new ArrayList<Integer>();
        if (lista.size()%2 == 0) {
            int contador = (lista.size() - 2) / 2;
            aux.add(lista.get(contador));
            aux.add(lista.get(contador+1));
        } else {
            System.out.println("El array debe ser par");
        }
        return aux;
    }

}