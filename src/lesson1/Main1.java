package lesson1;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Даны переменные: деньги, стоимость пиццы, жвачки, конфеты
         * Нужно купить максимум пицц, на сдачу максимум жвачек, затем конфет
         */
        int moneyNal = 1000;
        int priceOfPizza = 230;
        int priceOfGum = 26;
        double priceOfCandy = 2.5;

        int maxPizza = moneyNal / priceOfPizza;
        int maxGum = (moneyNal - maxPizza * priceOfPizza) / priceOfGum;
        int maxCandy = (int) (((moneyNal - maxPizza * priceOfPizza) - maxGum * priceOfGum) / priceOfCandy);
        double change = moneyNal - (maxPizza * priceOfPizza) - (maxGum * priceOfGum) - (maxCandy * priceOfCandy);

        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + maxPizza + " пиццы/пиццу");
        System.out.println("- " + maxGum + " жвачки/жвачку");
        System.out.println("- " + maxCandy + " конфет/конфету/конфеты");
        System.out.println("Сдача с магазина: " + change + " рубля/рубль/рублей");
    }
}
