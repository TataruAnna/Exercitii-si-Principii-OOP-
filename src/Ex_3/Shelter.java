package Ex_3;

public class Shelter {
    Animal[] animals = new Animal[10];
    private int numberOfAnimals;

    public Shelter(int size) {
        this.animals = new Animal[size];
        numberOfAnimals = 0;
    }

    public void makeNoise(){
        for(int i =0;i<numberOfAnimals;i++){
            animals[i].greeting();
        }
    }

    public void addAnimal(Animal animal){
        animals[numberOfAnimals] = animal;
        numberOfAnimals++;
    }
}
