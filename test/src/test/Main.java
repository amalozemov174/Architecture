package test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String inputPath = "resources\\input.txt";
        final String outputPath = "resources\\output.txt";
        ArrayList<String> strings = ReaderFile.readFile(inputPath);
        WriterFile.writeFile(outputPath, Utils.sort(strings));
    }

}
