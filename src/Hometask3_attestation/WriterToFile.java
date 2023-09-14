package Hometask3_attestation;

import java.io.IOException;
import java.io.FileWriter;

public class WriterToFile {
    public void writeData(String s, String filePath) {
        System.out.println(filePath);
        System.out.println(filePath.getClass().getSimpleName());
        try(FileWriter writer = new FileWriter(filePath, true)) {
            writer.append(s);
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

