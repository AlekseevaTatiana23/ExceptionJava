package Hometask3_attestation;

import Hometask3_attestation.exeptions.DataException;

import java.util.HashMap;

public class StartProgram {
    public static void main(String[] args) throws DataException {
        ParseData parseData = new ParseData();
        String newFileName = null;
        WriterToFile writer = new WriterToFile();

        HashMap<String, Object> data = parseData.parsEnterData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parseData.parsEnterData();
            }
        }

        newFileName = data.get("Surname") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writer.writeData(String.valueOf(sb), filePath);

    }
}
