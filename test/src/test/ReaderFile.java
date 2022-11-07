package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReaderFile {
    public static ArrayList<String> readFile(String inputPath) {
        ArrayList<String> strings = new ArrayList<>();
        String tmp = "";
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            count = Integer.parseInt(br.readLine());
            while (br.ready()){
                String tmpRead = br.readLine();
                if(tmpRead.matches("[0-9]")) {
                    if(count == 0) {
                        strings.add(tmp);
                        tmp = "";
                    }
                    count = Integer.parseInt(tmpRead);
                }
                else {
                    tmp += tmpRead + ";";
                    count--;
                }
            }
            strings.add(tmp);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return strings;
    }

}
