public class Calculator {

    int sum(int... values) {
        int sum = 0;
        for (int x : values) {
            sum += x;
        }
        return sum;
    }
    double sum(double... values) {
        double sum = 1;
        for (double x : values) {
            sum *= x;
        }
        return sum;
    }

    int dep(int... values) {
        int dep = 0;
        for (int x : values) {
            dep = x - dep;
        }
        return dep;
    }
    double dep(double... values) {
        double dep = 1;
        for (double x : values) {
            dep -= x;
        }
        return dep;
    }

    int mult(int... values) {
        int mult = 1;
        for (int x : values) {
            mult *= x;
        }
        return mult;
    }

    double mult(double... values) {
        double mult = 1;
        for (double x : values) {
            mult *= x;
        }
        return mult;
    }

    int divide(int... values) {
        int divide = 1;
        for (int x : values) {
            divide/= x;
        }
        return divide;
    }

    double divide(double... values) {
        double divide = 1;
        for (double x : values) {
            divide/= x;
        }
        return divide;
    }

}
