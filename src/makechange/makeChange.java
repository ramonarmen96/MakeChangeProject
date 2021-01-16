package makechange;

import java.util.Scanner;

public class makeChange {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Price of item: ");
		
		double price = kb.nextDouble();
			
		kb.nextLine();
			
		System.out.println( "\n$ " + price);

		System.out.println("\nHow much is the customer paying? ");
		
		double payment = kb.nextDouble();
		
		System.out.println( "\n$ " + payment + " Paid ");
		
			// This is if the customer has not paid enough
		
		if ( payment < price) {
			
			System.out.println("\nAmount due: " + ( price - payment ) );
				
				// Can use this to meet requirements of "error"
				//System.out.println("Error");
				
		}
			
			// This is going to be if customer pays with exact change
			
		else if ( payment == price) {
			
			System.out.println("\nThank you. please come again!");
				
		}
			
			// This is going to be when a customer pays more than what the item costs
			
		else if ( payment > price ) {
				
			float change = (float) ( payment - price );
				
			System.out.println("\nChange due: " + "$" + (change));
				
			// This is going to calculate what bills / coins are needed for change
				
			System.out.println("\nExact change: " );
				
				
				
				
				
		}
		
		kb.close();	
	}

}

// bills and change initialized below
//		double twenty = 20.00;
//		double ten = 10.00;
//		double five = 5.00;
//		double one = 1.00;
//		double quarter = 0.25;
//		double dime = 0.10;
//		double nickel = 0.05;
//		double penny = 0.01;