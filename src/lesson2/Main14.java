package lesson2;

public class Main14 {
    public static void main(String[] args) {
        /**
         * С помощью цикла for посчитать, сколько нужно лет,
         * чтобы собрать сумму в 200000 рублей,
         * если откладывать ежемесячно по 9500 рублей?
         */
        int moneyFinish = 200000;
        int moneyMonth = 9500;
        int payments = 0;
        for (int i = 0; i < moneyFinish; i = i + moneyMonth) {
            payments++;
        }
        int years = payments / 12;
        int month = payments % 12;
        System.out.println("Чтобы собрать сумму 200000 рублей, откладывая ежемесечно по 9500 рублей, понадобится " + years + " год и " + month + " месяцев");
    }
}
