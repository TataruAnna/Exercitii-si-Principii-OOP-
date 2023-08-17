package Ex_8;

public class Company {
    private String name;
    private int yearFounded;
    private Department[] departments;
    private int numberOfDepartmentsAdded;

    public Company(String name, int yearFounded, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.numberOfDepartmentsAdded = 0;
        this.departments = new Department[numberOfDepartments];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartmentsAdded() {
        return numberOfDepartmentsAdded;
    }

    public void setNumberOfDepartmentsAdded(int numberOfDepartmentsAdded) {
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }
    public boolean addDepartment(Department department){
        departments[numberOfDepartmentsAdded] = department;
        numberOfDepartmentsAdded++;
        return true;
    }

  //8.10. scrie o metoda care printeaza toate departamentele din companie
    public void printAllDept(){
        for(int i =0;i<numberOfDepartmentsAdded; i++){
            System.out.println(departments[i].toString());
        }
    }

    //8.11. scrie o metoda care printeaza toti angajatii dintr-un anumit departament din companie
    public void printAllEmpByDep(String departmentName){
        for(int i =0;i<numberOfDepartmentsAdded;i++) {
            if (departmentName.equals(departments[i].getName())) {
                departments[i].printAllEmployeesName();
            }
        }
    }
    //8.12. scrie o metoda care printeaza cati angajati are un anumit departament din companie
    public void printEmpNumber(String departmentName){
        for(int i =0;i<numberOfDepartmentsAdded;i++) {
            if (departmentName.equals(departments[i].getName())) {
                System.out.println(departments[i].getNumberOfEmployeesAdded());
            }
        }
    }
    //8.13. scrie o metoda care printeaza toate strazile adreselor angajatilor dintr-un anumit departament din companie
    public void printAllEmpStrByDep(String departmentName){
        //cautam departamentul in lista de dept a companiei pe care se apeleaza metoda
        //pe dept gasit apelam metoda de printAllEmployeesStreet sau scriem acelasi cod din metoda asta
        for(int i =0;i<numberOfDepartmentsAdded;i++){
            if(departmentName.equals(departments[i].getName())){
                departments[i].printAllEmployeesAdressStreets();
            }
        }
    }




}
