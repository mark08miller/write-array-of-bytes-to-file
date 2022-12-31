package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (FileOutputStream stream = new FileOutputStream(fileName)) {
            stream.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}