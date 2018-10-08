
public class achtbaan {

	public static void main(String[] args) {
		pretparkBezoeker bezoeker1 = new pretparkBezoeker ();
		pretparkBezoeker bezoeker2 = new pretparkBezoeker ();
		pretparkBezoeker bezoeker3 = new pretparkBezoeker ();
		bezoeker1.vullen (14, 162);
		bezoeker2.vullen (22, 184);
		bezoeker3.vullen (16, 140);
		
		check(bezoeker1);
		check(bezoeker2);
		check(bezoeker3);
	}

	static void check (pretparkBezoeker klant) {
		if (klant.leeftijd > 16 && klant.lengte > 150) {
			System.out.println("Jij mag in de achtbaan");
		} else {
			System.out.println("Sorry, jij mag niet in de achtbaan");
		}
	}
	
}

class pretparkBezoeker {
	int leeftijd;
	int lengte;
	
	void vullen (int a, int b) {
		leeftijd = a;
		lengte = b;
	}
}