import java.util.Scanner; //importaci�n de la herramienta del Scanner
public class Ejercicio1 {

	public static void main(String[] args) {
		
		//variables de las apuestas
		int eur1, estre, num1=1, numMenu, numApuesta=1;
		int reit, prim;
		int quing;
		double precio=0;
		Scanner reader = new Scanner(System.in);
		
		//do; while que engloba todo el c�digo para repetirlo una y otra vez
		do {
			System.out.println("�Qu� quieres hacer?");
			System.out.println("1: Euromill�n (precio 3,50�)");
			System.out.println("2: Primitiva (precio 1,20�)");
			System.out.println("3: Quinigol (precio 1�)");
			System.out.println("4: Si quiere dejar de apostar y ver el precio: ");
			System.out.print("Dame la opci�n del men�: ");
			numMenu=reader.nextInt();
			
			//swich para los diferentes men�s que tiene el c�digo
			switch (numMenu) {
			
				case 1: 
					System.out.print("�Cuantas apuestas quieres hacer? ");
					numApuesta=reader.nextInt();
					
					//for que imprime tantas apuestas como hayamos indicado antes en numApuesta
					for(int i=0; i<numApuesta; i++) {
						System.out.print("Euromill�n: ");
						/*este for es para calcualr los 5 numeros random de la apuesta*/
						for(int r=0; r<5; r++) { 
							eur1 = (int)(1+Math.random()*50); //n�mmeros euromillon
							System.out.print(eur1 + " ");
						}
						//este �ltimo for es para calcular el numero de estrellas de cada apuesta 
						System.out.print("Estrellas: ");
						for(int r=0; r<2; r++) {
							estre = (int)(1+Math.random()*11); //n�mmeros estrellas
							System.out.print(estre + " ");
						}
						System.out.println();
						precio=precio+3.5;
					}
				
					break;
			//los dem�s for son identicos al primero en funcionalidad
				case 2:
					System.out.print("�Cuantas apuestas quieres hacer? ");
					numApuesta=reader.nextInt();

					for(int i=0; i<numApuesta; i++) {
						System.out.print("Primitiva: ");
						for(int r=0; r<6; r++) {
							prim = (int)(1+Math.random()*49); //n�mmeros primitiva
							System.out.print(prim + " ");
						}
						System.out.print("Reitegro: ");
						for(int r=0; r<1; r++) {
							reit = (int)(0+Math.random()*9); //n�mmeros estrellas
							System.out.print(reit + " ");
						}
						System.out.println();
						precio=precio+1.2;
					}
				
					break;
			
				case 3:
					System.out.print("�Cuantas apuestas quieres hacer? ");
					numApuesta=reader.nextInt();

					for(int i=0; i<numApuesta; i++) {
						System.out.print("Euromill�n: ");
						for(int r=0; r<5; r++) {
							quing = (int)(0+Math.random()*6); //n�mmeros quingol
							System.out.print(quing + " ");
						}
						System.out.println();
						precio=precio+1;
					}
				
					break;
					
					//este case 4 lo he a�adido para hacer una opci�n comno de "stop" y que acabe el c�digo
				case 4:
					System.out.print("Pulse otra vez 4 para confirmar, si no, pulse cualquier opci�n para volver al men�: ");
				numMenu=reader.nextInt();
					break;
					
					//en el default se establece la condici�n de que si pulsas cualquier numero distinto de 1,2,3 o 4 te vuelva a repetir el c�digo con un mensaje de error
				default: 
					System.out.println("Esa opci�n no es v�lida, por favor pulsa una opci�n valida de nuevo: ");
					break;
							}
			
			/*en el while se establece la condici�n de que se siga repitiendo el c�digo mientras se introduzca un numero entre 1 y 3 y 5 en adelante,
			tiene relaci�n con el case 4 ya que al pulsar el numero 4 te pide que lo confirmes y al hacerlo como el numero 4 no est� contemplado
			en el rango del while se para el c�digo y te muestra la cantidad de dinero acumulada*/
			} while (numMenu>=1&&numMenu<=3||numMenu>=5);
		System.out.println("El precio a pagar en euros es: " + precio + "�");
		

	}//main

}//class
