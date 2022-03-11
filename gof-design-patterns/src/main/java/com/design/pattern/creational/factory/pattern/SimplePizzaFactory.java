package com.design.pattern.creational.factory.pattern;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if(type.equals("Margherita")) {
			pizza = new Margherita();
		} else if(type.equals("Double Cheese Margherita")) {
			pizza = new DoubleCheeseMargherita();
		} else if(type.equals("Farm House")) {
			pizza = new FarmHouse();
		} else if(type.equals("Cheese and Corn")) {
			pizza = new CheeseAndCorn();
		}
		
		return pizza;
	}
	
}
