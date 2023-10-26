import java.util.Objects;
import java.util.Scanner;


public class Property {
    private String name, color;
    private int cost;
    public Player owner;

    public Property(String name, int cost, Player owner, String color){
        this.name = name;
        this.owner = owner;
        this.cost =  cost;
        this.color = color;
    }

    public static Property[] board = new Property[]{
            new Property("Mediteranenan Avenue", 60, Player.blank, "brown"),
            new Property("Community Chest", 0, Player.community, ""),
            new Property("Baltic Avenue", 60, Player.blank, "brown"),
            new Property("Reading Railroad", 200, Player.blank, "railroad"),
            new Property("Oriental Avenue", 100, Player.blank, "light blue"),
            new Property("Chance", 0, Player.chance, ""),
            new Property("Vermont Avenue", 100, Player.blank, "light blue"),
            new Property("Connecticut Avenue", 120, Player.blank, "light blue"),
            new Property("Jail", 100, Player.blank, "light blue"),


    };

    public void landed(Player player){
        Scanner input = new Scanner(System.in);
        String choice;
        // blank tile
        if (Objects.equals(this.owner.name, "blank"))
        {
            System.out.print("Do you want to buy this property?\n[1]Yes [2]No\n");
            choice = input.nextLine();
            if (Objects.equals(choice, "1"))
            {
                if (player.bankAccount >= this.cost)
                {
                    this.owner = player;
                    System.out.print("You have bought " + this.name + "\n");
                    input.nextLine();
                }
                else
                {
                    System.out.print("You don't go the money to buy this property\n");
                    input.nextLine();
                }
            }
            else if (Objects.equals(choice, "2"))
            {
                ;
            }
            else
            {
                System.out.print("Invalid input\n");
                landed(player);
            }

        }
        //go tile
        else if (Objects.equals(this.owner.name, "chance"))
        {
            System.out.print("You salaries come in " + player.name + "\nHeres 200$");
            player.bankAccount += 200;
        }
        // owned tile
        else
        {
            System.out.print("Pay up to " + this.owner);
            if (this.cost > player.bankAccount)
            {
                System.out.print("");
                player.bankAccount = 0;
            }
            else
            {
                System.out.print("");
                player.bankAccount -= this.cost;
            }

        }
    }

}
