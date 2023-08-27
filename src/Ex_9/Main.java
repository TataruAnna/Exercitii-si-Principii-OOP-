package Ex_9;

public class Main {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = new ParkingLot(20);
        Car car1 = new Car("CJ99BOS","verde" );
        Car car2 = new Car("CJ99BSS","negru" );
        try{
            parkingLot.park(car1);
            parkingLot.park(car2);
            parkingLot.leave(0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }



    }

}
