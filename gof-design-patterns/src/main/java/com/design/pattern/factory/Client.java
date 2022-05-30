package com.design.pattern.factory;

public class Client {

	public static void main(String[] args) {
		
		// Customer enters NYPizzaStore
		PizzaStore nyPizzaStore = new NYPizzaStore();
		// Customer enters ChicagoPizzaStore
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		// customer orders pizza
		Pizza pizza_1 = nyPizzaStore.orderPizza("Margherita");		
		Pizza pizza_2 = chicagoPizzaStore.orderPizza("Cheese and Corn");
		
		
//		System.out.println(pizza_1);
//		System.out.println(pizza_2);
		
	}
}
