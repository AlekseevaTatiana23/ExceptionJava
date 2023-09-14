package Hometask3_attestation.exeptions;

public class DateBirthException extends RuntimeException {
       public DateBirthException() {
       }

    public void dataBirthException(String i) {
        System.out.println("ИСКЛЮЧЕНИЕ: НЕВЕРНЫЙ ФОРМАТ ДАТЫ РОЖДЕНИЯ");

    }
}
