package lesson2;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Есть число. Нужно напечатать на консоль ЧЕТНОЕ или НЕЧЕТНОЕ
         */

        int number = 12;

        if (number % 2 == 0) {
            System.out.println("ЧЕТНОЕ");
        } else {
            System.out.println("НЕЧЕТНОЕ");
        }
    }
}
