package lesson1;

public class Main2 {
    public static void main(String[] args) {
        /**
         * Даны переменные: деньги, стоимость пиццы, жвачки, конфеты
         * Нужно купить максимум пицц, на сдачу максимум жвачек, затем конфет
         */
        int moneyNal = 1000;
        int priceOfPizza = 230;
        int priceOfGum = 26;
        double priceOfCandy = 2.5;

        int maxPizza = moneyNal / priceOfPizza; //колличество пицц
        int change1 = moneyNal % priceOfPizza; //сдача с пиццы
        int maxGum = change1 / priceOfGum; //количество жвачек
        int change2 = change1 % priceOfGum; //сдача с жвачек
        int maxCandy = (int) (change2 / priceOfCandy); //количество конфет
        double change3 = change2 % priceOfCandy; //сдача с конфет

        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + maxPizza + " пиццы/пиццу");
        System.out.println("- " + maxGum + " жвачки/жвачку");
        System.out.println("- " + maxCandy + " конфет/конфету/конфеты");
        System.out.println("Сдача с магазина: " + change3 + " рубля/рубль/рублей");
    }
}
