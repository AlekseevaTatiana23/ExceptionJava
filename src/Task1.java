import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных
 */

public class Task1 {


    public static void main(String[] args) {
        System.out.println(EnterNumberFloat());
    }

    public static float EnterNumberFloat() {
        System.out.print("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " введено не число");
        }
        return EnterNumberFloat();
    }
}


