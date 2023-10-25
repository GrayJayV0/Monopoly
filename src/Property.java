import java.util.Scanner;
public class Property {
    private String name;
    private Player owner;
    private int cost;

    public Property(String name,int cost){
        this.name = name;
        this.owner = owner;
        this.cost =  cost;
    }

    public void landed(Player player){
        Scanner input = new Scanner(System.in);
        String choice;
        if (this.owner == Null)
        {
            System.out.print("Do you want to buy this property?\n[1]Yes [2]No\n");
            choice = input.nextLine();
            if (choice == "1")
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
                return;
            }
            else if (choice == "2")
            {
                return;
            }
            else
            {
                System.out.print("Invalid input");
            }

        }
        else
        {
            System.out.print("Pay up to " + this.owner);

        }
    }

}
