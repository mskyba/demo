package calculatordemo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private String expression;
    private Pattern pattern;
    private Matcher matcher;

    private ArrayList<Integer> results = new ArrayList<>();


    public InputHelper() {

    }
    public void readInput(String expression) {
        this.expression = expression;
        matchedString();
        groupingDigits();
        displayNumbers();
    }

    public void displayNumbers() {
        System.out.println("Number of digits: " + results.size());
        for (int i : results) {
            System.out.print(i + "; ");

        }
        System.out.println();
        System.out.print("Amount of numbers: ");
    }


    private void matchedString() {
        pattern = Pattern.compile("\\d+");
        matcher = pattern.matcher(expression);
    }

    private void groupingDigits() {
        while (matcher.find()) {
            int i = Integer.parseInt(matcher.group());
            results.add(i);
        }
    }

    public ArrayList<Integer> getDigits() {

        return results;
    }

}
