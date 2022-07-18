package lesson1;

public class Main {

    public static void main(String[] args) {
        /**
         * Есть число, нужно понять оно четное или нет
         */
        int number = 13;
        // всегда останется или 0 или 1
        int ostatok = number % 2;
        boolean isChetnoe = ostatok == 0; // true false
        System.out.println(isChetnoe);
    }
}
