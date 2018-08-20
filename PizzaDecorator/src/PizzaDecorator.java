public class PizzaDecorator extends Pizza{
	protected Pizza pizza;

	@Override
	public String getName() {
		return pizza.getName();
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

}
