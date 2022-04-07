public class Mensaje {
    private String texto;
    
    public Mensaje (String t) {
        this.texto = t;
    }
    
    public void saludar () {
        System.out.println("Hola "+this.texto);
    }
	
	public static void main (String [ ] args) {
	
	Mensaje M1 = new Mensaje("mundo");
	M1.saludar();
	
	}
	
}

