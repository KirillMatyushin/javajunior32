package lesson10;

public class Dealer extends Player {
    // extends - обозначаем, что крупье тоже игрок

    @Override
    public boolean needsCard() {
        if (valuesHand() < 17) {
            return true;
        }
        return false;
    }
}
