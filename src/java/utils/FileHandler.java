package utils;

import java.io.IOException;

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
}
