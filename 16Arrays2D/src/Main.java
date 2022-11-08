public class Main {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        System.out.println();


        String[][] cars2 = {{"Camaro", "Auto 2", "Auto3"}, {"Camaro", "Auto 2", "Auto3"}, {"Camaro", "Auto 2", "Auto3"}};

        for (String[] strings : cars2) {
            System.out.println();
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + " ");
            }
        }


        System.out.println("\n");

        Integer[][] board = new Integer[10][5];
        System.out.println(board.length);
        System.out.println(board[9].length);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 5;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

    }
}
