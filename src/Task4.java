import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {

    public static void main(String[] args) {
    EnterNotNullString();
    }

    public static void EnterNotNullString(){
        System.out.print("Введите непустую строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if(string.isEmpty()){
            throw new RuntimeException("Строка не должна быть пустой");
        }
    }
}
