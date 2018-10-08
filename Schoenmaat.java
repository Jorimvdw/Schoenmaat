
public class Schoenmaat {

	public static void main(String[] args) {
		Klant klant1 = new Klant();
		klant1.naam = "Henk";
		klant1.schoenmaat = 43;
		
		Klant klant2 = new Klant();
		klant2.naam = "Piet";
		klant2.schoenmaat = 46;
		
		
		controleren(klant1);
		controleren(klant2);
	}

		static void controleren (Klant klantzonderschoen) {
			if (klantzonderschoen.schoenmaat < 46) {
				System.out.println(klantzonderschoen.naam + ". " + "Ja, die schoenmaat hebben we op voorraad.");
			} else {
				System.out.println(klantzonderschoen.naam + ". " + "Sorry, die maat hebben we niet op voorraad.");
			}
		}
	
}

class Klant {
	int schoenmaat;
	String naam; 
}