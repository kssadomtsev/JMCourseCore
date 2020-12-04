package main.java.fileAccessModule;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {
    public static void main(String[] args) throws IOException {
        byte[] initialArray = {0, 1, 2, -1, 4, 2};
        InputStream targetStream = new ByteArrayInputStream(initialArray);
        System.out.println(sumOfStream(targetStream));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int data;
        while ((data = inputStream.read()) != -1) {
            sum += (byte) data;
        }
        return sum;
    }
}
