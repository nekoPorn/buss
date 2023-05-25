package main;


import java.util.Scanner;

public class Menu_functions {
	static Scanner scanner = new Scanner(System.in);
	public static  String[] platser ={
			"Elsa Andersson (0506122738)",
		    null,
		    "Johanna Carlsson (0706122738)",
		    "Tobias Dahlberg (0806122738)",
		    "Emilia Eriksson (0906122738)",
		    "Viktor Forsberg (1006122738)",
		    "Ida Gustafsson (1106122738)",
		    "Markus Holmberg (1206122738)",
		    "Lina Isaksson (1306122738)",
		    "Andreas Johansson (1406122738)",
		    "Maria Karlsson (1506122738)",
		    "Filip Lindberg (1606122738)",
		    "Anna Nilsson (1706122738)",
		    "David Olsson (1806122738)",
		    "Linnea Persson (1906122738)",
		    "Alexander Qvist (2006122738)",
		    "Sandra Rönnberg (2106122738)",
		    "Simon Söderberg (0406122738)",
		    "Hanna Törnqvist (0206122738)",
		    "Daniel Åberg (0306122738)",
		    "Amanda Öberg (0106122738)"
		};
	
	public static void menulist() {
		meny:
		 while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. hitta bokning");
	            System.out.println("2. platsbokning");
	            System.out.println("3. kundlista");
	            System.out.println("4. sorterad kundlista ");
	            System.out.println("5. vinnst");
	            System.out.println("6. lämna");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                	Hitta_bokning.hittaBokning();
	                   
	                    break;
	                case 2:
	                	Platsbokning.platsbokning();
	                    break;
	                case 3:
	                	Kund_lista.lista();
	                    break;
	                case 4:
	                    Sorterad_kund_lista.sortering();
	                    break;
	                case 5:
	                  vinnst.beräkning();
	                   
	                    return;
	                case 6:
	                    // Exit
	                   break meny;
				default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	}	
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
