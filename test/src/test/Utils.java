package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class Utils {
    public static String sort(ArrayList<String> strings) {
        String[] line1 =  strings.get(0).split(";");
        String[] line2 = strings.get(1).split(";");
        boolean isContains = true;
        String s = "";
        String saveItem = "";
        String res = "";
            if(line1.length == 1 && line2.length == 1) {
                res = line1[0] + ":" + line2[0];
            }
            else {
                if(line1.length > line2.length) {
                    for (String item1 : line1) {
                        if (isContains) {

                        }
                        else {
                            res += saveItem + ":?" + "\n";
                        }
                        isContains = false;
                        for (String item2 : line2){
                            HashSet<String> tmp = new HashSet<>();
                            for(String splitLine : item2.split(" ")) {
                                tmp.add(splitLine);
                                int a = splitLine.length();
                                if (splitLine.length() <= 2){
                                    break;
                                }
                                else if (splitLine.length() <= 4) {
                                    s = splitLine;
                                }
                                else {
                                    s = splitLine.substring(0 ,splitLine.length() - 2);
                                }
                                if(item1.toLowerCase(Locale.ROOT).contains(s.toLowerCase(Locale.ROOT))) {
                                    res += item1 + ":" + item2 + "\n";
                                    isContains = true;
                                    break;
                                }

                                if(!isContains) {
                                    saveItem = item1;
                                }
                            }
                        }
                    }
                    if (isContains) {

                    }
                    else {
                        res += saveItem + ":?" + "\n";
                    }
                }
                else {
                    for (String item1 : line2) {
                        if (isContains) {

                        }
                        else {
                            res += saveItem + ":?" + "\n";
                        }
                        isContains = false;
                        for (String item2 : line1){
                            HashSet<String> tmp = new HashSet<>();
                            for(String splitLine : item2.split(" ")) {
                                tmp.add(splitLine);
                                int a = splitLine.length();
                                if (splitLine.length() <= 2){
                                    break;
                                }
                                else if (splitLine.length() <= 4) {
                                    s = splitLine;
                                }
                                else {
                                    s = splitLine.substring(0 ,splitLine.length() - 2);
                                }
                                if(item1.toLowerCase(Locale.ROOT).contains(s.toLowerCase(Locale.ROOT))) {
                                    res += item2 + ":" + item1 + "\n";
                                    isContains = true;
                                    break;
                                }
                                if(!isContains) {
                                    saveItem = item1;
                                }
                            }
                        }
                    }
                    if (isContains) {

                    }
                    else {
                        res += saveItem + ":?" + "\n";
                    }
                }
            }
        return res;
    }
}
