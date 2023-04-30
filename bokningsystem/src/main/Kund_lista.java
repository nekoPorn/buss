package main;

public class Kund_lista{
	static String[] platser = Menu_functions.platser;
	
static void lista() {
	System.out.println("lista med kunder");
	for (String string : platser) {
		System.out.println(string);
	}
	
}
	
	
}
