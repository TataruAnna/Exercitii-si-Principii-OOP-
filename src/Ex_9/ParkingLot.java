package Ex_9;

public class ParkingLot {
    Car[] spots;



    public ParkingLot(int size) {
        this.spots = new Car[size];

    }

    public void park(Car car) throws Exception{
        for (int i = 0; i < spots.length; i++) {
            if (spots[i]==null){
                //parchez masina la spots[i]
                spots[i]=(car);
                return;
            }
        }
        System.out.println("parking is full");
    }
    public void leave(int number) throws Exception{
        if(number>spots.length - 1){
            throw new Exception("Spot does not exist");
        }
        if(spots[number]==null){
            throw new Exception("Spot already free");
        }
        spots[number]=null;
    }
}
