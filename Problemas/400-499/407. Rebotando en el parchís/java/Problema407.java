import java.util.Scanner;

public class Problema407 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int	c;
		int	p;
		int	t;

		
		while (true) {
			c = sc.nextInt();
			p = sc.nextInt();
			t = sc.nextInt();
			if (c == 0 && p == 0 && t == 0) {
				break;
			}
			if (p+t <= c) {
				System.out.println(p+t);
			} else {
				System.out.println(c - (t - (c-p)));
			}
		}

		
		sc.close();
	}
}