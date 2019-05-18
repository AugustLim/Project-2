package project1sp19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Vender
{


	
	public static void main(String[]args) throws NotEnoughFundsException, TooMuchFundsException, ItemOutOfStockException
	
		{
			Item A0 = new Item("Drumstick", "A0", 1.25, 10);
			Item A1= new Item("Ice Cream Sandwhich","A1", 1.00, 10);
			Item A2= new Item("Cookie Ice Cream Sandwhich", "A2", 1.25, 10);
			Product	B0= new Product("Dreamsickle", "B0", 1.00, 10);
			Product B1= new Product("Fudge Bar", "B1", 1.00, 10);
			Product B2= new Product("Strawberry and Cream Bar","B2", 1.25, 10);
			Product C0= new Product("Snickers Bar", "C0", 1.75, 10);
			Product C1= new Product("Twix Bar", "C1", 1.50, 10);
			Product C2= new Product("Popsickle", "C2", 0.75, 10);
			
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
			
			
			while( true )
			{
				try
				{
							NotEnoughFundsException NotEnoughFundsException = 
									new NotEnoughFundsException("Sorry, we don't speak broke, so no ice cream for you");
							TooMuchFundsException TooMuchFundsException =
									new TooMuchFundsException("Sorry, you're rich. We don't accept money over $10");
							ItemOutOfStockException ItemOutOfStockException =
									new ItemOutOfStockException("Sorry, all the ice cream has been eaten");
							
							
							
							
							double money;
							String name;
							double MAX = 10.00;
					
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
							
							System.out.println("Give me your money to select an item. Nothing over $10 will be accepted.");
							Scanner scan = new Scanner(System.in);
							money = scan.nextDouble();
							
						if(money <= MAX)
						{
						
							System.out.println("Select the Call Number that you'd like to eat");
							Scanner can = new Scanner(System.in);
							name= can.nextLine();
							name = name.trim();
							System.out.println(name);
							
							//"this is a lot of if statements, prof jones." - Anthony Nguyen *finger guns*
							if(name.equals("A0"))
							{
			
								if(money >= A0.getPrice() && A0.getStock()>0)
								{
									if(A0.canVend() == true)
									{
										
										A0.vend();
										System.out.println("Collect your item.");
										System.out.println(money - A0.getPrice() + " is your change");		
									}
									else
									{
										if(A0.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<A0.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
									
								}
							}
							else if(name.equals("A1"))
							{
								
								if(money >= A1.getPrice() && A0.getStock()>0)
								{
									System.out.println("a1 more");
									if(A1.canVend() == true)
									{
										A1.vend();
										System.out.println(money - A1.getPrice() + " is your change");		
									}
									else
									{
										if(A1.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
										if(money<A1.getPrice())
										{
											System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
											throw NotEnoughFundsException;
										}
								}
							}
							else if(name.equals("A2"))
							{
								if(money >= A2.getPrice() && A2.getStock() >0)
								{
									if(A2.canVend() == true)
									{
										A2.vend();
										System.out.println(money-A2.getPrice() + " is your change");		
									}
									else
									{
										if(A2.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<A2.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if(name.equals("B0"))
							{
								
								if(money >= B0.getPrice() && B0.getStock() >0)
								{
									if(B0.canVend() == true)
									{
										B0.vend();
										System.out.println(money-B0.getPrice() + " is your change");		
									}
									else
									{
										if(B0.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<B0.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if(name.equals("B1"))
							{
								if(money >= B1.getPrice() && B1.getStock() > 0)
								{
									if(B1.canVend() == true)
									{
										B1.vend();
										System.out.println(money-B1.getPrice() + " is your change");		
									}
									else
									{
										if(B1.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<B1.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if(name.equals("B2"))
							{
								if(money >= B2.getPrice() && B2.getStock() >0)
								{
									if(B2.canVend() == true)
									{
										B2.vend();
										System.out.println(money-B2.getPrice() + " is your change");		
									}
									else
									{
										if(B2.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<B2.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if(name.equals("C0"))
							{
								if(money >= C0.getPrice() && C0.getStock() >0)
								{
									if(C0.canVend() == true)
									{
										C0.vend();
										System.out.println(money-C0.getPrice() + " is your change");		
									}
									else
									{
										if(C0.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
										}
								}
								else
								{
									if(money<C0.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if(name.equals("C1"))
							{
								if(money >= C1.getPrice() && C1.getStock() >0)
								{
									if(C1.canVend() == true)
									{
										C1.vend();
										System.out.println(money-C1.getPrice() + " is your change");		
									}
									else
									{				
										if(B1.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<C1.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if(name.equals("C2"))
							{
								System.out.println("tester");
								System.out.println(money);
								if(money >= C2.getPrice() && C2.getStock() >0)
								{
									System.out.println("money");
									if(C2.canVend() == true)
									{
										C2.vend();
										System.out.println(money-C2.getPrice() + " is your change");		
									}
									else
									{			
										if(C2.getStock() <= 0)
										{
										System.out.println("Sorry, This item is out of stock. Here's your money back"+ money);
										throw ItemOutOfStockException;
										}
									}
								}
								else
								{
									if(money<C2.getPrice())
									{
										System.out.println("Sorry, you can't have ice cream. Here is your money back"+ money);
										throw NotEnoughFundsException;
									}
								}
							}
							else if (name.equalsIgnoreCase("quit"))
							{
								break;
							}
							else
							{
								System.out.println("Invalid input");
							}
						}
						else
						{
							if(money > MAX)
							{
								System.out.println("Here is your money back $" + money);
								throw TooMuchFundsException;
							}
						}
					}
					catch(NotEnoughFundsException NotEnoughFundsException)
					{
						System.out.println();
						System.out.println(NotEnoughFundsException.getMessage());
						System.out.println("Sorry, you're broke. No ice cream for you");
						System.out.println("The call stack trace:");
						NotEnoughFundsException.printStackTrace();
						System.out.println();
					}
					catch(TooMuchFundsException TooMuchFundsException)
					{
						System.out.println();
						System.out.println(TooMuchFundsException.getMessage());
						System.out.println("Sorry, you're rich. No ice cream for you");
						System.out.println("The call stack trace:");
						TooMuchFundsException.printStackTrace();
						System.out.println();
					}
					catch(ItemOutOfStockException ItemOutOfStockException)
					{
						System.out.println();
						System.out.println(ItemOutOfStockException.getMessage());
						System.out.println("Sorry, you're broke. No ice cream for you");
						System.out.println("The call stack trace:");
						ItemOutOfStockException.printStackTrace();
						System.out.println();
					}	
			}
		}			
	}



