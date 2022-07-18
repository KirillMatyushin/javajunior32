package lesson4;

public class Main4 {
    public static void main(String[] args) {
        int[][] numbers = new int[8][8];
        int max = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max == i + j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
