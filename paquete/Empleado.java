package paquete;

public class Empleado {
    private String nombre;
    private String puesto;
    private String departamento;
    
    public Empleado (String n, String p, String d) {
        this.nombre = n;
        this.puesto = p;
        this.departamento = d;
    }
    
    public void setPuesto (String p) {
        this.puesto = p;
    }
    
    public void setDepartamento (String d) {
        this.departamento = d;
    }
    
    public String mostrar () {
        String datos = "Nombre Empleado: "+this.nombre+"\n"+
                        "Puesto: "+this.puesto+"\n"+
                        "Departamento: "+this.departamento+"\n";
        
        return datos;
    }
	
	public static void main (String [ ] args) {
	
		Empleado E1 = new Empleado("Antonio", "Puesto1", "23");
		System.out.print(E1.mostrar());
	
	}
	
}