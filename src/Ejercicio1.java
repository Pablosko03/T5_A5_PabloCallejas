import java.util.Scanner; //importación de la herramienta del Scanner
public class Ejercicio1 {

	public static void main(String[] args) {
		
		//variables de las apuestas
		int eur1, estre, num1=1, numMenu, numApuesta=1;
		int reit, prim;
		int quing;
		double precio=0;
		Scanner reader = new Scanner(System.in);
		
		//do; while que engloba todo el código para repetirlo una y otra vez
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1: Euromillón (precio 3,50€)");
			System.out.println("2: Primitiva (precio 1,20€)");
			System.out.println("3: Quinigol (precio 1€)");
			System.out.println("4: Si quiere dejar de apostar y ver el precio: ");
			System.out.print("Dame la opción del menú: ");
			numMenu=reader.nextInt();
			
			//swich para los diferentes menús que tiene el código
			switch (numMenu) {
			
				case 1: 
					System.out.print("¿Cuantas apuestas quieres hacer? ");
					numApuesta=reader.nextInt();
					
					//for que imprime tantas apuestas como hayamos indicado antes en numApuesta
					for(int i=0; i<numApuesta; i++) {
						System.out.print("Euromillón: ");
						/*este for es para calcualr los 5 numeros random de la apuesta*/
						for(int r=0; r<5; r++) { 
							eur1 = (int)(1+Math.random()*50); //númmeros euromillon
							System.out.print(eur1 + " ");
						}
						//este último for es para calcular el numero de estrellas de cada apuesta 
						System.out.print("Estrellas: ");
						for(int r=0; r<2; r++) {
							estre = (int)(1+Math.random()*11); //númmeros estrellas
							System.out.print(estre + " ");
						}
						System.out.println();
						precio=precio+3.5;
					}
				
					break;
			//los demás for son identicos al primero en funcionalidad
				case 2:
					System.out.print("¿Cuantas apuestas quieres hacer? ");
					numApuesta=reader.nextInt();

					for(int i=0; i<numApuesta; i++) {
						System.out.print("Primitiva: ");
						for(int r=0; r<6; r++) {
							prim = (int)(1+Math.random()*49); //númmeros primitiva
							System.out.print(prim + " ");
						}
						System.out.print("Reitegro: ");
						for(int r=0; r<1; r++) {
							reit = (int)(0+Math.random()*9); //númmeros estrellas
							System.out.print(reit + " ");
						}
						System.out.println();
						precio=precio+1.2;
					}
				
					break;
			
				case 3:
					System.out.print("¿Cuantas apuestas quieres hacer? ");
					numApuesta=reader.nextInt();

					for(int i=0; i<numApuesta; i++) {
						System.out.print("Euromillón: ");
						for(int r=0; r<5; r++) {
							quing = (int)(0+Math.random()*6); //númmeros quingol
							System.out.print(quing + " ");
						}
						System.out.println();
						precio=precio+1;
					}
				
					break;
					
					//este case 4 lo he añadido para hacer una opción comno de "stop" y que acabe el código
				case 4:
					System.out.print("Pulse otra vez 4 para confirmar, si no, pulse cualquier opción para volver al menú: ");
				numMenu=reader.nextInt();
					break;
					
					//en el default se establece la condición de que si pulsas cualquier numero distinto de 1,2,3 o 4 te vuelva a repetir el código con un mensaje de error
				default: 
					System.out.println("Esa opción no es válida, por favor pulsa una opción valida de nuevo: ");
					break;
							}
			
			/*en el while se establece la condición de que se siga repitiendo el código mientras se introduzca un numero entre 1 y 3 y 5 en adelante,
			tiene relación con el case 4 ya que al pulsar el numero 4 te pide que lo confirmes y al hacerlo como el numero 4 no está contemplado
			en el rango del while se para el código y te muestra la cantidad de dinero acumulada*/
			} while (numMenu>=1&&numMenu<=3||numMenu>=5);
		System.out.println("El precio a pagar en euros es: " + precio + "€");
		

	}//main

}//class
