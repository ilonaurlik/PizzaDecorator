public class SmallPizza extends Pizza {

	@Override
	public String getName() {
		return "small pizza";
	}

	@Override
	public double getPrice() {
		return 10.00;
	}

	@Override
	public String toString() {
		return "SmallPizza [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

}
