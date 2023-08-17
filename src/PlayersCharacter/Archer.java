package PlayersCharacter;
public class Archer extends PlayerCharacter{
    private int numberOfArrows;

    public Archer(String name, int age, int numberOfArrows) {
        super(name, age);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public void attack(){
         this.numberOfArrows--;
        System.out.println("Attcking with arrow. Number of arrows left: "+ this.numberOfArrows);
    }
}
