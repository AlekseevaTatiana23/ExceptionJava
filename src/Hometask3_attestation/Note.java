package Hometask3_attestation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Note {
    public String[] inputData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите данные, разделенные пробелом (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ): ");
            String note = scanner.nextLine();
            String[] data = note.split("\\s");
            //String surname = data[0];
           // String name = data[1];
           // String patronymic = data[2];
            //String dataBirth = data[3];
           // String phoneNumber = data[4];
           // String sex = data[5];
            if (data.length == 6) {
                return data;
            } else System.out.println("Информация введена неполностью либо избыточные данные! ");
        }
    }
}
