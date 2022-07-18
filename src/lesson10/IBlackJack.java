package lesson10;

public interface IBlackJack {

    void addPlayerToGame(Player player); // Войти в игру

    void dealTwoCardsToAllPlayers(); // Крупье раздает всем по 2 карты

    void dealRestCardsToAllPlayers(); // Дораздать всем игрокам все оставшиеся карты

    void printWinner(); // Определить и напечатать победителя

}
