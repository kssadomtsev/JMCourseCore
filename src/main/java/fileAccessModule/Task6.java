package main.java.fileAccessModule;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task6 {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{123, -122, 50, 51});
        System.out.println(readAsString(byteArrayInputStream, StandardCharsets.UTF_8));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream, charset);
        int charsRead;
        while((charsRead = in.read(buffer, 0, buffer.length)) > 0) {
            out.append(buffer, 0, charsRead);
        }
        return out.toString();
    }
}
