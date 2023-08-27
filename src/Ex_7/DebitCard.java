package Ex_7;

public class DebitCard extends Card{
    private int maxTransactionAmount;

    public DebitCard(boolean isActive, int pin, String cardNumber, int cardBalance, int maxTransactionAmount) {
        super(isActive, pin, cardNumber, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public int getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    public void changeTransactionLimit(int maxTransactionAmount) {
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public void pay(int amount) throws Exception {
        if(amount> amount){
            throw new Exception("Nu se poate plati cu mai mult decat limita maxima");
        }
            setCardBalance(getCardBalance() - amount);
    }
}
