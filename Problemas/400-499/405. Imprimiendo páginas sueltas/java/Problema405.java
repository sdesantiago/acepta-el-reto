import java.util.Scanner;

public class Problema405 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);

		int		actual;
		int		anterior;

		while (true) {
			actual = sc.nextInt();
	
			if (actual == 0) {
				break;
			} else {
				while (true) {
					anterior = actual;
					
					if (actual == 0) {
						System.out.println();
						break;
					}
					
					actual = sc.nextInt();

					if (actual == anterior+1) {
						System.out.print(anterior);
						while (actual == anterior+1) {
							anterior = actual;
							actual = sc.nextInt();
						}
						System.out.print("-" + anterior);
					} else {
						System.out.print(anterior);
					}
					if (actual != 0) {
						System.out.print(",");
					}
				}
			} 
		}
		sc.close();
	}
}