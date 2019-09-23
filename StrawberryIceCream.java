
public class StrawberryIceCream extends IceCream {
	/**
	 * Adds the flavor of the ice cream to its description.
	 */
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	
	/**
	 * The initial cost of the ice cream before any toppings. 
	 */
	public double getCost() {
		return 0.8;
	}
}
