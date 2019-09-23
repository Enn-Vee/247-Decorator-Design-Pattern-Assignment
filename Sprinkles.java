/**
 * Toppings class which modifies values of ice cream class.
 * @author Nick Bautista
 *
 */
public class Sprinkles extends ToppingsDecorator {
	private IceCream iceCream;
	/**
	 * Reinitializes ice cream class in order to modify its values.
	 * @param iceCream
	 * Ice cream with declared flavor 
	 */
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
		
	/**
	 * Adds sprinkles to the description of the ice cream.
	 */
	public String toString() {
		this.iceCream.description = iceCream.toString() + " + sprinkles";
		return this.iceCream.description;
	}
	
	/**
	 * Adds the price of Sprinkles to the total cost.
	 */
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}
}
