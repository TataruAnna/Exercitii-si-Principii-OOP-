package Interfaces;

public class DevDepartment {
    private Developer[] developers;

    public DevDepartment(Developer[] developers) {
        this.developers = developers;
    }

    public Developer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }
    public void solveProductionBugs(){
        for(int i = 0; i < this.developers.length; i++){
            this.developers[i].solveBugs();
        }
    }
}
