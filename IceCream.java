/**
 * Uninstantiable ice cream class which allows the calculation of the total cost
 * and contains the description variable. 
 * @author Nick Bautista
 *
 */
public abstract class IceCream {
	
	protected String description; //Contains what the flavor of the ice cream is and what the toppings are.
	
	/**
	 * Returns the description variable including any toppings that were added when the toppings classes were called.
	 */
	public String toString() {
		return this.description;
	}
	/**
	 * Calculates the total price of the ice cream which differs depending on the flavor and toppings added.
	 */
	public abstract double getCost();
}
	