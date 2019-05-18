
public abstract class Vendable2_0 
{
	abstract String getName();
	abstract double getPrice();
	abstract void setPrice(double newPrice);
	abstract int getStock();
	abstract void addStock(int newStock);
	abstract boolean canVend();
	abstract boolean vend();
}
