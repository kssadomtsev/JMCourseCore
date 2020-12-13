package main.java.fInterfacesStreams;

import java.util.stream.IntStream;

public class Task4 {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i -> i * i / 10 % 1000);
    }

    public static void main(String[] args) {
        pseudoRandomStream(13).limit(10).forEach(System.out::println);
    }
}
