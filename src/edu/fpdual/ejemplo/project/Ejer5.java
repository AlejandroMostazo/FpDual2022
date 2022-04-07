package edu.fpdual.ejemplo.project;

// EUC que contenga un método que reciba un arreglo tipo String y que
// retorne otro arreglo que
//contenga las cadenas que contengan números
public class Ejer5 {
    public static String[] ContieneNumero (String cadena[]) {
        String [] aux = new String[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
            for (int j = 0; j < cadena[i].length(); j++) {
                if (cadena[i].charAt(j) >= '0' && cadena[i].charAt(j) <= '9' ) {
                    aux[i] = cadena[i];
                    break;
                }
            }
        }
        return aux;
    }
    public static void main(String[] args) {
        String [] aux = {"hola","100tifico","slu2", "adios", "D1"};
        String [] aux2 = ContieneNumero(aux);
        for (int i = 0; i < aux2.length; i++) {
            System.out.print(aux2[i]+" ");
        }
    }
}
