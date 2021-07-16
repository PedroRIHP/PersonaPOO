
public class PersonaConstructor {
	String nombre;
	int edad;
	
	
	PersonaConstructor(int edad,String nombre){
		this.nombre = nombre;
		this.edad = edad;
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String saludar() {
		return "hola soy " + this.nombre + "mi edad es " + this.edad;
	}

}
