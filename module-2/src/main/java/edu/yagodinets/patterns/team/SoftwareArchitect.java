package edu.yagodinets.team;

public class SoftwareArchitect extends Developer {

    private Developer developer;

    public SoftwareArchitect(Developer developer) {
        super(developer.fullName, developer.technology, developer.style);
    }

    public void designArchitecture() {
        System.out.println(fullName +" is building yet another designing masterpiece, which will never be implemented due to budget limitation");
    }

    @Override
    public void writeCode() {
        developer.writeCode();
    }
}
