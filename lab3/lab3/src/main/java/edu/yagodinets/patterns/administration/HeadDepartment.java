package edu.yagodinets.patterns.administration;

import edu.yagodinets.patterns.Group;
import edu.yagodinets.patterns.PersonalInfo;
import edu.yagodinets.patterns.Professor;
import edu.yagodinets.patterns.course.DesignPatterns;
import edu.yagodinets.patterns.course.MachineLearning;

import java.time.LocalDate;

public class HeadDepartment extends Administration {
    private static final int DEFAULT_FEE = 9000;
    private static final int PRICELESS = 80000;

    public HeadDepartment(PersonalInfo personalInfo) {
        super(personalInfo);
    }

    @Override
    public void fillCourse(Professor professor, Group group) {
        DesignPatterns designPatterns = new DesignPatterns(LocalDate.now(), professor, PRICELESS);
        designPatterns.getGroups().add(group);
        MachineLearning machineLearning = new MachineLearning(LocalDate.now(), professor, DEFAULT_FEE);
        machineLearning.getGroups().add(group);
        courses.add(designPatterns);
        courses.add(machineLearning);
    }

}
