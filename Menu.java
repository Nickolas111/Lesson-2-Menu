/*Написать классы:
Dish (блюдо).
Свойства: название, описание, цена.
Menu (меню). 
Свойства: название, список блюд. 
Методы: добавление блюда, нахождение самого дешевого блюда.
Клиентский класс MenuRunner: создать 2 меню, каждое заполнить 3-я блюдами, протестировать функционал нахождения самого дешевого блюда
*/

package com.nick.courses.oop.lesson2.task1;
import java.util.ArrayList;

public class Menu {
	public final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu (String name) {
        this.name = name;
    }
    public void addDish(Dish dish) {
       dishes.add(dish);
    }
    public Dish getCheapestDish(){
       Dish cheapest=dishes.get(0);
        for (Dish d: dishes){
            if(d.getPrice()< cheapest.getPrice() )
                cheapest=d; }
                    return cheapest;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Menu's name is: " +this.name+" \nIt includes: " + this.dishes;
    }
}
