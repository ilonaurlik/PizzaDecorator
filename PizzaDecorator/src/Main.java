/**
 * The program allows to add new ingredients(Ham and Cheese) to object Pizza by using decorator pattern. 
 * It calculates new price after adding one or two ingredients. The program adds the names and price of ingredients to 
 * the name of the Pizza.
 */

public class Main {

	public static void main(String[] args) {
		Pizza largePizza = new LargePizza();
		Pizza largePizzaWithCheese = new CheeseDecorator(largePizza);
		Pizza largePizzaWithCheeseAndHam = new HamDecorator(new CheeseDecorator(new CheeseDecorator(largePizza)));
		
		System.out.println(largePizzaWithCheeseAndHam);
	}

}
