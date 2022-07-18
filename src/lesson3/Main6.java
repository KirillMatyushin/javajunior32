package lesson3;

public class Main6 {
    public static void main(String[] args) {
        /**
         * Нужно задать массив цифр и вывести на консоль,
         * сколько в массиве четных цифр?
         */

        int[] numbers = {1, 2, 3, 0, 9, 8};

        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens++;
            }
        }
        System.out.println("В данном массиве количество четных чисел равно: " + evens);
    }
}
