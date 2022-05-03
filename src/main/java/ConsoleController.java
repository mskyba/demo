import java.util.Scanner;

public class ConsoleController {


    Scanner scanner = new Scanner(System.in);




    static void out(String value) {
        System.out.print(value);

    }

    static void out(int value) {
        System.out.print(value);
    }

    static void outNl(String value) {
        System.out.println(value);
    }

    int readInt() {
        System.out.print("Enter size: ");
        return scanner.nextInt();
    }


    void resultArrayOut(int[] array) {
        for (int x : array) {
            out("[" + x + "]");
        }
        outNl("");
    }

    int[] getArrayConsole() {
        int[] array;
        int size = readInt();
        array = new int[size];
        return fillArray(array);
    }

    int[] fillArray(int[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = readInt();

        }
        return array;
    }
}