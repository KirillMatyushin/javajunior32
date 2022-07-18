package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        /**
         * Нам пользователь задал пароль
         * Нам нужно напечатать на консоль, пароль нам подходит или нет
         * Пароль подходит если:
         * - он содержит более 8 символов
         * - он содержит цифру в себе
         * - он содержит большую букву
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();
        System.out.println(inputPassword);

        char[] charsFromPassword = inputPassword.toCharArray();

        if (charsFromPassword.length < 8) {
            System.out.println("Длина пароля меньше 8 символов!!!");
        }

        int countNumbers = 0;
        for (int i = 0; i < charsFromPassword.length; i++) {
            if (Character.isDigit(charsFromPassword[i])) {
                countNumbers++;
            }
        }

        int countUpperCases = 0;
        for (int UpperCases = 0; UpperCases < charsFromPassword.length; UpperCases++) {
            if (Character.isUpperCase(charsFromPassword[UpperCases])) {
                countUpperCases++;
            }
        }

        if (countNumbers == 0) {
            System.out.println("В пароле нет чисел!!!");
        }

        if (countUpperCases == 0) {
            System.out.println("В пароле нет заглавных букв!!!");
        }
    }
}
