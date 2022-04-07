package edu.fpdual.ejemplo.project;

public class Ejer1 {
    public static boolean EsUnSeis (int array[]) {
        if (array[0] == 6 || array[array.length-1] == 6) {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        int [] array = {6,3,4,5,8};
        System.out.println(EsUnSeis(array));
    }
}