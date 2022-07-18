package lesson7;

// Мы создали новый тип
public class Tovar {
    // Переменные (поля класса),
    // которые описывают состояние объекта (характеристики)
    // ЗДЕСЬ МОГУТ БЫТЬ ПЕРЕМЕННЫЕ, КОТОРЫЕ ОТНОСЯТСЯ ТОЛЬКО К ОДНОМУ Tovar
    // И КОТОРЫЕ ОПИСЫВАЮТ СОСТОЯНИЕ ДАННОГО ОБЪЕКТА
    private int id;
    private int fullPrice;
    private int salePrice;
    private String name;

    public void setId(int idToSave) {
        id = idToSave;
    }

    public void setFullPrice(int newFullPrice) {
        fullPrice = newFullPrice;
    }
}
