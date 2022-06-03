import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Out> outArrayList = Shop.getItems();
        Books.printBook(outArrayList);
        Magazines.printMagazine(outArrayList);

    }
}
