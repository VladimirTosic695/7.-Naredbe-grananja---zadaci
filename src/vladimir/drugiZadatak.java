package vladimir;

import java.util.Scanner;

public class drugiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x,y;
		System.out.println("Unesite vrednost x.");
		x = sc.nextDouble();
		sc.close();
		
		if (x<0) {
			y = -5;
		}
		else if (x<1 && 0<=x) {
			y = x+2;
		}
		else if (1<=x && x<5) {
			y = 3*x-1;
		}
		else if (x>=5) {
				y = 2*x;	
		System.out.println("Vrednost funkcije y = " + y);
		}
	}

}
