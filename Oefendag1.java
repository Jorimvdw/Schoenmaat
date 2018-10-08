import java.util.Random;
import java.util.Scanner;

public class Oefendag1 {

	public static void main(String[] args) {
	/*	int a;
		a = 4;
		a = 9;
		System.out.println(a);
		String test = "stukje tekst";
		System.out.println(test);
		boolean eersteboolean = true;
		
		int i = 0b111; // 0b verteld dat het binair is
		int y = 077; // 0 verteld dat het getal octaal is
		int q = 0x5A; // 0x verteld dat het getal hexadicimaal is
		System.out.println(q);
		System.out.println(y);
		System.out.println(i);
	
		
		int hallo = 0x4_5_2;
		long voorbeeld = 63647485859323223L; //L moet er achter bij een long getal
		
		float defloat = 66.5F; //F moet erachter bij een float
		
	
		
		char karakter = 'e'; //enkele character tussen enkele quotes
		String zin = "h"; //meerdere characters tussen dubbele quotes
		
		
		char karakter = '\uFFFF';
		char a = 97;
		System.out.println(karakter);
		for(int x = 0; x<26; x++) {
			System.out.println(a++);
	}
		System.out.println(karakter);
	
	*/
		
		Scanner scanner = new Scanner(System.in); 
		Random random = new Random ();
		Vulpen vulpen = new Vulpen ();
			System.out.println(vulpen.kleur); // de punt staat voor het vertellen van de waarde van een eigenschap
			vulpen.kleur = "oranje";
			System.out.println(vulpen.kleur);
	}

}

class Vulpen {
	String kleur = "blauw";
	boolean leeg;
	int prijs;
}