package Ex_11;

public class HealthyBurger extends BaseBurger {
    public HealthyBurger(String meat) {
        super("secara", meat);
        setAdditions(new Addition[6]);
    }

    @Override
    public boolean handleAddition(Addition addition) throws  Exception{
        if (getNumberOfAdditionsAdded() == 6){
            throw new Exception("max 6 additions for healthy");
        }

        //vrem sa punem in additiile burgerului curent la pozitia numberOdADdditons pe addition primit ca parametru

        addAddition(addition);
        return true;

    }

}