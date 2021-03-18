import java.util.*;

public class Menu
{
    public void display_menu()
    {
        System.out.println("***TIC TAC TOE***");
        System.out.println("To proceed PRESS 1\n");
    }

    public void question()
    {
        System.out.println("Would you like to play?");
        System.out.println("To play enter 9.");
        System.out.println("If you wish to quit enter 0.");

        Scanner q = new Scanner(System.in);

        switch (q.nextInt())
        {
            case 0:
                System.out.println ("Thank you and goodbye.");
                break;

            case 9:
                TicTacToe.main();


        }
    }

    public Menu()
    {
        Scanner in = new Scanner(System.in);
        display_menu();

        if (in.nextInt() == 1) {
            System.out.println("##########@AIU############");
            question();
        } else {
            System.err.println("Unrecognized option");
        }
    }

    public static void main (String[]args)
    {
        new Menu();
    }
}