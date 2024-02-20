import java.util.Scanner;

public class Problema427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	numCasos = sc.nextInt();
		String nombre;
		String parentesco;
		
		sc.nextLine();
		for (int i=0;i < numCasos;i++) {
			nombre = sc.nextLine();
			parentesco = sc.nextLine();
			
			if (nombre.equals("Luke") && parentesco.equals("padre")) {
				System.out.println("TOP SECRET");
			}
			else {
				System.out.println(nombre + ", yo soy tu " + parentesco);
			}
		}
	}
}