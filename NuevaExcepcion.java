package com.company;

public class NuevaExcepcion extends Exception{
    private String texto;
    public NuevaExcepcion (String mensaje) {
        super(mensaje);
        this.texto = mensaje;
    }
    public void printMenssaje() {
        System.out.println(this.texto);
    }
    public static void rango (int dato) throws NuevaExcepcion {
        if (dato < 0 || dato > 100) {
            throw new NuevaExcepcion("Su numero no esta en el rango");
        }
    }

}
