package main.java.collections;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayDeque<String> numbers = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int currentIndex = 0;
        while (scanner.hasNext()) {
            String i = scanner.next();
            if (currentIndex % 2 != 0) {
                numbers.addFirst(i);
            }
            currentIndex++;
        }
        System.out.println(String.join(" ", numbers));
    }
}


