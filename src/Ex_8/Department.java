package Ex_8;

import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] employees;


    private int numberOfEmployeesAdded;

    public Department(String name, int numberOfEmployees) {
        this.name = name;
        this.employees = new Employee[numberOfEmployees];
        this.numberOfEmployeesAdded = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }
    public boolean addEmployee(Employee employee){
        employees[numberOfEmployeesAdded] = employee;
        numberOfEmployeesAdded++;
        return true;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployeesAdded() {
        return numberOfEmployeesAdded;
    }

    public void setNumberOfEmployeesAdded(int numberOfEmployeesAdded) {
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }
    public void printAllEmployeesName(){ //8.5
        for(int i = 0; i< numberOfEmployeesAdded; i++){
            System.out.println(employees[i].getName());

        }
    }


    public void printAllEmployeesAdressStreets(){ //8.6
        for(int i = 0; i< numberOfEmployeesAdded; i++){
            System.out.println(employees[i].getAdress().getStreet());

        }
    }

    public String findEmployee(String name){ //8.7 - am ales sa caut dupa numele de familie si sa eturnez numele complet
        for(int i = 0; i< numberOfEmployeesAdded; i++){
            if(name.equals(employees[i].getLastName())){
                return "Angajatul cu numele " + employees[i].getName()+ " a fost gasit in lista ";
            }
        }
        return "Nu s-a gasit angajatul";
    }
    //8.8. scrie o metoda care printeaza adresa unui anumit angajat din departament
    public void getAdress(String name){
        for(int i = 0; i< numberOfEmployeesAdded; i++){
            if(name.equals(employees[i].getLastName())){
                System.out.println("Adresa angajatului " + employees[i].getName()+ " este: " + employees[i].getCompleteAdress());
            }else{
                System.out.println("Nu s-a gasit angajatul");
            }
        }

    }
    public String findStreetAdress(String street){ //8.9
        for(int i = 0; i< numberOfEmployeesAdded; i++){
            if(street.equals(employees[i].getAdressStreet())){
                return "Strada  " + employees[i].getAdressStreet()+ " a fost gasit in lista ";
            }
        }
        return "Nu s-a gasit adresa";
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", numberOfEmployees=" + numberOfEmployeesAdded +
                '}';
    }
}
