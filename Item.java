package project1sp19;


public class Item extends Vendable
{
		private int stock;
		private String name;
		private double price;
		private String position;
		
		public Item(String name, String string, double price, int stock)
		{	
		
			this.stock = stock;
			this.name = name;
			this.price= price;
			this.position= string;
			
		}
		 String getName()				//returns name of item to vend
		{
			return name;
		}
		 String getPosition()
		{
			return position;					//returns position
		}
		 double getPrice()				//returns price of vendable
		{
			return price;
		}
		 void setPrice(double newPrice)	//sets vendable's price to newPrice
		{
		
		}
			int getStock()					//returns number of items vendable has
		{
			return this.stock;
		}
		 void addStock(int newStock)		//adds newStock to existing stock 
		{
			this.stock = this.stock + newStock;
		}
		 boolean canVend()				//returns True when stock to vend, otherwise false
		{
			if(stock>0)
				return true; 
			else			
				return false;
		}
		 boolean vend()					//returns True & reduces stock by one if vending is successful
		{
			if(canVend() == true)
			{
				stock= stock - 1;
				return true;
			}
			else
				return false; 
		}
	}


