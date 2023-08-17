package Interfaces;

public class Ma {
    public static void main(String[] args) {
        Developer[] developers = new Developer[3];
        developers[0] = new Employee("Andrei",9000);
        developers[1] = new Freelancer("Radu", 300);
        developers[2] = new Employee("Andra", 13000);

        DevDepartment devDepartment = new DevDepartment(developers);
        devDepartment.solveProductionBugs();

    }


}
