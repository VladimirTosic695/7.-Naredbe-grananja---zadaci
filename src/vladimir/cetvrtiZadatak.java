package vladimir;

import java.util.Scanner;

public class cetvrtiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;
		System.out.println("Unesite vrednost x");
		x = sc.nextDouble();
		sc.close();
		
		if (x>-2 && x<=2) 
			y = 2*x;
		 else if (x>=5 && x<7) 
			y = 3*x-1;
		 else 
			y = 1/x;
			System.out.println("Vrednost funkcije y = " +y);
	

	}

}
