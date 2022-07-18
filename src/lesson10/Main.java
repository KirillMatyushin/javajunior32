package lesson10;

public class Main {

    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack(); // Создаем BlackJack
        Dealer dealer = new Dealer(); // Вводим крупье
        dealer.setName("Крупье");

        Player player1 = new Player(); // Вводим первого игрока
        Player player2 = new Player(); // Вводим второго игрока
        player1.setName("Вася"); // Присваиваем игрокам имена
        player2.setName("Петя");

        blackJack.addPlayerToGame(player1); // Игроки и крупье входят в игру5
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers(); // Раздали по 2 карты
        blackJack.dealRestCardsToAllPlayers(); // Раздали все оставшиеся карты
        blackJack.printWinner(); // Определяем и печатаем победителя
    }
}
