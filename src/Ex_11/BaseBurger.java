package Ex_11;

import java.util.Arrays;

public class BaseBurger {

    private String breadType;
    private String meat;
    private final double basePrice;
    private Addition[] additions;


    private int numberOfAdditionsAdded;

    public BaseBurger(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = 20;
        this.additions = new Addition[4];
        this.numberOfAdditionsAdded = 0;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public void setAdditions(Addition[] additions) {
        this.additions = additions;
    }

    public int getNumberOfAdditionsAdded() {
        return numberOfAdditionsAdded;
    }

    public void setNumberOfAdditionsAdded(int numberOfAdditionsAdded) {
        this.numberOfAdditionsAdded = numberOfAdditionsAdded;
    }

    public boolean handleAddition (Addition addition) throws Exception{
        if (numberOfAdditionsAdded == 4){
            throw new Exception("you have max 4 additions");
        }
        addAddition(addition);
        return true;
    }

    public void addAddition(Addition addition) {
        additions[numberOfAdditionsAdded]= addition;
        numberOfAdditionsAdded++;
    }

    public double calculatePrice(){
        //adunam pretul de baza + pretul fiecarei aditii din lista de aditii ale burger-ului curent

        //parcurg toata lista de aditii
        //pentru fiecare aditie, iau pretul si il adaug la suma
        //adaug suma obtinuta la pretul de baza

        double sum = basePrice;
        for (int i = 0; i < numberOfAdditionsAdded; i++) {
            sum += additions[i].getPrice();
        }
        return sum;

    }

    @Override
    public String toString() {
        return "BaseBurger{" +
                "breadType='" + breadType + '\'' +
                ", meat='" + meat + '\'' +
                ", basePrice=" + basePrice +
                ", additions=" + Arrays.toString(additions) +
                ", numberOfAdditionsAdded=" + numberOfAdditionsAdded +
                '}';
    }
}