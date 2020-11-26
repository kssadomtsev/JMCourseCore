package main.java.fileAccessModule;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
//
//        byte data[] = new byte[10];
//        System.in.read(data);
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i] & 0xFF);
//        }


        String original = new String("Ы");
        byte[] defaultBytes = original.getBytes(StandardCharsets.UTF_8);
        for (byte b : defaultBytes) {
//            System.out.println(Integer.toBinaryString(b));
//            System.out.println(Integer.toBinaryString(0xFF));
            System.out.println(b);
            System.out.println(b & 0xFF);
        }

    }
}
