
public class JunkFood extends Vendable2_0 
{
	
	private String name;
	private double price; 
	private int stock;
	private boolean vendability;
	private double money;
	
	OutofStockException stockProblem = new OutofStockException("Out of stock");
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double newPrice)
	{
		price = newPrice;
	}
	
	public int getStock()
	{
		return stock;
	}

	public void addStock(int newStock)
	{
		stock = stock + newStock; 
	}
	
	public boolean canVend()
	{
		if (stock > 0) {
			vendability = true;
		}
		else {
			vendability = false;
		}
		return vendability;
	}
	
	public boolean vend()
	{
		if (stock > 0) {
			vendability = true;
			stock --;
			System.out.println("Vended");
		}
		else {
			vendability = false;
			try 
			{
				throw stockProblem;
			}
			catch (OutofStockException exception)
			{
				System.out.println("Out of stock");
			}
		}
		
		return vendability;
	}
}
