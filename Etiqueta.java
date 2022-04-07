public class Etiqueta {
    private String nombreEtiqueta;
    private String Texto;
    
    public Etiqueta (String ne, String t) {
        this.nombreEtiqueta = ne;
        this.Texto = t;
    }
    
    public void Mostrar () {
        System.out.println("<"+this.nombreEtiqueta+">"+this.Texto+"</"+this.nombreEtiqueta+">");
    }
	
	public static void main (String [ ] args) {
	
		Etiqueta E1 = new Etiqueta("h1", "hola mundo");
		E1.Mostrar();
	
	}
}