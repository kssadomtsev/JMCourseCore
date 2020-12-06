package main.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 7, 8, 10));
        System.out.println(symmetricDifference(set1, set2));


    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        // union
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Difference
        Set<T> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);
        return symmetricDifference;
    }
}
