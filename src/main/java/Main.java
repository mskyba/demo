import ToyMarket.Market;
import animals.Animal;

import animals.Car;
import animals.Cat;
import animals.Dog;
import toys.Doll;
import toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Buyer buyer = new Buyer(500);

        Animal dog = new Dog("Rex",9,80);
        Animal cat = new Cat("Rex",9,80);

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        Toy doll = new Doll("barbie", "brown", 30);
        Toy car = new Car("BMW", "blue",200);
        List<Toy> toys= new ArrayList<>();
        toys.add(doll);
        toys.add(car);

        Market<Animal> zooMarket= new Market<>(animals);
        zooMarket.getGoodByIndex(0).sayAnimal();

        Market<Toy> toyMarket = new Market<>(toys);
        toyMarket.getGoodByIndex(0).sayToy();
    }

}