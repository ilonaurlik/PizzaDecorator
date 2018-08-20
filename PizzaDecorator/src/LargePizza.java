public class LargePizza extends Pizza {

	@Override
	public String getName() {
		return "large pizza";
	}

	@Override
	public double getPrice() {
		return 20.00;
	}

	@Override
	public String toString() {
		return "LargePizza [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
	
}
