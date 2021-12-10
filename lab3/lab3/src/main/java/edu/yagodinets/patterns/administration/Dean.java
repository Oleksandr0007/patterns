package edu.yagodinets.patterns.administration;

import edu.yagodinets.patterns.Group;
import edu.yagodinets.patterns.PersonalInfo;
import edu.yagodinets.patterns.Professor;
import edu.yagodinets.patterns.course.Calculus;
import edu.yagodinets.patterns.course.Course;

import java.time.LocalDate;

public class Dean extends Administration{
    private static final int DEFAULT_FEE = 15000;

    public Dean(PersonalInfo personalInfo) {
        super(personalInfo);
    }

    @Override
    public void fillCourse(Professor professor, Group group) {
        Course calculus = new Calculus(LocalDate.now(),professor,DEFAULT_FEE);
        calculus.getGroups().add(group);
        courses.add(calculus);
    }

}
