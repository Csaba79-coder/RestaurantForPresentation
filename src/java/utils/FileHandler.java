package utils;

import storage.Drink;

import java.io.IOException;
import java.util.List;

public class FileHandler {

    private static final String sourceDir = "src/resources/";


    public void readFile(String txt) {
        String fileName = sourceDir + txt;
        try {
            Reader.Buffer(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void read(String txt2) throws IOException {
//        String fileName = sourceDir + txt2;
//        Reader.Buffer(txt2);
//    }
}
