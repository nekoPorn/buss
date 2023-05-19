package main;

import java.util.Scanner;

public class Hitta_bokning {
	static Scanner scanner = new Scanner(System.in);
	static String[] platser = Menu_functions.platser;
	
	static void hittaBokning() {
		System.out.println("skriv in namn, efternamn eller personnummer för att hitta bokning");
		String hitta =scanner.next();
		
		
		int platsNr =1;
		
		for (int i = 0; i < platser.length; i++) {
		    if (platser[i] != null && platser[i].toLowerCase().contains(hitta.toLowerCase())) {
		        // Hittade en matchning
		        System.out.println("Matchning hittad på index " + i);
		        hanteraBokning(i); // Hantera bokningen för den matchande platsen
		        break; // Avsluta loopen efter att ha hittat en matchning
		    }
		}

		
}
		
		
		
	

	static void hanteraBokning(int platsNr) {
		System.out.println("bokning hittades");
		System.out.println("plats som bokades är "+ (platsNr+1));
		System.out.println("vad vill du göra?");
		System.out.println("(1): ta bort bokning \n"
						 + "(2)gå tillbaka ");
		
		
		
		while (!scanner.hasNextInt()) { //den kommer köras tills en integer hittas 
		    System.out.println("bara sifror tillåtna");
		    scanner.next();
		    
			}
		 int val = scanner.nextInt();
		 
		 switch (val) {
		case 1:taBortBokning(platsNr); ;
			
			break;
		case 2: System.out.println("tar dig tillbaka");;
			
			break;
				
		 }}
		
	
	
static void taBortBokning(int platsNr){
	System.out.println("tar bort bokning ");
	
	platser[(platsNr)]=null;
	
	
	
	
	
}

}
