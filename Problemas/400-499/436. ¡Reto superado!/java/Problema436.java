import java.util.Scanner;

public class Problema436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long	x;
		long	y;

		while (sc.hasNextLong()) {
			x = sc.nextLong();
			y = sc.nextLong();

			System.out.println((long)((Math.log((y*1000000)/x)/Math.log(2))+1));
		}
	}
}