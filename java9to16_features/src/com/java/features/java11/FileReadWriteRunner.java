package com.java.features.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

    public static void main(String[] args) throws IOException {
        // get file path
        Path path = Paths.get("./resources/sample.txt");
        // read file
        String content = Files.readString(path);
        // print file contents
        System.out.println(content);
        // change the file content
        String changedContent = content.replace("line", "lines");
        // create new path
        Path newPath = Paths.get("./resources/sample_new.txt");
        // write to file
        Files.writeString(newPath, changedContent);
        // read file
        String newContent = Files.readString(newPath);
        // print file contents
        System.out.println(newContent);

    }
}
