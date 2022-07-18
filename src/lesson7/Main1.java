package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        // Вызов метода:
        // В метод передается 2 типа параметров:
        // Явные (передаются в метод в виде входящих параметров)
        // и неявные (тот объект, у которого вызван данный метод) ---> внутри метода доступин this

        triangle.setA(7);
        triangle.setB(5);
        triangle.setC(10);

        Triangle triangle2 = new Triangle(5, 5, 6);
        triangle2.setA(5);
        triangle2.setB(5);
        triangle2.setC(6);
        System.out.println(triangle.perimetr());
        System.out.println(triangle2.perimetr());
    }
}
