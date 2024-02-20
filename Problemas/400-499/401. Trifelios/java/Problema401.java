import java.util.Scanner;

public class Problema401 {
	public static void main(String[] args) {
		Scanner		sc = new Scanner(System.in);
		int			numCasos = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < numCasos; i++)
			if (trifelios(sc.nextLine())) System.out.println("SI");
			else System.out.println("NO");
		sc.close();
	}

	public static boolean trifelios(String palabras) {
		String[]	arrPalabras = palabras.toLowerCase().replace('b', 'v').split(" ");
		boolean		sonTrifelios = true;
		int			j = arrPalabras[1].lastIndexOf(arrPalabras[0].charAt(0));
		char		letraIzqP0;
		char		letraIzqP1;
		char		letraDerP0;
		char		letraDerP1;
		
		if (arrPalabras[0].length() != arrPalabras[1].length() || arrPalabras[0].equals(arrPalabras[1]) == true || j == -1)
			sonTrifelios = false;
		else {
			for (int i = 0; i < arrPalabras[0].length(); i++) {
				letraIzqP0 = (i==0) ? arrPalabras[0].charAt(arrPalabras[0].length()-1) : arrPalabras[0].charAt(i-1);
				letraDerP0 = (i==arrPalabras[0].length()-1) ? arrPalabras[0].charAt(0) : arrPalabras[0].charAt(i+1);
				
				letraIzqP1 = (j==0) ? arrPalabras[1].charAt(arrPalabras[1].length()-1) : arrPalabras[1].charAt(j-1);
				letraDerP1 = (j==arrPalabras[1].length()-1) ? arrPalabras[1].charAt(0) : arrPalabras[1].charAt(j+1);
				
				if (arrPalabras[0].charAt(i) != arrPalabras[1].charAt(j) || letraIzqP0 != letraIzqP1 || letraDerP0 != letraDerP1)
					sonTrifelios = false;

				j = (j == arrPalabras[1].length()-1) ? 0 : j+1;
			}
		}

		return sonTrifelios;
	}
}

// // Esquema de la entrada: número de casos
// import java.util.*;

// public class Solution {

//   static Scanner in;

//   public static void casoDePrueba() {

//     // TU CÓDIGO AQUÍ.
//     // Procesa un único caso leyendo con
//     // in.next*()
//     String[]  palabras;
    
//     in.nextLine();
//     palabras = in.nextLine().toLowerCase().replace('b', 'v').split(" ");
//     if (palabras[0].length() != palabras[1].length() || palabras[0].equals(palabras[1]) == true || j == -1)
    
//   } // casoDePrueba

//   public static void main(String[] args) {

//     in = new java.util.Scanner(System.in);

//     int numCasos = in.nextInt();
//     for (int i = 0; i < numCasos; i++)
//       casoDePrueba();
//   } // main

// } // class Solution
