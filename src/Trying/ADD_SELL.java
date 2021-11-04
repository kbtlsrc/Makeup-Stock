package Trying;

import java.util.Scanner;

public class ADD_SELL {

	public static int amountSell(Product a) {
		System.out.println("How much did you sell? :");
		Scanner b = new Scanner(System.in);
		int amount = b.nextInt();
		if(a.getAmount() == 0) {
			System.out.println("You cant sell anymore");
			return 0;
		}
			else
				return a.getAmount() - amount;
	}
	
	
	
	public static int amountAdd(Product c) {
		System.out.println("How much do you want to add? :");
		Scanner K = new Scanner(System.in);
		int aadd = K.nextInt();
		return c.getAmount() + aadd;
	}
	
	
	

}
