package Interfaces;

public class Freelancer implements Developer{
    private String name;
    private int hourlyRate;

    public Freelancer(String name, int hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void implementFeatures() {
        System.out.println("Implement features as a freelancer");
    }

    @Override
    public void solveBugs() {
        System.out.println("Solve bugs as a freelancer");

    }

    @Override
    public void writeDocumentation() {
        System.out.println("Write doc as a freelancer");

    }
}
