package com.design.pattern.factory;

public abstract class PizzaStore {
	
//	SimplePizzaFactory factory;
//	
//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		pizza.cut();
		
		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
