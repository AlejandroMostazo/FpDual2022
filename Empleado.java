public class Empleado {
	protected String nombre [] = new String [2];
	protected String cedula;
	protected boolean casado;
	protected int edad;
	protected double salario;
	
	public Empleado (String apellido, String nombre, String cedula, int edad, boolean casado, double salar) {
		
		this.nombre[0] = apellido;
		this.nombre[1] = nombre;
		this.cedula = cedula;
		if (edad < 18) {
			this.edad = 18;
		} else if (edad > 45) {
			this.edad = 45;
		} else {
			this.edad = edad;	
		}
		this.casado = casado;
		this.salario = salar;
		
	}
	
	public Empleado () {
		
		this.nombre[0] = "Guarnizo";
		this.nombre[1] = "Juan";
		this.cedula = "12345678V";
		this.edad = 18;
		this.casado = false;
		this.salario = 1.450;
		
	}
	
	public void Clasificacion () {
		if (this.edad <= 21) {
			System.out.println("Principiante");
		} else if (this.edad <= 35) {
			System.out.println("Intermedio");
		} else {
			System.out.println("Senior");
		}
	}
	
	public String MostrarDatos () {
		String datos = "Nombre y apellido: "+this.nombre[1]+" "+this.nombre[0]+"\n"+
						"Cedula: "+this.cedula+"\n"+
						"Edad: "+this.edad+"\n"+
						"Casado: "+this.casado+"\n"+
						"salario: "+this.salario+"\n";
		return datos;
	}
	
	public void AumentoSalario (double porcentaje) {
		this.salario = this.salario + (this.salario*porcentaje)/100;
		
	}

}