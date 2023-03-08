package dev;

import java.io.IOException;

import java.util.Scanner; // se importa el Scanner para poder utilizarlo en el programa

public class palabra_cont {
	
	public static void main(String[] args) throws IOException{// se utiliza para ecepciones que logren ocurrir y debamos recuperar 
		
        Scanner sc = new Scanner(System.in);
        String palabra;
        char caracter;
        int cont = 0;
        do {
            System.out.println("Introduce texto: ");
            palabra = sc.nextLine();
        } while (palabra.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();
        cont = contarCaracteres(palabra, caracter);
        System.out.println("El caracter  " + caracter + " aparece: \n " + cont + " veces");                   
    }

    // la funcion calcula el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //aumentamos el contador al contar
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador; // la funcion devuelve la variable contador
		
	}

}
