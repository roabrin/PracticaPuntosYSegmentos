package app;

import java.util.Random;

import Clases.Punto;
import Clases.Segmento;

public class Principal {

	

	public static void main (String[]args) {

		
	//Parte 1 del principal
		
		//Creamos num aleatorios para X
		int [] numAleaX = new int [10];
		Random ran = new Random();
		for (int i = 0; i < numAleaX.length; i++) {
			numAleaX[i]= ran.nextInt(10)+1;
		}
		
		//Creamos numeros aleatorios para Y
		int [] numAleaY = new int [10];
		for (int i = 0; i < numAleaY.length; i++) {
			numAleaY[i]= ran.nextInt (10)+1;
		}
		
		//2. Crea 2 segmentos cuyos puntos sean, para el primero, los dos primeros puntos del
		//apartado 1, y para el segundo, los dos segundos puntos del apartado 1
		
		Punto p1 = new Punto(numAleaX[0], numAleaY[0]);
		Punto p2 = new Punto(numAleaX[1], numAleaY[1]);
		Punto p3 = new Punto(numAleaX[2], numAleaY[2]);
		Punto p4 = new Punto(numAleaX[3], numAleaY[3]);
		
		Segmento seg1 = new Segmento(p1, p2);
		Segmento seg2 = new Segmento(p3, p4);

		//3. Calcula para ambos segmentos la distancia entre sus puntos		
		double distancia1 = seg1.distancia();
		double distancia2 = seg2.distancia();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
