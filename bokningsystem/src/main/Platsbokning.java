package main;

import java.util.Scanner;

public class Platsbokning {
	static Scanner scanner = new Scanner(System.in);
	static String[] platser = Menu_functions.platser;
	static void platsbokning() {
		
		short[] x =friPlats();
		
		short förstaBästa =x[0];
		short fönsterplats=x[1];

		if(fönsterplats !=-1) { // denna "funktion" låter dig välja en fönsterplats
		
		System.out.println("(1) boka en fönsterplats \n"
				 + "(2) boke en vanlig plats ");

while (!scanner.hasNextInt()) { //den kommer köras tills en integer hittas 
    System.out.println("bara sifror tillåtna");
    scanner.next();
    
	}
 int val = scanner.nextInt();
 
 switch (val) {
case 1: registrering(fönsterplats);
	
	break;
case 2:registrering(förstaBästa);
	
	break;
		
 }}
		else if(förstaBästa!=-1){ // om alla fönsterplatser är tagna så kommer du få denna respons
		System.out.println("alla fönsterplatser är tagna du kommer få en vanlig plats");
		registrering(förstaBästa);
		
			
			
}
		else {System.out.println("inga fria platser finns"); }
}

		
	

static short[] friPlats() {
	//om plats inte hittas så kommer returnerande värdet vara negativ (gäller alla platser)
	
	short förstaBästa =-1;
	short fönsterplats= -1;

	
	
	// loop som tar fram en fri plats 
	for (short i = 0; i < platser.length; i++) {
		
		if(platser[i]==null) {
			förstaBästa=i;
			break;
		}
	}
	
	// loop som tar fram fönsterplats
	
	for(int i=0; i< 21;) {
		
		// denna if statement tar hand om den sista unika raden
		if(i==17) {
			i=20;
		}
		
		//denna if statement anger  alla fönsterplatser på högra sidan else statement tar hand om platser på den väntra sidan
		if(i%2==0) {
			i++;
			
		}else i+=3;
		
		
		
		
		if(platser[(i-1)]==null) {
			fönsterplats = (short)(i-1);
			break;
		}
		
		
	}
	//
	short[] x = {förstaBästa,fönsterplats};
	return x;
	
}




static void platsMeny() {
	System.out.println("(1) få första bästa plats \n"
					 + "(2) få plats fönsterplats");
	
	while (!scanner.hasNextInt()) { //den kommer köras tills en integer hittas 
	    System.out.println("bara sifror tillåtna");
	    scanner.next();
	    
		}
	 int val = scanner.nextInt();
		
		switch (val) {
		case 1:
			System.out.println("plats tagen");
			break;
		case 2:
			System.out.println("fönsterplats tagen");
			
			break;
	}
	

	
	
}

public static void registrering(short x ) {
	// kundregistrering 
	System.out.println("skriv in din namn:");
	String namn = scanner.next();
	System.out.println("Skriv din efternamn");
	String efternamn =scanner.next();
	System.out.println("skriv din personnummer (ååmmddxxx)");
	String personnummer =scanner.next();
	
	
	
	
			
	 

	
	String kundID = namn+" "+efternamn+" ("+personnummer+") ";
	
	
	// kunden lägs in i databasen
	platser[x]=kundID;

}

}


