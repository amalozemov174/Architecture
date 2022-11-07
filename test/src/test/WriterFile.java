package test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterFile {

    public static void writeFile(String outputPath, String sort) {
        try (FileWriter fw = new FileWriter(outputPath);){
            fw.write(sort);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
