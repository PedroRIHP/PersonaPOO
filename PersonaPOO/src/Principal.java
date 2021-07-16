
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		
		Persona carlos = new Persona();
		//carlos.name = "carlos Eduardo";
		carlos.age = 30;
		System.out.println(carlos.saludar());
		System.out.println(carlos.miEdad());
		
		
		Persona rogelio = new Persona();
		rogelio.name = "Rogelio";
		rogelio.age = 23;
		System.out.println(rogelio.saludar());
		System.out.println(rogelio.miEdad());
				
		PersonaConstructor pedro = new PersonaConstructor(27,"Pedro");
		System.out.println(pedro.saludar());

	}

}
