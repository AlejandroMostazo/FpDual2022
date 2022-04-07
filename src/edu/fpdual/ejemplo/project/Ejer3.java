package edu.fpdual.ejemplo.project;

//3- EUC que contenga un método que reciba un arreglo tipo int y que retorne
// otro arreglo de enteros
//que contenga los 2 valores centrales del mismo. Ojo: debe validar que solo pueda trabajar con
//arreglos de longitud par.
public class Ejer3 {
    public static int[] Array (int array[]) {
        int [] aux = new int[2];
        if (array.length%2 == 0) {
            int contador = (array.length - 2) / 2;
            aux[0] = array[contador];
            aux[1] = array[contador+1];
        } else {
            System.out.println("El array debe ser par");
        }
        return aux;
    }

    public static void main(String[] args) {
        int [] aux = {1,2,3,4,5,6,7,8,9,10};
        int [] aux2 = Array(aux);
        for (int i = 0; i < aux2.length; i++) {
            System.out.print(aux2[i]);
        }
    }
}
