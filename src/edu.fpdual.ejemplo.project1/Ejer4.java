package edu.fpdual.ejemplo.project1;

public class Ejer4 {
    public static int [] Invertir (int array[]) {
        int [] aux = new int[array.length];
        int cont = 0;
        for (int i = array.length-1; i > 0; i--) {
            aux[cont] = array[i];
            cont++;
        }
        return aux;
    }

    public static void main(String[] args) {
        int [] aux = {1,2,3,4,5,6,7,8,9,10};
        int [] aux2 = Invertir(aux);
        for (int i = 0; i < aux2.length; i++) {
            System.out.print(aux2[i]+" ");
        }
    }
}
