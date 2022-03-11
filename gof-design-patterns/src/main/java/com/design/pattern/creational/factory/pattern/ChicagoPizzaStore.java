package com.design.pattern.creational.factory.pattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if (type.equals("Farm House")) {
			pizza = new FarmHouse();
		} else if (type.equals("Cheese and Corn")) {
			pizza = new CheeseAndCorn();
		}

		return pizza;
	}

}
