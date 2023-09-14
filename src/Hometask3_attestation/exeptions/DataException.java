package Hometask3_attestation.exeptions;

public class DataException extends RuntimeException {
    public DataException() {
    }

    public void dataException(String field) {
        System.out.println("ИСКЛЮЧЕНИЕ: НЕВЕРНЫЙ ФОРМАТ ДАННЫХ");

    }
}