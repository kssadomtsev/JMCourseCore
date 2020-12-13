package main.java.fInterfacesStreams;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task5 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Object[] items = stream.sorted(order).toArray();
        if (items.length == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept((T) items[0], (T) items[items.length - 1]);
        }

    }

    public static void main(String[] args) {
        findMinMax(Stream.of(1, 2, 6, 3, 0), Comparator.naturalOrder(), (x, y) -> System.out.println(x + " " + y));
    }
}
