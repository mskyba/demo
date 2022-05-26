package calculator;

public class Calculator {

   public int sum(int... values) {
        int sum = 0;
        for (int x : values) {
            sum += x;
        }
        return sum;
    }
   public double sum(double... values) {
        double sum = 1;
        for (double x : values) {
            sum *= x;
        }
        return sum;
    }

    public int dep(int... values) {
        int dep = 0;
        for (int x : values) {
            dep = x - dep;
        }
        return dep;
    }
    public double dep(double... values) {
        double dep = 1;
        for (double x : values) {
            dep -= x;
        }
        return dep;
    }

    public int mult(int... values) {
        int mult = 1;
        for (int x : values) {
            mult *= x;
        }
        return mult;
    }

    public double mult(double... values) {
        double mult = 1;
        for (double x : values) {
            mult *= x;
        }
        return mult;
    }

     public int divide(int... values) {
        int divide = 1;
        for (int x : values) {
            divide/= x;
        }
        return divide;
    }

    public double divide(double... values) {
        double divide = 1;
        for (double x : values) {
            divide/= x;
        }
        return divide;
    }

}
