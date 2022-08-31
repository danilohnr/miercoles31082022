package estructurasdecontrol;

public class Condicionales {

	public static void main(String[] args) {
		
		//Condicional if (simple)
		
		byte edad = 100;
		String nombre = "Juan";
		boolean gameOver = true;
		
		if(!gameOver) {
			//Se ejecuta esto si la expresión es verdadera			
			System.out.println(nombre + " tiene " + edad + " anios de edad.");			
		}
		
		//Condicional if else (doble)
		gameOver = false;
		String avenger = "Ironman";
		
		if (nombre == avenger) {
			System.out.println("Fin del juego");
		} else {
			System.out.println("Pasa a la condicional anidada.");
		}
		
		//Condicional if else if (anidada)
		char semaforo = 'n';
		if (semaforo == 'r') {
			System.out.println("ALTO");
		} else if (semaforo == 'a'){
			System.out.println("PASE CON PRECAUCION");
		} else if (semaforo == 'v'){
			System.out.println("SIGA");
		} else {
			System.out.println("NO HAY ENERGÍA - SEMÁFORO APAGADO");
		}
		

	}
}
