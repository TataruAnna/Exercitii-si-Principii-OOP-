package Ex_8;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private Adress adress;

    public String getName(){
        return this.firstName + " " + this.lastName;
    } //8.1

    public Employee(String firstName, String lastName, int salary, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getAdressStreet(){ //8.2
       return  this.adress.getStreet();

    }
    public String getCompleteAdress(){ //8.2
        return this.adress.getCity() +
                " "+ this.adress.getStreet() +
                " "+  this.adress.getNumber();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", adress=" + adress +
                '}';
    }
}
