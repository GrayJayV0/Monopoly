public class Cards {
    private String name, description;
    private Boolean effect;
    public Cards[] allcards = new Cards[]{};

    public Cards(String name, String description, Boolean effect){
        this.name = name;
        this.description = description;
        this.effect = effect;
        this.allcards[this.allcards.length] = this;
    }
    Cards getoutofjail = new Cards("get out of jail", "sd", true);

}
