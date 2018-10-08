import java.util.Random;

public class Weekopdracht {

	public static void main(String[] args) {
		Kaart kaart1 = new Kaart();
		Random random = new Random();
		
		String[] randomkleur = {"Harten","Schoppen","Klaver","Ruiten"};
		String[] randomwaarde = {"2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer","Aas"};
		
		kaart1.kleur = randomkleur;
		kaart1.waarde = randomwaarde;
		
		System.out.println(kaart1.kleur + " " + kaart1.waarde);
		

	}

}

class Kaart {
	String kleur;
	String waarde;
	
}
