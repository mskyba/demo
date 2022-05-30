package toymarket;

public abstract class Toy {

    private String name;
    private int price;


    protected Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }
     public String getName() {
        return this.name;
     }

    public int getPrice() {
        return price;
    }
}
