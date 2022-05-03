import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("sum " + calculator.sum(2.3,3, 3));
        System.out.println("dep " + calculator.dep(4,2.3));
        System.out.println("mult  " + calculator.mult(2.2,3.1));
        System.out.println("divide  "+calculator.divide(2.1,4.2));

//        Cat cat = new Cat();
//
//        cat.name = "Barsik";
//        cat.say(1);
//        cat.say("za");
    }
}
