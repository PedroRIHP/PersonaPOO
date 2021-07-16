
public class Persona { //esto es una clase es un MOLDE  DE objetos Wow ojo! no es un objeto es un Molde
	String name = "nombre default" ;// tiene una varaible nombre
	int age = 0 ; // tienen una vaiable edad
	
	public String saludar() { // 
		return "hola " + this.name;
		
	}
	
	public String miEdad() {
		return "Mi edad es " + this.age;
	}
	
	private String humano() { //los privados son Atributos (funciones que solo se pueden usar adentro de la Cass y no se pueden invocar en otros lados.
		return "es humano";
	}
	
}
