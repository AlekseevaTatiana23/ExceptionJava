package Hometask3_attestation;

import Hometask3_attestation.exeptions.DataException;
import Hometask3_attestation.exeptions.DateBirthException;
import Hometask3_attestation.exeptions.GenderException;

import java.util.HashMap;

public class ParseData {
    public HashMap<String, Object> parsEnterData() throws GenderException {
        Note note = new Note();
        String[] data = note.inputData();
        HashMap<String, Object> dataHuman = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String s : data) {
            if (s.length() == 1) {
                if (s.equals("f") || s.equals("m")) {
                    dataHuman.put("gender", s);
                } else{
                    throw new GenderException();
                }
            } else if (s.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = s.split("\\.");
                boolean flag = true;
                if (Integer.parseInt(arrayDate[0]) < 0 ||
                        Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                        Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 ||
                        Integer.parseInt(arrayDate[2]) > 2023) {
                    try {
                        throw new DateBirthException();
                    } catch (DateBirthException e) {
                        e.dataBirthException(s);
                    }
                } else flag=false;
                if (!flag) {
                    dataHuman.put("date", s);
                    } else try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(s);
                    }
            } else if (s.matches("[0-9]+")) {
                dataHuman.put("phone", s);
            } else if (s.matches("[A-Za-z]+")) {
                sb.append(s + " ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(s);
                }
            }
        }
        String[] Name = String.valueOf(sb).split("\\s");
        if (Name.length == 3) {
            dataHuman.put("Surname", Name[0]);
            dataHuman.put("Name", Name[1]);
            dataHuman.put("Patronymic", Name[2]);
        }
        return dataHuman;
    }

}
