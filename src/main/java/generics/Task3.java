package main.java.generics;

import java.util.Objects;

public class Task3 {
public static class Pair<T, V> {
    private final T value1;
    private final V value2;

    private Pair(T value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static <T, V> Pair<T, V> of(T value1, V value2) {
        return new Pair<>(value1, value2);
    }

    public T getFirst() {
        return value1;
    }

    public V getSecond() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(value1, pair.value1) &&
                Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }
}


    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);

    }
}
