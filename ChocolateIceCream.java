
public class ChocolateIceCream extends IceCream {
	/**
	 * Adds the flavor of the ice cream to its description.
	 */
	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}
	
	/**
	 * The initial cost of the ice cream before any toppings. 
	 */
	public double getCost() {
		return 0.9;
	}
}
