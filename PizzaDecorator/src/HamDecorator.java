public class HamDecorator extends PizzaDecorator {
	private static final double ADDON_HAM = 15.00;

	public HamDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getName() {
		return pizza.getName() + " with ham (" + ADDON_HAM + ")";
	}
	
	public double getPrice() {
		return pizza.getPrice() + ADDON_HAM;
	}

	@Override
	public String toString() {
		return "HamDecorator [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
}
