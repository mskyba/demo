import java.util.List;

public class Magazines implements Out {

    private final String name;

    @Override
    public void print() {

        System.out.println(name);
    }

    Magazines(String name) {

        this.name = name;
    }


    public static void printMagazine(List<Out> out) {

        for (Out p : out) {
            if (p instanceof Magazines) {
                System.out.print("Magazine: ");
                p.print();
            }
        }
    }
}
