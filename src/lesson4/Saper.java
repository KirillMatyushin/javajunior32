package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {

        int rows;
        int cols;
        int mines;

        System.out.println("Выберите уровень игры: ");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();
        int[][] fields = null;

        if (level.equals("1") || level.equalsIgnoreCase("новичек")) {
            fields = new int[9][9];

            for (int mine = 0; mine < 10; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(9);
                int randomColIndex = ThreadLocalRandom.current().nextInt(9);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }

        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fields = new int[16][16];

            for (int mine = 0; mine < 40; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(16);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }

        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fields = new int[16][30];

            for (int mine = 0; mine < 99; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(30);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }

        if (level.equals("4") || level.equalsIgnoreCase("особый")) {
            System.out.println("Введите ширину поля:");
            cols = scanner.nextInt();
            System.out.println("Введите высоту поля:");
            rows = scanner.nextInt();
            System.out.println("Введите количество мин:");
            mines = scanner.nextInt();
            fields = new int[rows][cols];

            for (int mine = 0; mine < mines; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(rows);
                int randomColIndex = ThreadLocalRandom.current().nextInt(cols);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }

        // Печатаем поле с минами
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                if (fields[i][j] == -1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
