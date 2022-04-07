public class Programador extends Empleado {
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador () {
		super();
		this.lineasDeCodigoPorHora =  100;
		this.lenguajeDominante = "CSS";
	}
	
	public Programador (String apellido, String nombre, String cedula, int edad, boolean casado, double salar, int ldcph, String ld) {
		super(apellido, nombre, cedula, edad, casado, salar);
		this.lineasDeCodigoPorHora = ldcph;
		this.lenguajeDominante = ld;
	}
	
}