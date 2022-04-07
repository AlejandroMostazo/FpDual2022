package paquete;

public class Cliente {
    private String nombre;
    private int edad;
    private String codigoPostal;
    private String Provincia;
    private boolean dadoDeAlata;
    
    public Cliente (String n, int e, String cp, String p) {
        this.nombre = n;
        this.edad = e;
        this.codigoPostal = cp;
        this.Provincia = p;
        this.dadoDeAlata = true;
    }
    
    public void setprovincia (String p) {
        this.Provincia = p;
    }
    
    public String getNombre () {
		String dato = this.nombre;
        return dato;
    }
    
    public void darDeBaja () {
        if (this.dadoDeAlata) {
           this.dadoDeAlata = false;
            System.out.println("El cliente "+this.nombre+" ha sido dado de baja"); 
        } else {
            System.out.println("El cliente "+this.nombre+" ya ha sido dado de baja"); 
        }
        
    }
    
    public void darDeAlta () {
        if (!this.dadoDeAlata) {
           this.dadoDeAlata = true;
            System.out.println("El cliente "+this.nombre+" ha sido dado de alta"); 
        } else {
            System.out.println("El cliente "+this.nombre+" ya ha sido dado de alta"); 
        }
    }
    
    public String mostrar () {
        String datos = "Nombre de cliente: "+this.nombre+"\n"+
                            "Edad: "+this.edad+"\n"+
                            "Codigo Postal: "+this.codigoPostal+"\n"+
                            "Provincia: "+this.Provincia+"\n"+
                            "Dado de Alta: "+this.dadoDeAlata+"\n";
		return datos;
    }
    
	
	public static void main (String [ ] args) {

	Cliente C1 = new Cliente("Raul", 22, "29712", "Malaga");
	System.out.print(C1.mostrar());
	
	}
	
	
}

