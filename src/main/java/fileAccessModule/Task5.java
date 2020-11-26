package main.java.fileAccessModule;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
        writer.write("Ы");
        writer.close();
    }
}
