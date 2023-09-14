package Hometask3_attestation.exeptions;

public class GenderException extends RuntimeException {
       public GenderException() {
       }

    public void genderException(String field) {
        System.out.println("ИСКЛЮЧЕНИЕ: НЕКОРРЕКТНЫЙ ДАННЫЕ ПОЛА");

    }
}


