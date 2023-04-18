package vladimir;

import java.util.Scanner;

public class petiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int godina;
		System.out.println("Unesite godinu");
		godina = sc.nextInt();
		sc.close();
		
		if (godina % 4==0 && godina % 100 !=0 || godina % 400 ==0)
			System.out.println("Godina je prestupna.");
		else 
			System.out.println("Godina nije prestupna.");
		
	}

}
