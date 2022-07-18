package lesson7;

public class Main {
    public static void main(String[] args) {
        Tovar table1 = new Tovar();
        Tovar table2 = new Tovar();

        // table1.id = 1213243; // Поскольку данные скрыты - мы должны написать метод,
        // который будет менять значение id

        table1.setId(1213243);
        // table1.fullPrice = 12000;
        table1.setFullPrice(12000);

        System.out.println();
    }
}
