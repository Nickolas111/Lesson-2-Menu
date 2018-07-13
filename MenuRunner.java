package com.nick.courses.oop.lesson2.task1;

public class MenuRunner {

	public static void main(String[] args) {
	  Menu breakfast = new Menu("Breakfast");
	  
	  	 breakfast.addDish(new Dish("Tea ", "Hot tea", 50));
	  	 breakfast.addDish(new Dish("Cereal ", "Crispy cereals with milk", 150));
	  	 breakfast.addDish(new Dish("Cookie ", "A sweet chocolate bakery", 200));
	  	 
	  Menu lunch = new Menu("Lunch ");
	  	 lunch.addDish(new Dish("Soup ", "Nutritional liquid with vegetables", 100));
	  	 lunch.addDish(new Dish("Steak ", "Juicy peace of meat", 400));
	  	 lunch.addDish(new Dish("Juice", "Fresh juice 250 ml", 90));
	  	 
	  	 System.out.println("The cheapest dish in the breakfast menu is " + breakfast.getCheapestDish().getName());
	  	 System.out.println("The cheapest dish in the lunch menu is " + lunch.getCheapestDish().getName());
	}
}
