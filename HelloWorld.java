/**
 *Name: Gia Boi Lac
 * File: Homework 1
 *Description: User chosing stock
 */


import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Stock Selector App!" );
		System.out.println("Enter the total amount of money you are willing to invest: " );
		double investmoney =  input.nextDouble();
		
		input.nextLine();
		System.out.println("Please enter the stock ticker: " );
		String stockticker = input.nextLine();
		
		if (stockticker.length()  > 5)
		{
			System.out.println("Invalid input. Please try again." );
			System.out.println("Please enter the stock ticker: " );
			String stockticker1 = input.nextLine();
			stockticker = stockticker1;
			
		}
		
		System.out.println("Please enter the stock price: ");
		double stockprice1 = input.nextDouble();
		if (stockprice1  < 5.00)
		{
			System.out.println("Invalid input. Please try again." );
			System.out.println("Please enter the stock price: " );
			Double stockprice2 = input.nextDouble();
			stockprice1 = stockprice2; 
			System.out.println("You entered: " + stockprice1);
		}
		
		System.out.println("Please enter the price-to-earnings(P/E) ratio: ");
		double pe = input.nextDouble();
		
		System.out.println("Below are your results: ");
		System.out.println("Stock: " + stockticker);
		System.out.println("Price: $" + stockprice1);
		System.out.println("P/E ratio: " + (int) pe);
		
		if (pe  > 75)
		{
			System.out.println("This stock may be overvalued. Procced with caution!" );
		}
		
		int share = (int) ( investmoney / stockprice1);
		
		System.out.println("# of shares able to purchase: " + share);
	}
}
