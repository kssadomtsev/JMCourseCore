package main.java;

public class Task0 {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    public static void main(String[] args) {
        System.out.println(charExpression(2));
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + '1' + "2");
        System.out.println("A" + 12);
        System.out.println('A' + "12");

    }
}
