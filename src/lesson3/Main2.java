package lesson3;

public class Main2 {
    public static void main(String[] args) {
        /**
         * Есть массив с числами,
         * нужно вывести на консоль сумму только четных чисел этого массива
         */

        int[] numbers = {2, 4, 5, 6, 7, 8, 3, 3, 2, 2, 6};

        int summaEvensNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                summaEvensNum = summaEvensNum + numbers[i];
            }
        }
        System.out.println(summaEvensNum);
    }
}
