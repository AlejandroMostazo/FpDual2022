package edu.fpdual.ejemplo.project1;

import java.util.ArrayList;
import java.util.List;

// EUC que contenga un método que reciba un arreglo tipo String y que
// retorne otro arreglo que
//contenga las cadenas que contengan números
public class Ejer65 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hola");
        list.add("100tifico");
        list.add("como");
        list.add("4ever");
        list.add("jujutsu");
        list.add("pico3");
        System.out.println(ContieneNumero(list));


    }

    public static List<String> ContieneNumero (List<String> cadena) {
        List<String> aux = new ArrayList<>();
        for (int i = 0; i < cadena.size(); i++) {
            for (int j = 0; j < cadena.get(i).length(); j++) {
                if (cadena.get(i).charAt(j) >= '0' && cadena.get(i).charAt(j) <= '9' ) {
                    aux.add(cadena.get(i));
                    break;
                }
            }
        }
        return aux;
    }
}

