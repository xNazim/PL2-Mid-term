import java.util.Arrays;
import java.util.Scanner;
class TicTacToe {
    static void show(char[] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
            if ((i + 1) % (field.length / 3) == 0) {
                System.out.println();
            }
        }
    }

    public static void main() {
        System.out.println("Tic Tac Toe");
        final int ROW_SIZE = 3;
        char[] field = new char[ROW_SIZE * ROW_SIZE];
        Arrays.fill(field, '-');
        show(field);
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;
        do {
            while (!(userInput >= 1 && userInput <= field.length && field[userInput - 1] == 'x' || userInput == 0)) {
                System.out.print("\n1 player (X). \nYour turn, enter a number from 1 to 9 (0 - exit): ");
                while (true) {
                    if (scanner.hasNextInt()) {
                        userInput = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.print("(X) Enter a number from 1 to 9 (0 - exit): ");
                    }
                }
                if (userInput >= 1 && userInput <= field.length && field[userInput - 1] == '-') {
                    field[userInput - 1] = 'x';
                    show(field);
                }

                if ((field[0] == field[1] && field[1] == field[2] && field[0] == field[2] && field[0] == 'x')
                        || (field[3] == field[4] && field[4] == field[5] && field[3] == field[5] && field[3] == 'x')
                        || (field[6] == field[7] && field[7] == field[8] && field[6] == field[8] && field[6] == 'x')
                        || (field[0] == field[3] && field[3] == field[6] && field[3] == field[6] && field[0] == 'x')
                        || (field[1] == field[4] && field[4] == field[7] && field[1] == field[7] && field[1] == 'x')
                        || (field[2] == field[5] && field[5] == field[8] && field[2] == field[8] && field[2] == 'x')
                        || (field[0] == field[4] && field[4] == field[8] && field[0] == field[8] && field[0] == 'x')
                        || (field[2] == field[4] && field[4] == field[6] && field[2] == field[6] && field[2] == 'x')) {
                    System.out.println("CONGRATULATIONS!!! 1 Player has won:) (X)");
                    userInput = 0;
                } else if (field[0] != '-' && field[1] != '-' && field[2] != '-' &&
                        field[3] != '-' && field[4] != '-' && field[5] != '-' &&
                        field[6] != '-' && field[7] != '-' && field[8] != '-') {
                    System.out.println("\nDraw");
                    userInput = 0;
                }
            }

            while (!(userInput >= 1 && userInput <= field.length && field[userInput - 1] == 'o' || userInput == 0)) {
                System.out.print("\n2 player (O). \nYour turn, enter a number from 1 to 9 (0 - exit): ");
                while (true) {
                    if (scanner.hasNextInt()) {
                        userInput = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        String temp = scanner.nextLine();
                        System.out.println("(O). Enter a number from 1 to 9 (0 - quit): ");
                    }
                }

                if (userInput >= 1 && userInput <= field.length && field[userInput - 1] == '-') {
                    field[userInput - 1] = 'o';
                    show(field);
                }

                if ((field[0] == field[1] && field[1] == field[2] && field[0] == field[2] && field[0] == 'o')
                        || (field[3] == field[4] && field[4] == field[5] && field[3] == field[5] && field[3] == 'o')
                        || (field[6] == field[7] && field[7] == field[8] && field[6] == field[8] && field[6] == 'o')
                        || (field[0] == field[3] && field[3] == field[6] && field[3] == field[6] && field[0] == 'o')
                        || (field[1] == field[4] && field[4] == field[7] && field[1] == field[7] && field[1] == 'o')
                        || (field[2] == field[5] && field[5] == field[8] && field[2] == field[8] && field[2] == 'o')
                        || (field[0] == field[4] && field[4] == field[8] && field[0] == field[8] && field[0] == 'o')
                        || (field[2] == field[4] && field[4] == field[6] && field[2] == field[6] && field[2] == 'o')) {
                    System.out.println("CONGRATULATIONS!!! 2 Player has won (O)");
                    userInput = 0;
                } else if (field[0] != '-' && field[1] != '-' && field[2] != '-' &&
                        field[3] != '-' && field[4] != '-' && field[5] != '-' &&
                        field[6] != '-' && field[7] != '-' && field[8] != '-') {
                    System.out.println("\nDRAW");
                    userInput = 0;
                }
            }

            if (userInput == 0) {
                System.out.println("\nIf you wish, you can play again, just click RUN:) ");
                scanner.close();
                break;
            }
        } while (true);
    }


}
