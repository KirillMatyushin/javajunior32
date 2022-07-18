package lesson2;

public class Main12 {
    public static void main(String[] args) {
        /**
         * С помощью цикла for посчитать, сколько нужно лет,
         * чтобы собрать сумму в 200000 рублей,
         * если откладывать ежемесячно по 9500 рублей?
         */
        int moneyFinish = 200000;
        int moneyMonth = 9500;
        double month;
        for (month = 0; month <= moneyFinish / moneyMonth; month++) {
        }
        System.out.println("Чтобы собрать сумму 200000 рублей, откладывая ежемесечно по 9500 рублей, понадобится " + month / 12 + " лет");
    }
}
