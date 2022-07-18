package lesson5;

public class MathOperations {
    /**
     * Создать метод, в который мы передаем 3 стороны треугольника,
     * а метод будет печатать на консоль, какой это вид треугольника
     */

    /**
     * 1 - модификатор доступа (регулировка области видимости данного метода)
     * public - доступ внутри всего проекта
     * private - доступ внутри текущего файла
     * _______ - доступ внутри текущего пакета (папки) и наследникам данного файла
     * protected - доступ внутри текущего файла и его наследникам
     * <p>
     * 2 - static (или есть или нет)
     * 3 - возвращаемый тип (void или тип)
     * 4 - название метода
     * 5 - входящие параметры
     * 6 - тело выполнения метода
     */

    public static void printTypeOfTriangle(int a, int b, int c) {
        //3 5 6    6 5 6   3 3 12
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Такого треугольника не существует!!!");
            return;
        }
        if (a == b && b == c && c == a) {
            System.out.println("равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("разносторонний треугольник");
        } else {
            System.out.println("равнобедренный треугольник");
        }
    }

    /**
     * В метод мы передаем 3 стороны треугольника,
     * и метод ВОЗВРАЩАЕТ значение площади треугольника
     */

    public static double ploshadTriangle(int a, int b, int c) {
        double p = 0.5 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static double ploshadTriangle(int osnovanie, int visota) {
        double s = 0.5 * osnovanie * visota;
        return s;
    }
}
