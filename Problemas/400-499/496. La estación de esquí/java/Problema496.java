import java.util.Scanner;

public class Problema496 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]	remontes;
		int		casos;
		int		salida;
		int		destino;
		int		tiempo;

		while (true) {
			casos = sc.nextInt();
			
			if (casos == 0)
				break;
			
			remontes = new int[casos][3];
			for (int i = 0; i < remontes.length; i++) {
				for (int j = 0; j < remontes[0].length; j++) {
					remontes[i][j] = sc.nextInt();
				}
			}
			
			salida = sc.nextInt();
			destino = sc.nextInt();
			tiempo = sc.nextInt();

			
		}
	}	
}