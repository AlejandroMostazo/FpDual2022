package paquete;

public class Orden {
    private String ID;
    private String Fecha;
    private String Prioridad;
    private boolean Finalizado;
    Empleado Realizador;
    Cliente Afectado;
    
    public Orden (String id, String f, String p, Empleado r, Cliente c) {
        this.ID = id;
        this.Fecha = f;
        this.Prioridad = p;
        this.Finalizado = false;
        this.Realizador = new Empleado("Antonio", "Puesto1", "23");
        this.Afectado = new Cliente("Raul", 22, "29712", "Malaga");
    }
    
    public void setPrioridad (String p) {
        this.Prioridad = p;
    }
    
    public void finalizarOrden () {
        if (!this.Finalizado) {
            this.Finalizado = true;
            System.out.println("La orden ha sido finalizada");
        } else {
             System.out.println("La orden YA ha finalizado");
        }
    }
    
      public void retomarOrden (String f) {
        if (this.Finalizado) {
            this.Finalizado = false;
            this.Fecha = f;
            System.out.println("La orden ha sido retomada el dia "+this.Fecha);
        } else {
             System.out.println("La orden esta en proceso");
        }
    }
    
    public String mostrar () {
        String datos = "ID: "+this.ID+"\n"+
                        "Fecha: "+this.Fecha+"\n"+
                        "Prioridad: "+this.Prioridad+"\n"+
                        "Finalizado: "+this.Finalizado+"\n"+
                        "Empleado: "+this.Realizador+"\n"+
                        "Cliente: "+this.Afectado+"\n";
        return datos;
    }
    
}