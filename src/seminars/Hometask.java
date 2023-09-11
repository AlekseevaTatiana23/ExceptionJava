package seminars;

public class Hometask {

    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[]{1, 3, 5};
        System.out.println(arr[5]);
            }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String numberString ="abc";
        int number = Integer.parseInt(numberString);
        System.out.println(number);
    }

}