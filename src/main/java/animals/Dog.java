package animals;

public class Dog extends Animal implements price.Price {

    private int price;

    public Dog(String name, int age, int price) {
        super(name, age);
        this.price = price;
    }


    public void bark(){
        System.out.println("bark");

    }
    public int price(){
        return price;
    }
}
