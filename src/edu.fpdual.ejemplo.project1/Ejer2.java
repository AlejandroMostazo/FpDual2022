package edu.fpdual.ejemplo.project1;//2- EUC que contenga un método que reciba un arreglo tipo int y que retorne true (verdadero) este no
//contiene un 2 o un 3 en sus valores, y falso (false) si contiene un 2 o un 3 en sus valores.

public class Ejer2 {
    public static boolean Contiene2o3 (int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 || array[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] array = {6,3,4,5,8};
        System.out.println(Contiene2o3(array));
    }
}

