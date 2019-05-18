/*Writeup: This program starts by creating items in different classes, naming them, giving them prices, setting their stock 
quantity, and putting them into an array. The classes of the items are child classes of an abstract class. The prices and stock
count are determined randomly within certain limits. The items' names, prices, and stock count are then laid out in a grid. A 
switch statement then presents the user with a variety of options. The switch statement is run over and over until the option 
to terminate the loop is selected. To purchase an item, money must be put into the machine so that there are sufficient funds 
to buy that item. If money is not sufficient or the stock is out, an exception is thrown and caught and the user is told either
that the stock is out or they have entered insufficient funds. Money remaining in the machine can be checked and withdrawn. An 
option allows the user to look at the names, prices, and stock of all the items again and the last option ends the program.*/

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class MyVendingMachineRedux {

	public static void main(String[] args) {
		JunkFood A1, A2, A3;
		Drinks B1, B2, B3;
		Objects C1, C2, C3;
		
		//creates all the items and puts them into an array called array
		
				A1 = new JunkFood();
				A2 = new JunkFood();
				A3 = new JunkFood();
				B1 = new Drinks();
				B2 = new Drinks();
				B3 = new Drinks();
				C1 = new Objects();
				C2 = new Objects();
				C3 = new Objects();
				
				Vendable2_0[] array = new Vendable2_0[9];

				array[0] = A1;
				array[1] = B1;
				array[2] = C1;
				array[3] = A2;
				array[4] = B2;
				array[5] = C2;
				array[6] = A3;
				array[7] = B3;
				array[8] = C3;

				//sets the name of each item
				
				A1.setName("Chips");
				A2.setName("Choco");
				A3.setName("Candy");
				B1.setName("Cola");
				B2.setName("Water");
				B3.setName("Milk");
				C1.setName("Umbrella");
				C2.setName("Pencil");
				C3.setName("Marbles");		

				//sets the price of each item
				
				Random generator = new Random();
				
				A1.setPrice(generator.nextInt(10));
				A2.setPrice(generator.nextInt(10));
				A3.setPrice(generator.nextInt(10));
				B1.setPrice(generator.nextInt(10));
				B2.setPrice(generator.nextInt(10));
				B3.setPrice(generator.nextInt(10));
				C1.setPrice(generator.nextInt(10));
				C2.setPrice(generator.nextInt(10));
				C3.setPrice(generator.nextInt(10));

				//sets the stock for each item to 10
				
				for (int number = 0; number < 9; number ++)
				{
					array[number].addStock(generator.nextInt(15));
				}
				
				//allows number to be formatted like currency
				
				NumberFormat dollar = NumberFormat.getCurrencyInstance();
				
				//prints out all the food items with prices and stock in a grid
				
				System.out.println("Vending Machine:");
				for (int number = 0; number < 9; number += 3)
				{
					for (int count = number; count < number + 3; count ++)
					{
						System.out.print(array[count].getName() + "\t\t");
					}
					System.out.println();
					
					for (int count = number; count < number + 3; count ++)
					{
						System.out.print(dollar.format(array[count].getPrice()) + "\t\t");
					}
					System.out.println();
					
					for (int count = number; count < number + 3; count ++)
					{
						System.out.print("Stock: " + array[count].getStock() + "\t");
					}
					System.out.println();
					System.out.println();
				}
				
				Scanner scan = new Scanner(System.in);
				int order;
				double moneyIn;
				double totalMoney = 0.00;
				NotEnoughMoneyException moneyProblem = new NotEnoughMoneyException("Insufficient funds");
				
				do {
				System.out.println("Here are your options:");
				System.out.println("1. Put money in the machine");
				System.out.println("2. Buy item(s)");
				System.out.println("3. Check funds");
				System.out.println("4. Withdraw money");
				System.out.println("5. Take another look at the items");
				System.out.println("6. Leave");
				System.out.println();

				order = scan.nextInt();

				//user types in the number corresponding to what they want to do
				
				switch (order)
				{
					case 1:
						System.out.println("How much money would you like to put in?");
						System.out.print("$");
						moneyIn = scan.nextDouble();
						totalMoney = totalMoney + moneyIn;
						System.out.println("Total balance: " + dollar.format(totalMoney));
						System.out.println();
						break;
					case 2:
						System.out.println("What would you like to buy?");
						for (int number = 0; number < 9; number ++)
						{
							System.out.println((number + 1) + ". " + array[number].getName());
						}
						order = scan.nextInt();
						if (array[(order - 1)].canVend() == true && totalMoney >= array[(order - 1)].getPrice()) {
							array[(order - 1)].vend();
							totalMoney = totalMoney - array[(order - 1)].getPrice();
							System.out.println();
						}
						else {
							if (array[(order - 1)].getStock() == 0) {
								System.out.println("Out of stock");
								System.out.println();
							}
							else {
								try
								{
									throw moneyProblem;
								}
								catch (NotEnoughMoneyException exception)
								{
									System.out.println("Insufficient funds");
								}
								System.out.println();
							}
						}
						break;
					case 3:
						System.out.println("You have: " + dollar.format(totalMoney));
						System.out.println();
						break;
					case 4:
						totalMoney = 0;
						System.out.println("Money withdrawn");
						System.out.println();
						break;
					case 5:
						for (int number = 0; number < 9; number += 3)
						{
							for (int count = number; count < number + 3; count ++)
							{
								System.out.print(array[count].getName() + "\t\t");
							}
							System.out.println();
							
							for (int count = number; count < number + 3; count ++)
							{
								System.out.print(dollar.format(array[count].getPrice()) + "\t\t");
							}
							System.out.println();
							
							for (int count = number; count < number + 3; count ++)
							{
								System.out.print("Stock: " + array[count].getStock() + "\t");
							}
							System.out.println();
							System.out.println();
						}
						break;
					case 6:
						System.out.println("Thank you, have a nice day");
						System.out.println();
						break;
					default:
						System.out.println("I am confusion");
						System.out.println();
						break;
				}
				}
				while (order != 6);
			}
	}
