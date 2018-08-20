public class CheeseDecorator extends PizzaDecorator {
	private static final double ADDON_CHEESE = 10.00;

	public CheeseDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getName() {
		return pizza.getName() + " with cheese (" + ADDON_CHEESE + ")";
	}
	
	public double getPrice() {
		return pizza.getPrice() + ADDON_CHEESE;
	}

	@Override
	public String toString() {
		return "CheeseDecorator [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
	
}
