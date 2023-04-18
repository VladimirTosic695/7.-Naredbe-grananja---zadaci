package vladimir;

import java.util.Scanner;

public class prviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		
		System.out.println("Unesite karakter");
		x = sc.next().charAt(0);
		sc.close();
		
		if (x>='a'&& x<='z') {
			System.out.println("Uneti karakter je malo slovo.");
			}
		else if (x>='A' && x<='Z') {
			System.out.println("Uneti karakter je veliko slovo.");
		}
		else if (x>='0' && x<='9') {
			System.out.println("Uneti karakter je cifra.");
		}
		else 
			System.out.println("Uneti karakter je specijalni karakter.");
		
	
	}

}
