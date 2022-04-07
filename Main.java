

import java.util.Scanner;

import static com.company.NuevaExcepcion.rango;

public class Main {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int numero;
        System.out.println("introduce un numero:");

        try {
            numero = dato.nextInt();
            rango(numero);
            System.out.println(numero);
        } catch (NuevaExcepcion ne) {
            System.out.println("Esta es la nueva excepcion");
            ne.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No has introducido numero entero");
        } finally {
            System.out.println("Se ha finalizado el TRY");
        }

    }
}
