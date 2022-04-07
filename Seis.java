public class Seis {
    private String contatena;
    
    public Seis (String c) {
        this.contatena = c;
    }
    
    public void concatenar (String cc) {
        this.contatena= this.contatena+" "+cc;
    }
    
    public String toString () {
        return this.contatena;
    }
	
	public static void main (String [ ] args) {
	
		Seis S1 = new Seis("hola");
		System.out.println(S1);
		S1.concatenar("mundo");
		System.out.print(S1);
	
	}
}