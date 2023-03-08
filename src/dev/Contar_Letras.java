package dev;
import java.util.Scanner;

public class Contar_Letras {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Ingresa una palabra: ");
	      String palabra = sc.nextLine();//nextLine() nos sirve para leer un dato de tipo long, lee un string hasta encontrar un salto de linea
	      System.out.print("Ingresa una letra: ");
	      char letra = sc.nextLine().charAt(0);//devuelve la posicion del caracter
	      
	      int contador = 0;

	      for (int i = 0; i < palabra.length(); i++) {// el .length se utiliza para devolver un valor entero que indica el numero de caracteres en la cadena de entrada
	         if (palabra.charAt(i) == letra) {//charAt nos sirve para sacar un caracter de la cadena
	            contador++;
	         }
	      }

	      System.out.println("La letra '" + letra + "' se repite " + contador + " veces en la palabra '" + palabra + "'.");
	   }
	}





