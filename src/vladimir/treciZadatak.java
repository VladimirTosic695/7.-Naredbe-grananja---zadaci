package vladimir;

import java.util.Scanner;

public class treciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double x,y;
		System.out.println("Unesite vrednost x");
		x = sc.nextDouble();
		sc.close();
		
		if (x<0) {
			y = -1;
		} else if (x==0) {
			y = 0;
		} else if (x>0) {
			y = 1;
		System.out.println("Vrednost y je " + y);
		}

	}

}
