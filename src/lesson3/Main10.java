package lesson3;

public class Main10 {
    public static void main(String[] args) {
        /**
         * Нужно задать массив цифр и вывести на консоль
         * только те числа, которые содержат в себе символ 4
         */

        int[] numbers = {1, 4, 7, 11, 44, 0, 45, 54, 243};
        for (int i = 0; i < numbers.length; i++) {
            // 3   "3"
            String currentNumFromMassive = Integer.toString(numbers[i]);
            System.out.println(currentNumFromMassive.contains("4"));
        }
    }
}
