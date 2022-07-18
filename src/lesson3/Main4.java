package lesson3;

import java.util.Scanner;

public class Main4 {
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
            return;
        }

        int countNumbers = 0;
        for (int i = 0; i < charsFromPassword.length; i++) {
            if (charsFromPassword[i] == '0' ||
                    charsFromPassword[i] == '1' ||
                    charsFromPassword[i] == '2' ||
                    charsFromPassword[i] == '3' ||
                    charsFromPassword[i] == '4' ||
                    charsFromPassword[i] == '5' ||
                    charsFromPassword[i] == '6' ||
                    charsFromPassword[i] == '7' ||
                    charsFromPassword[i] == '8' ||
                    charsFromPassword[i] == '9') {
                countNumbers++;
            }
        }

        int countUpperCases = 0;
        for (int UpperCases = 0; UpperCases < charsFromPassword.length; UpperCases++) {
            if (charsFromPassword[UpperCases] == 'A' ||
                    charsFromPassword[UpperCases] == 'B' ||
                    charsFromPassword[UpperCases] == 'C' ||
                    charsFromPassword[UpperCases] == 'D' ||
                    charsFromPassword[UpperCases] == 'E' ||
                    charsFromPassword[UpperCases] == 'F' ||
                    charsFromPassword[UpperCases] == 'G' ||
                    charsFromPassword[UpperCases] == 'H' ||
                    charsFromPassword[UpperCases] == 'I' ||
                    charsFromPassword[UpperCases] == 'J' ||
                    charsFromPassword[UpperCases] == 'K' ||
                    charsFromPassword[UpperCases] == 'L' ||
                    charsFromPassword[UpperCases] == 'M' ||
                    charsFromPassword[UpperCases] == 'N' ||
                    charsFromPassword[UpperCases] == 'O' ||
                    charsFromPassword[UpperCases] == 'P' ||
                    charsFromPassword[UpperCases] == 'Q' ||
                    charsFromPassword[UpperCases] == 'R' ||
                    charsFromPassword[UpperCases] == 'S' ||
                    charsFromPassword[UpperCases] == 'T' ||
                    charsFromPassword[UpperCases] == 'U' ||
                    charsFromPassword[UpperCases] == 'V' ||
                    charsFromPassword[UpperCases] == 'W' ||
                    charsFromPassword[UpperCases] == 'X' ||
                    charsFromPassword[UpperCases] == 'Y' ||
                    charsFromPassword[UpperCases] == 'Z') {
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
