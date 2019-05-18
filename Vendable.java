package project1sp19;

public abstract class Vendable 
{
	abstract String getName();
	abstract double getPrice();
	abstract void setPrice(double newPrice);
	abstract int getStock();
	abstract void addStock(int newStock);
	abstract boolean canVend();
	abstract boolean vend();
}

