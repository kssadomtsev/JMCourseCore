package main.java.fileAccessModule;

import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IOException {
        byte[] initialArray = {0, 1, 2, -1, 4, 2};
        InputStream inputStream = new ByteArrayInputStream(initialArray);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
        byte[] targetArray = outputStream.toByteArray();
        System.out.println(Arrays.toString(targetArray));
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
    int data = inputStream.read();
    while (data != -1) {
        if ((byte) data % 2 == 0) {
            outputStream.write(data);
        }
        data = inputStream.read();
    }
    outputStream.flush();
}

}
