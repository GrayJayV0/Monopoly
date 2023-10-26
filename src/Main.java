import java.util.Scanner;

public class Main {
    public static int dice() {
        int die1 =(int)( 1 + ((Math.random() * (6 - 1 + 1))));
        int die2 = (int)( 1 + ((Math.random() * (6 - 1 + 1))));
        return die1 + die2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ichoice;
        String schoice;
        while (true)
        {
            System.out.print("Welcome to Monopoly\nHow many people will be playing\n");
            ichoice = input.nextInt();
            if (ichoice > 1 && ichoice <= 4)
            {
                for (int i = 0; i <= ichoice; i++)
                {
                    System.out.print("Player " + (i+1) + " name\n");
                    Player.players[i].name = input.nextLine();;
                    System.out.println(Player.players[i].name);
                }
                break;
            }
            else
            {
                System.out.print("Max of 4 players only\n");
            }
        }
        System.out.print("Alright now everyone has 1500$ to their name\nLets begin");

    }
}