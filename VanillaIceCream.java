
public class VanillaIceCream extends IceCream {
	/**
	 * Adds the flavor of the ice cream to its description.
	 */
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}
	
	/**
	 * The initial cost of the ice cream before any toppings. 
	 */
	public double getCost() {
		return 0.75;
	}
}
