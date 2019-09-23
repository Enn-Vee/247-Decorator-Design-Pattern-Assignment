/**
 * Toppings class which modifies values of ice cream class.
 * @author Nick Bautista
 *
 */
public class Cherry extends ToppingsDecorator {
	private IceCream iceCream;
	/**
	 * Reinitializes ice cream class in order to modify its values.
	 * @param iceCream
	 * Ice cream with declared flavor 
	 */
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	/**
	 * Adds cherry to the description of the ice cream.
	 */
	public String toString() {
		this.iceCream.description = iceCream.toString() + " + a cherry on top";
		return this.iceCream.description;
	}
	
	/**
	 * Adds the price of a cherry to the total cost.
	 */
	public double getCost() {
		return iceCream.getCost() + 0.4;
	}
}
