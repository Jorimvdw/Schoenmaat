import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

// Moeilijkheidsgraad

public class rekenQuizV5 {

    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Eenvoudige rekenkwis voor basisschoolleerlingen.");
        System.out.println();
        System.out.println("Leraar, voer eerst het aantal leerlingen in:");
        int aantalUsers = sc.nextInt();
        System.out.println();
        System.out.println("Voer nu het aantal opgaven per leerling in:");
        int aantalOpgaven = sc.nextInt();
        
        System.out.println();
        System.out.println("Type moeilijk of makkelijk: ...");
        String moeilijkheidsGraad = sc.next();
        System.out.println();
        
        int max1;
        int max2;
        int maxAntwoord;
        
        if(moeilijkheidsGraad.equals("makkelijk")){
            max1 = 99;
            max2 = 9;
            maxAntwoord = 100;
        } else {
            max1 = 999;
            max2 = 99;
            maxAntwoord = 1000;
        }
        
        System.out.println("Leraar, laat nu de leerlingen een voor een de test maken.");
        System.out.println();
        
        for(int u = 0; u < aantalUsers; u++){
            int aantalCorrect = 0;
            System.out.println("Voer je naam in:");
            namen.add(sc.next());
            System.out.println();
//            System.out.println(namen);
            
            for(int i = 0; i < aantalOpgaven; i++) {
                int getal1;
                int getal2;
                        
                int operator = rand.nextInt(4);
                int antwoordPC = 999;
                
                switch(operator) {
                case 0:
                    do {
                        getal1 = rand.nextInt(max1) + 1;
                        getal2 = rand.nextInt(max1) + 1;
                        antwoordPC = getal1 + getal2;
                    } while (antwoordPC > maxAntwoord);
                    System.out.println(getal1 + " + " + getal2 + " = ...");
                    break;
                case 1:
                    do {
                        getal1 = rand.nextInt(max1) + 1;
                        getal2 = rand.nextInt(max1) + 1;
                        antwoordPC = getal1 - getal2;
                    } while (antwoordPC < 0);
                    System.out.println(getal1 + " - " + getal2 + " = ...");
                    break;
                case 2:
                    do {
                        getal1 = rand.nextInt(max2) + 1;
                        getal2 = rand.nextInt(max2) + 1;
                        antwoordPC = getal1 * getal2;
                    } while (antwoordPC > maxAntwoord);
                    System.out.println(getal1 + " x " + getal2 + " = ...");
                    break;
                case 3:
                    getal1 = rand.nextInt(max1) + 1;
                    antwoordPC = rand.nextInt(max2) + 1;
                    System.out.println((antwoordPC * getal1) + " / " + getal1 + " = ...");
                }        
                
                int antwoordUser = sc.nextInt();
                        
                if(antwoordUser == antwoordPC) {
                    System.out.println("Goed!");
                    aantalCorrect++;
                } else {
                    System.out.println("Fout!");
                }
                System.out.println();
            }
            scores.add(aantalCorrect);

            System.out.println("Het aantal correcte antwoorden is: " + aantalCorrect);
            System.out.println();
            System.out.println();
            if (u < (aantalUsers - 1)) {
                System.out.println("Test klaar. Volgende leerling graag.");
                System.out.println();
            } else {
                System.out.println("Test klaar.");
            }
        }
        System.out.println();
        System.out.println("ENNNNNN  ....... DE UITSLAG ISSSSSS .........");
        for (int u= 0;u<aantalUsers;u++) {
            System.out.println(namen.get(u) + " heeft de score " + scores.get(u));
        }
        sc.close();
    }

}


