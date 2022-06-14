package animals;

import price.Price;
import toys.Toy;

public class Car extends Toy implements Price {

    private int price;

    public Car(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }


    public void beep(){
        System.out.println("beep");

    }
    public int price(){
        return price;
    }
}
