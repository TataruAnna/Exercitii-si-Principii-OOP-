package Ex_3;

public class SecurityDog extends Dog{

    public SecurityDog(String name) {
        super(name);
    }

    public void greeting(){
        System.out.println(this.getName() + ": woof woof");
    }
    public void greeting(Dog anotherDog){
        System.out.println(this.getName() + " face woof woof catre " + anotherDog.getName());
    }
}
