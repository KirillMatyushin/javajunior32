package lesson9.zoo;

public class Tiger extends Animal {

    public void run() {
        System.out.println("Тигр бегает");
    }

    public void jump() {
        System.out.println("Тигр прыгает");
    }

    // Переопределение метода - когда в родительском классе есть метод,
    // который не нравится как работает, то мы можем в дочернем классе сделать
    // такойже метод!!! только с другим телом
    public void voice() { // сигнатура метода
        System.out.println("Ррр ррр");
    }
}
