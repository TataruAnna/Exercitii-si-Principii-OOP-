package Ex_11;

public class DeluxeBurger extends BaseBurger {

    public DeluxeBurger(String breadType, String meat) {
        super(breadType, meat);
        setAdditions(new Addition[2]);

    }

    @Override
    public boolean handleAddition(Addition addition) throws Exception{
        if (getNumberOfAdditionsAdded() == 2 || (!addition.getName().equals("cartofi") && !addition.getName().equals("racoritoare"))){
            throw new Exception("ai max 2 aditii si pot fi doar cartofi sau racoritoare");
        }
        addAddition(addition);
        return true;
    }
}