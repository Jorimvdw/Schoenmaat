public class OOP {
	public static void main(String[] args) {
		Bezoeker gast1 = new Bezoeker();
		gast1.voornaam = "Johan";
		gast1.leeftijd = 15;
		
		Bezoeker gast2 = new Bezoeker();
		gast2.voornaam = "Fred";
		gast2.leeftijd = 17;
		
		controleren(gast1);
		controleren(gast2);


		
	}
	static void controleren(Bezoeker deGastAanDeBar) {
		if(deGastAanDeBar.leeftijd < 16) {
			System.out.println(deGastAanDeBar.voornaam + " mag geen alkohol");
		}else {
			System.out.println(deGastAanDeBar.voornaam + " mag wel alkohol");
		}
	}
}
class Bezoeker{
	int leeftijd;
	String voornaam;
}
