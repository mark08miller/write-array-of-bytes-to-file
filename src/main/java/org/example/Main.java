package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        byte[] numbers = new byte[] {1};
        WorkWithBytes workWithBytes = new WorkWithBytes();
        workWithBytes.writeBytesToFile(String.valueOf(file),numbers);
    }
}