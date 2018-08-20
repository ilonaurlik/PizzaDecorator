public class Main {

	public static void main(String[] args) {
		Pizza largePizza = new LargePizza();
		Pizza largePizzaWithCheese = new CheeseDecorator(largePizza);
		Pizza largePizzaWithCheeseAndHam = new HamDecorator(new CheeseDecorator(new CheeseDecorator(largePizza)));
		
		System.out.println(largePizzaWithCheeseAndHam);
	}

}
