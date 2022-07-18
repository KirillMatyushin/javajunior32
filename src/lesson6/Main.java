package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Мы - турагентство
         * Программа отображает правильный набор туров в зависимости от потребности человека
         */

        String[][] tours = {{"1", "Италия", "5 дней", "самолет", "5 звезд", "120000", "полупансионат"},
                {"2", "Франция", "7 дней", "самолет", "4 звезды", "150000", "завтрак"},
                {"3", "Грузия, Армения", "10 дней", "автобус", "4 звезды", "80000", "пансионат"},
                {"4", "Армения", "12 дней", "автобус", "3 звезды", "90000", "завтрак"},
                {"5", "Турция", "13 дней", "самолет", "5 звезд", "130000", "полупансионат"},
                {"6", "Турция, Болгария", "13 дней", "автобус", "5 звезд", "150000", "полупансионат"},
                {"7", "Италия, Франция", "6 дней", "автобус", "5 звезд", "150000", "полупансионат"},
                {"8", "Италия", "7 дней", "самолет", "5 звезд", "140000", "завтрак"},
                {"9", "Мальдивы", "9 дней", "самолет", "4 звезды", "130000", "пансионат"},
                {"10", "Мальта", "12 дней", "самолет", "4 звезды", "130000", "пансионат"},
                {"11", "Мальта", "14 дней", "самолет", "5 звезд", "150000", "полупансионат"}};

        System.out.println("Добрый день, выберите действие: ");

        System.out.println("1 - Узнать среднюю стоимость тура в определенную страну");
        System.out.println("2 - Узнать среднюю стоимость любого тура");
        System.out.println("3 - Вывести туры в определенную страну");
        System.out.println("4 - Вывести туры ценой ОТ и ДО");
        System.out.println("5 - Вывести туры +- 2 дня от введенной длительности в определенную страну");
        System.out.println("6 - Вывести выгодные туры (выгодными считаются туры со стоимостью ДО 10 тыс. в день)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            String country = ScannerUtils.getInputCountry();
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country);
            System.out.println("Средняя стоимость в " + country + " = " + averagePrice);

        } else if (answer.equals("2")) {

        } else if (answer.equals("3")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в " + country + ": ");
            TourUtils.printToursByCountry(tours, country);
        }
    }
}