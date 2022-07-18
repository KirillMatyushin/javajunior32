package lesson10;

public class Card {

    private String name; // Валет трефа (имя карты и ее масть)
    private int value; // 10 (вес карты, все картинки по 10)

    public Card() {
    }

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
