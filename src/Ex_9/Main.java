package Ex_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = new ParkingLot(20);
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        Car car1 = new Car("CJ99BOS","verde" );
        Car car2 = new Car("CJ99BSS","negru" );
        Car car3 = new Car("CJ99BSS","verde" );
        try{
            parkingLot.park(car1);
            parkingLot.park(car2);
            parkingLot.park(car3);
            parkingLot.status();

            String[] result = parkingLot.getRegNumbersByColor("verde");
            for(int i=0;i< result.length;i++){
                System.out.println(result[i]);
            }
            System.out.println(parkingLot.getSpotByRegNumber("CJ99BOS"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
    public static void printMenu(){
        System.out.println("----------Meniu--------");
        System.out.println("0. Creaza o parcare cu un anumit numar de locuri ");
        System.out.println("1. Adauga o masina in parcare");
        System.out.println("2. Scoate o masina din parcare");
        System.out.println("3. Afiseaza masinile din parcare");
        System.out.println("4. Iesi din meniu");
        System.out.println("--------------------------");
        System.out.println("Alege o optiune: ");
    }

//    public static void performSelectedOption(int option, Scanner scanner, ParkingLot parkingLot){
//        switch (option){
//            case 1:
//                System.out.println("Introdu numarul de inmatriculare: ");
//                String plateNumber = scanner.next();
//                System.out.println("Introdu culoare masinii: ");
//                String carColor = scanner.next();
//                Car car = new Car (plateNumber, carColor);
//
//                case 2:
//
//        }
//    }

}
