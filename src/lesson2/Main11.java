package lesson2;

public class Main11 {
    public static void main(String[] args) {
        /**
         * С помощью цикла for напечатать на консоль количество четных чисел в диапазоне от 30 до 61
         */
        int number = 0; // Минимально возможное количество четных чисел
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                number++;
            }
        }
        System.out.println("Количество четных чисел в данном диапазоне: " + number);
    }
}

