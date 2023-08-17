package Ex_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Pisi", "maidaneza");
//        cat.greeting();
//        Dog dog = new Dog("Azor");
//        dog.greeting();
//        SecurityDog securityDog = new SecurityDog("Politia");
//        securityDog.greeting();
//
//        dog.greeting(securityDog);
//        securityDog.greeting(dog);
//        Animal cat = new Cat("pisi", "maidaneza");
//        cat.greeting();
//        Animal dog = new Dog("Azor");
//        dog.greeting();
//        Animal securityDog = new SecurityDog("Politia");
//        securityDog.greeting();
//
//        Dog copyDog = (Dog) dog;
//        SecurityDog copySecurityDog = (SecurityDog) securityDog;
//        copySecurityDog.greeting(copyDog);

//        Animal chosenAnimal = getAnimal();
//        chosenAnimal.greeting();
        Shelter shelter = new Shelter(4);
        shelter.addAnimal(getAnimal());
        shelter.addAnimal(getAnimal());
        shelter.addAnimal(getAnimal());
        shelter.makeNoise();


    }
    public static Animal getAnimal(){
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch(option){
            case 1:
                return new Cat("Pisi", "maidaneza");
            case 2:
                return new Dog("azor");
            case 3:
                return new SecurityDog("politia");
            default:
                return null;

        }
    }

}
