// Task 1: Online Food Delivery System
// Scenario: An online food delivery application supports multiple restaurants. Every restaurant follows a common ordering process, but each restaurant has its own menu and pricing.

// Requirements:
// 1. Create an abstract class Restaurant.
// 2. Declare an abstract method displayMenu().
// 3. Declare an abstract method calculateBill().
// 4. Create child classes PizzaRestaurant and BurgerRestaurant.
// 5. Implement both methods differently in each child class.
// 6. Create objects of both child classes and display their menus and bills.

abstract class Restaurant{
    abstract void displayMenu();
    abstract double calculateBill(double bill);
}

class PizzaRestaurant extends Restaurant{
    @Override
    void displayMenu(){
        System.out.println("Displaying from Pizza");
    }

    @Override
    double calculateBill(double bill){
        return bill + (bill * 0.16)+500;
    }
}

class BurgerRestaurant extends Restaurant{
    @Override
    void displayMenu(){
        System.out.println("Displaying from Burger");
    }

    @Override
    double calculateBill(double bill){
        return bill + (bill * 0.18);
    }
}

public class abstct{
    public static void main(String[] args){
        Restaurant p = new PizzaRestaurant();
        Restaurant b = new BurgerRestaurant();

        p.displayMenu();
        System.out.println(p.calculateBill(645));
        b.displayMenu();
        System.out.println(b.calculateBill(367));
    }
}