package Hometask2;

public class Task3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage() + " :На 0 делить нельзя");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + " :Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + ": Массив выходит за пределы своего размера!");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
