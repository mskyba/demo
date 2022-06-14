package animals;

public class Cat extends Animal implements price.Price {

    private int price;

    public Cat(String name, int age, int price) {
        super(name, age);
        this.price = price;
    }


    public void meow(){
        System.out.println("Meow");

    }
    public int price(){
        return price;
    }
}
