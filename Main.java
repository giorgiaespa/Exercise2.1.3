import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(0, 30);
        int num2 = r.nextInt(0,3);
        isItPossible(num, num2);
    }

    public static double isItPossible(int num, int num2) throws ArithmeticException {
        double result = 0;
        try {
            result = num / num2;
            System.out.println(num + " : " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            if (num2 == 0) {
                System.out.println(num + " : " + num2 + " = " + e + ". non si può dividere per zero!");
            }
        }
        return result;
    }
}