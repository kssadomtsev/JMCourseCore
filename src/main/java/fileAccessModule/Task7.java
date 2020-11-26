package main.java.fileAccessModule;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner lineScanner = new Scanner(System.in);
        while (lineScanner.hasNext()) {
            if (lineScanner.hasNextDouble()) {
                double d = lineScanner.nextDouble();
                sum += d;
            } else {
                lineScanner.next();
            }
        }
        lineScanner.close();
        System.out.printf("%.6f", sum);
    }
}
