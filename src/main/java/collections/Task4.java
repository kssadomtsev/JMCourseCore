package main.java.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new FileReader("test.txt");
//        for (Map.Entry<String, Long> entry : getSalesMap(reader).entrySet()) {
//            System.out.println(entry);
//        }
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            map.merge(scanner.next(), scanner.nextLong(), Long::sum);
        }
        scanner.close();
        map.forEach((key, value) -> System.out.println(key + " " + value));
        return map;
    }
}
