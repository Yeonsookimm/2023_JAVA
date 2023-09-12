
package Week02_KYS;



class Circle {
    protected int radius; 

    public Circle(int r) {
        radius = r;
    }
}

class Pizza extends Circle {
    private String pizzaName;

    public Pizza(String name, int radius) {
        super(radius);
        pizzaName = name;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void print() {
        System.out.println("Pizza Name: " + getPizzaName());
        System.out.println("Radius: " + radius);
    }
}

public class CirclePizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pepperoni Pizza", 20);
        pizza.print();
    }
}