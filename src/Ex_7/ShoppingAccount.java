package Ex_7;

public class ShoppingAccount {
    private Card[] cardList;
    private Address[] addressList;
    private String name;
    private Card currentPaymentMethod;

    private Address currentAddress;
    private int numberOfCardsAdded;
    private int numberOfAddressesAdded;


    public Card[] getCardList() {
        return cardList;
    }

    public void setCardList(Card[] cardList) {
        this.cardList = cardList;
    }

    public Address[] getAddressList() {
        return addressList;
    }

    public void setAddressList(Address[] addressList) {
        this.addressList = addressList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public void setCurrentPaymentMethod(Card currentPaymentMethod) {
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public int getNumberOfCardsAdded() {
        return numberOfCardsAdded;
    }

    public void setNumberOfCardsAdded(int numberOfCardsAdded) {
        this.numberOfCardsAdded = numberOfCardsAdded;
    }

    public int getNumberOfAddressesAdded() {
        return numberOfAddressesAdded;
    }

    public void setNumberOfAddressesAdded(int numberOfAddressesAdded) {
        this.numberOfAddressesAdded = numberOfAddressesAdded;
    }

    public ShoppingAccount(String name) {
        this.name = name;
        this.cardList = new Card[10];
        this.addressList = new Address[10];
    }

    public boolean addPaymentMethod(Card card){
        cardList[numberOfCardsAdded] = card;
        numberOfCardsAdded++;
        return true;
    }
    public boolean addAddress(Address address){
        addressList[numberOfAddressesAdded] = address;
        numberOfAddressesAdded++;
        return true;
    }

    public boolean removePaymentMethod(String cardNumber){
        int index = findCardIndexByNumber(cardNumber);

        for (int i = index; i < numberOfCardsAdded -1; i++) {
            cardList[i] = cardList[i+1];
        }
        cardList[numberOfCardsAdded-1] = null;
        numberOfCardsAdded--;
        return true;
    }
    public int findCardIndexByNumber(String cardNumber){
        for (int i = 0; i < numberOfCardsAdded; i++) {
            if(cardNumber.equals(cardList[i].getCardNumber())){
                return i;
            }

        }
        return -1;
    }

    public int findAddressIndexByStreet(String streetName){
        for (int i = 0; i < numberOfAddressesAdded; i++) {
            if(streetName.equals(addressList[i].getStreet())){
                return i;
            }

        }
        return -1;
    }
    public boolean removeAddress(String streetName){
        int index = findAddressIndexByStreet(streetName);

        for (int i = index; i < numberOfAddressesAdded -1; i++) {
            addressList[i] = addressList[i+1];
        }
        addressList[numberOfAddressesAdded-1] = null;
        numberOfAddressesAdded--;
        return true;
    }
    public void selectPaymentMethod(String cardNumber){
        int index = findCardIndexByNumber(cardNumber);
        currentPaymentMethod = cardList[index];
    }
    public void selectAddress(String streetName){
        int index = findAddressIndexByStreet(streetName);
        currentAddress = addressList[index];
    }

    public void generateInvoice(int amount){
        System.out.println(amount + " " + currentPaymentMethod.getCardNumber() +" "+ currentAddress.toString());

    }
}
