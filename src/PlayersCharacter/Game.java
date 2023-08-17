package PlayersCharacter;

public class Game {
    public static void main(String[] args) {
//        PlayerCharacter playerCharacter = new PlayerCharacter("John", 35);
//        playerCharacter.speak();
//        System.out.println(playerCharacter.getName());
//        playerCharacter.setAge(36);
//        System.out.println(playerCharacter.getAge());

        Archer archer = new Archer("Legolas", 34,20);
        System.out.println(archer.getName());

        System.out.println(archer instanceof PlayerCharacter); // ne returneaza o valoare boolean care ne arata daca obiectul archer este instanta a clasei PlayerCaharacter
        PlayerCharacter playerCharacter1 = new Wizard("Gandalf", 60,100);
        playerCharacter1.attack(); //se suprascrie cu metoda din PlayerCharacter - > polimorfism
        PlayerCharacter playerCharacter2 = new Archer("Legolas2",30,50);
        playerCharacter2.attack();
        doAllPlayerAction(playerCharacter1);
        doAllPlayerAction(playerCharacter2);

    }
    public static void doAllPlayerAction(PlayerCharacter playerCharacter){
        playerCharacter.speak();
        playerCharacter.run();
        playerCharacter.attack();
    }

}