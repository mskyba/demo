package calculator;

import java.util.Scanner;

public class ConsoleController {



        Scanner scanner = new Scanner(System.in);
        static void out(String value) {
            System.out.println(value);

        }
        static void out(int value) {
            System.out.println(value);

        }
        int readInt(){
            return scanner.nextInt();
        }
    }

