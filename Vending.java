package project1sp19;
/*
 * Author: Sarah Lowrey with lots of help from Jason Wu
 * 
 * This program is meant to mimic a vending machine by using an array and going through IF/ELSE statements to determine which ice cream bar 
 * a customer wants and if they have enough money inserted to pay for it. If there is no more stock, then it will say that the item does not 
 * exist, but continue the loop. The customer may quit if they type "quit". 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vending 
{
	

	public static void main(String[]args)
	{
		Product A0 = new Product("Drumstick", "A0", 1.25, 0);
		Product A1= new Product("Ice Cream Sandwhich","A1", 1.00, 1);
		Product A2= new Product("Cookie Ice Cream Sandwhich", "A2", 1.25, 1);
		Product	B0= new Product("Dreamsickle", "B0", 1.00, 1);
		Product B1= new Product("Fudge Bar", "B1", 1.00, 1);
		Product B2= new Product("Strawberry and Cream Bar","B2", 1.25, 1);
		Product C0= new Product("Snickers Bar", "C0", 1.75, 1);
		Product C1= new Product("Twix Bar", "C1", 1.50, 1);
		Product C2= new Product("Popsickle", "C2", 0.75, 1);
		Product YES= new Product(null, "YES", 0, 0);
		Product NO= new Product(null, "NO", 0, 0);
		Product MAYBE= new Product(null, "MAYBE", 0, 0);
		
		
		ArrayList<String> CallNumber = new ArrayList<String>();
		CallNumber.add("A0");
		CallNumber.add("A1");
		CallNumber.add("A2");
		CallNumber.add("B0");
		CallNumber.add("B1");
		CallNumber.add("B2");
		CallNumber.add("C0");
		CallNumber.add("C1");
		CallNumber.add("C2");
		CallNumber.add("YES");
		CallNumber.add("NO");
		CallNumber.add("MAYBE");
		
		
		while( true )
		{
			double money;
			String name;
			String yes ="";
			String no ="";
			String maybe;
			
		
			List<String>First = new ArrayList<String>();
			First.add("Drumstick, A0, $1.25");
			First.add("Ice Cream Sandwhich, A1, $1.00");
			First.add("Cookie Ice Cream Sandwhich, A2, $1.25");
			
			List<String>Second = new ArrayList<String>();
			Second.add("Dreamsickle, B0, $1.00");
			Second.add("Fudge Bar, B1, $1.00");
			Second.add("Strawberry and Cream Bar, B2, $1.25");
	
			List<String>Third = new ArrayList<String>();
			Third.add("Snickers Bar, C0, $1,75");
			Third.add("Twix Bar, C1, $1.50");
			Third.add("Popsickle, C2, $0.75");
			
			System.out.println(First);
			System.out.println(Second);
			System.out.println(Third);
			
			System.out.println("Give me your money to select an item.");
			Scanner scan = new Scanner(System.in);
			money = scan.nextDouble();
		
			System.out.println("Select the Call Number that you'd like to eat");
			Scanner can = new Scanner(System.in);
			name= can.nextLine();
			
			if(name.equals(A0.getPosition()))
			{

				if(money >= A0.getPrice())
				{
					if(A0.canVend() == true)
					{
						A0.vend();
						System.out.println(money-A0.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("I heard that you aren't going with anyone to prom...Would you like to go with me?");
						Scanner prom = new Scanner(System.in);
						name= prom.nextLine();
					}	
						
						if(name.equals(YES.getPosition()))
						{
							System.out.println("I'm honored. This night will be magical.");
						}
						else if(name.equals(NO.getPosition()))
						{
							System.out.println("Wow, you'd rather play Magic than dance with me?");
						}
						else if(name.equals(MAYBE.getPosition()))
						{
							System.out.println("I'll let you think about it.");
						}
						else
						{
							System.out.println("Sorry, this is a little awkard...the choices are YES, NO, or MAYBE");
						}
				}		
			}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			
		/*	else if(name.equals(A1.getPosition()))
			{
				if(money >= A1.getPrice())
				{
					if(A1.canVend() == true)
					{
						A1.vend();
						System.out.println(money-A1.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("That item does not exist.");
					}
				}
					else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(A2.getPosition()))
			{
				if(money >= A2.getPrice())
				{
					if(A2.canVend() == true)
					{
						A2.vend();
						System.out.println(money-A2.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("That item does not exist.");
					}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(B0.getPosition()))
			{
				if(money >= B0.getPrice())
				{
					if(B0.canVend() == true)
					{
						B0.vend();
						System.out.println(money-B0.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("That item does not exist.");
					}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(B1.getPosition()))
			{
				if(money >= B1.getPrice())
				{
					if(B1.canVend() == true)
					{
						B1.vend();
						System.out.println(money-B1.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("That item does not exist.");
					}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(B2.getPosition()))
			{
				if(money >= B2.getPrice())
				{
					if(B2.canVend() == true)
					{
						B2.vend();
						System.out.println(money-B2.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("That item does not exist.");
					}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(C0.getPosition()))
			{
				if(money >= C0.getPrice())
				{
					if(C0.canVend() == true)
					{
						C0.vend();
						System.out.println(money-C0.getPrice() + " is your change");		
					}
					else
					{
						System.out.println("That item does not ");
						}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(C1.getPosition()))
			{
				if(money >= C1.getPrice())
				{
					if(C1.canVend() == true)
					{
						C1.vend();
						System.out.println(money-C1.getPrice() + " is your change");		
					}
					else
					{				
						System.out.println("That item does not exist.");
					}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if(name.equals(C2.getPosition()))
			{
				if(money >= C2.getPrice())
				{
					if(C2.canVend() == true)
					{
						C2.vend();
						System.out.println(money-C2.getPrice() + " is your change");		
					}
					else
					{			
						System.out.println("That item does not exist.");
					}
				}
				else
				{
					System.out.println("Sorry, you can't have ice cream.");
				}
			}
			else if (name.equalsIgnoreCase("quit"))
			{
				break;
			}
			else
			{
				System.out.println("Invalid input");
			}*/
		
			System.out.println(" ");
		}	
	}
}

