package lesson3;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        /**
         * Нужно задать массив цифр и вывести на консоль
         * только те числа, которые содержат в себе символ 4
         */

        int[] numbers = {1, 4, 7, 11, 44, 0, 45, 54, 243};
        for (int i = 0; i < numbers.length; i++) {
            // 3   "3"
            String currentNumFromMassive = Integer.toString(numbers[i]);

            // "3"
            // fghj4   234   e4e4e4   dfghjh
            int startIndex4 = currentNumFromMassive.indexOf('4');
            if (startIndex4 != -1) {
                System.out.println(currentNumFromMassive);
            }
        }
    }
}
