import java.util.ArrayList;

public class Shop {


    public static ArrayList<Out> getItems() {

        ArrayList<Out> list = new ArrayList<>();

        Books books1 = new Books("Harry Potter");
        Books books2 = new Books("War&Peace");
        Books books3 = new Books("Robinson Kruzo");
        list.add(books1);
        list.add(books2);
        list.add(books3);


        Magazines magazines1 = new Magazines("BMW");
        Magazines magazines2 = new Magazines("Playgirl :D");
        Magazines magazines3 = new Magazines("Spiegel");
        list.add(magazines1);
        list.add(magazines2);
        list.add(magazines3);



        return list;
    }
}
