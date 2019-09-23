/**
 * Toppings class which modifies values of ice cream class.
 * @author Nick Bautista
 *
 */
public class ChocolateChips extends ToppingsDecorator {
	private IceCream iceCream;
	/**
	 * Reinitializes ice cream class in order to modify its values.
	 * @param iceCream
	 * Ice cream with declared flavor 
	 */
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	/**
	 * Adds chocolate chips to the description of the ice cream.
	 */
	public String toString() {
		this.iceCream.description = iceCream.toString() + " + chocolate chips";
		return this.iceCream.description;
	}
	
	/**
	 * Adds the price of chocolate chips to the total cost.
	 */
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}
}
