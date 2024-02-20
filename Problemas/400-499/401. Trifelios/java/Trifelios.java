import java.util.Scanner;

public class Trifelios {
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
		String[]	arrPalabras = palabras.toLowerCase().replace('b', 'v').split("\s");
		boolean		sonTrifelios = true;
		int			j = arrPalabras[1].lastIndexOf(arrPalabras[0].charAt(0));
		char		letraIzq;
		char		letraDer;
		
		if (arrPalabras[0].length() != arrPalabras[1].length() || arrPalabras[0].equals(arrPalabras[1]) == true || j == -1)
			sonTrifelios = false;
		else {
			
		}

		return sonTrifelios;
	}
}