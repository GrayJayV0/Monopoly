public class Player {
    public String name;
    public int bankAccount, tile;
    public Cards[] deck;
    public Player(String name){
        this.name = name;
        this.bankAccount = 1500;
        this.deck = new Cards[]{};
        this.tile = 0;
    }
    static Player blank = new Player("blank");
    static Player chance = new Player("chance");
    static Player community = new Player("community");
    static Player[] players =
            {
                    new Player(""),
                    new Player(""),
                    new Player(""),
                    new Player(""),
            };

    public void tileCalc(int roll)
    {
        if ( this.tile > Property.board.length )
        {
            this.tile = 0;
        }
        else
        {
            this.tile += roll;
        }
    }



}
