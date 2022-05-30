package toymarket;

public class Doll extends Toy{


    private String colorOfHair;

    public Doll(String name, int price, String colorOfHair) {
        super(name, price);
        this.colorOfHair = colorOfHair;
    }
}
