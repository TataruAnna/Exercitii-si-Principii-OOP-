package PlayersCharacter;
public abstract class PlayerCharacter {
    private String name;
    private int age;
    public PlayerCharacter(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("run");
    }
    public void speak(){
        System.out.println("My name is " + this.name + " and I am " +this.age);
    }
    public abstract void attack();


}
