import java.util.List;

public class Books implements Out {

    private final String name;

    Books(String name) {

        this.name = name;
    }

    @Override
    public void print() {

        System.out.println(name);
    }


    public static void printBook(List<Out> out) {
        for (Out p : out) {
            if (p instanceof Books) {
                System.out.print("Book: ");
                p.print();
            }
        }
    }
}
