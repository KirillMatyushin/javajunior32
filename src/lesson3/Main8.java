package lesson3;

public class Main8 {
    public static void main(String[] args) {
        /**
         * Нужно задать массив цифр и вывести на консоль
         * все числа в обратном порядке,
         * при этом дважды вывести те числа, которые кратны 3
         */
        int[] numbers = {5, 10, 15, 20, 25, 30};

        int numb = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
            System.out.println(numbers[i]);
        }
    }
}
