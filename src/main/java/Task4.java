package main.java;

import java.math.BigInteger;
import java.util.Arrays;

public class Task4 {
    public static BigInteger factorial(int value) {
        if (value > 1) {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        } else {
            return BigInteger.valueOf(1);
        }
    }

//    public static BigInteger factorial(int value) {
//        BigInteger result = BigInteger.ONE;
//        for (int i = 2; i <= value; i++) {
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        return result;
//    }

    public int determineGroup(int age) {
        if ((age >= 7) && (age <= 13)) {
            return 1;
        } else if ((age >= 14) && (age <= 17)) {
            return 2;
        } else if ((age >= 18) && (age <= 65)) {
            return 3;
        }
        return -1;
    }

    public int[] evenArray(int number) {
        int[] result = new int[number / 2];
        for (int i = 1; i < result.length; i++) {
            result[i] = i * 2;
        }
        return result;
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : arr) {
            if (a % 2 != 0) {
                stringBuilder.append(a).append(",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] mergedArray = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                mergedArray[k++] = a1[i++];
            } else {
                mergedArray[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            mergedArray[k++] = a1[i++];
        }
        while (j < a2.length) {
            mergedArray[k++] = a2[j++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 100});
        System.out.println(Arrays.toString(mergeArrays(new int[]{3, 5, 20, 8, 7, 3, 100}, new int[]{0, 2, 2})));
    }
}
