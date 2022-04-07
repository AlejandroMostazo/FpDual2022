public class Cinco {
    private int repeticiones;
    private String palabra;
    
    public Cinco (int i, String p) {
        this.repeticiones = i;
        this.palabra = p;
    }
    
    public void imprimir () {
        for (this.repeticiones = this.repeticiones; this.repeticiones > 0; this.repeticiones--) {
            System.out.println(this.palabra);
        }
    }
	
	public static void main (String [ ] args) {
	
		Cinco C1 = new Cinco(10, "Hola mundo");
		C1.imprimir();
	
	}
}