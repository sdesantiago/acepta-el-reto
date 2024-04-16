import java.util.HashMap;
import java.util.Scanner;

public class ProblemaJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> armero = new HashMap<String, Integer>();
		int		casos;
		int		armas;
		int		armasFuera = 0;
		String	persona;

		while (true) {
			casos = sc.nextInt();

			if (casos == 0) {
				break;
			}

			sc.nextLine();

			for (int i = 0; i < casos; i++) {
				persona = sc.next();
				armas = sc.nextInt();
				
				if (! persona.equals("?")) {
					if (armero.containsKey(persona)) {
						armero.put(persona, armero.get(persona)+armas);
					} else {
						armero.put(persona, armas);
					}
				} else {
					for (int j = 0; j < armas; j++) {
						persona = sc.next();
						armasFuera += armero.get(persona);
						armero.put(persona, 0);
					}
					System.out.println(armasFuera);
					armasFuera = 0;
				}
			}
			armero.clear();
			System.out.println("----");
		}
		sc.close();
	}
}
