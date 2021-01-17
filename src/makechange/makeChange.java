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
			
//			float exactChange;
			int counter = 0;
			
			float change = (float) ( payment - price );
				
			System.out.println("\nChange due: " + "$" + (change));
				
			// This is going to calculate what bills / coins are needed for change
				
			System.out.println("\nExact change: " );
			
			
			
//			while loop
			
			while (change >= 20) {
				
				change -= 20;
				
				counter++;
				
			}

			System.out.println(counter + " Twenties ");
			
			counter = 0;
				
			while (change >= 10) { 
			
				change -= 10;

				counter ++;
						
			}
				
			System.out.println( counter + " Tens");
			
			counter = 0;
			
			while (change >= 5) { 
					
				change -= 5;
					
				counter ++;
					
			}
				
			System.out.println( counter + " Fives");
			
			counter = 0;

			while (change >= 1) { 
				
				change -= 1;
				
				counter ++;
				
			}
			
			System.out.println( counter + " Ones");
			
			counter = 0;
		
			while (change >= 0.25) { 
			
				change -= 0.25;
			
				counter ++;
			
			}
		
			System.out.println( counter + " Quarters");
		
			counter = 0;
	
			while (change >= 0.1) { 
			
				change -= 0.1;
			
				counter ++;
			
			}
		
			System.out.println( counter + " Dimes");
		
			counter = 0;
			while (change >= 0.05) { 
				
				change -= 0.05;
				
				counter ++;
				
			}
			
			System.out.println( counter + " Nickels");
			
			counter = 0;
			
//			System.out.println(change);
			
			while (change >= 0.009) { 
				
				change -= 0.01;
				
				counter ++;
				
				
			}
			
			System.out.println( counter + " Pennies");
			
		
		}
		
		kb.close();	
	}

}
