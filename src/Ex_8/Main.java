package Ex_8;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress("Timisoara","Steaua", 13);
        Adress adress2 = new Adress("Timisoara","Steaua2", 14);
        Adress adress3 = new Adress("Cluj","Marasti", 14);
        Adress adress4 = new Adress("Bucuresti","Florilor", 14);

        Employee employee1 = new Employee("Ionica","Georgel", 10000, adress);
        Employee employee2 = new Employee("Marian","Marcel", 10000, adress2);
        Employee employee3 = new Employee("Maria","Popa", 15000, adress3);
        Employee employee4 = new Employee("Oana" ,"Costache", 12000, adress4);

//        Employee[] firstDepEmpList={employee1,employee2};
//        Employee[] secondDepEmList = {employee3,employee4};

//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAdressStreet());
        Department department = new Department("dep1",2);
        Department department2 = new Department("dep2",2);
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department2.addEmployee(employee3);
        department2.addEmployee(employee4);
//        department.printAllEmployeesName();
//        department.printAllEmployeesAdressStreets();

//        System.out.println(employee1.getCompleteAdress());
//        System.out.println("Numarul de angajati este: "+ department.getNumberOfEmployees()); //8.4
//        System.out.println(department.findEmployee("Georgel")); //8.7
//        System.out.println(department.findStreetAdress("Steaua")); //8.9
//        department.getAdress("Marcel"); //8.8
        Company company = new Company("Tesla", 2000, 10);


        if(company.addDepartment(department)){
            System.out.println("S-a adaugat un departament cu numele " + department.getName());
        }
        if(company.addDepartment(department2)){
            System.out.println("S-a adaugat un departament cu numele " + department2.getName());
        }
        company.printAllDept(); //8.10
        company.printAllEmpByDep("dep1"); //8.11
        company.printEmpNumber("dep1"); //8.12
        company.printAllEmpStrByDep("dep1"); //8.13


    }
}
