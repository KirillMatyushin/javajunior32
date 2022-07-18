package lesson3;

public class Main7 {
    public static void main(String[] args) {
        /**
         * Нужно задать массив цифр и вывести на консоль
         * все числа массива, которые больше 10, но меньше 25
         */

        int[] numbers = {5, 10, 15, 20, 25, 30};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10 && numbers[i] < 25) {
                System.out.println(numbers[i]);
            }
        }
    }
}
