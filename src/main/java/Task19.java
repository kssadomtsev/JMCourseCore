package main.java;

public class Task19 {
    public static void main(String[] args) {
        try {
            System.out.println("Before finally");
            throw new IndexOutOfBoundsException();
        } catch (ArithmeticException arithmeticException){

        } finally {
            System.out.println("In finally");
            throw new IllegalArgumentException();
        }

    }
}
