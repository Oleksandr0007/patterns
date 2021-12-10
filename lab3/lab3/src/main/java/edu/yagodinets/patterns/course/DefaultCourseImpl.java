package edu.yagodinets.patterns.course;

import edu.yagodinets.patterns.Enrollment;
import edu.yagodinets.patterns.Group;
import edu.yagodinets.patterns.Professor;
import edu.yagodinets.patterns.Student;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.*;

/**
 * Class that provide default implementation to edu.yagodinets.patterns.course.Course
 * by Oleksandr Yagodinets
 */
@Slf4j
public class DefaultCourseImpl extends Course {
    private static final int GROUP_CAPACITY = 20;

    public DefaultCourseImpl(String name, LocalDate date, Professor professor, float fee) {
        super(name, date, professor, fee);
    }

    public DefaultCourseImpl(String name, LocalDate date, float fee) {
        super(name, date, fee);
    }

    public void addStudent(Student student, Enrollment enrollment) {
        getFreeGroup().addStudent(student, enrollment);
        log.info("Successfully added new edu.yagodinets.patterns.Student : " + student.getPersonalInfo().getName());
    }

    private Group getFreeGroup() {
        return groups.stream()
                .filter(group -> group.getEnrolledStudents().size() < GROUP_CAPACITY)
                .findFirst()
                .orElseGet(() -> {
                    int id = groups.size();
                    Group newGroup = new Group(id, "group #" + id);
                    groups.add(newGroup);
                    return newGroup;
                });
    }

    @Override
    public void sendCourseMaterials(Group group, String material) {
        if (!groups.contains(group)) {
            groups.add(group);
        }
        group.addCourseMaterial(name,material);
    }

    @Override
    public Collection<String> getCourseMaterials(Group group) {
        if (!groups.contains(group)) {
            log.error("edu.yagodinets.patterns.course.Course does not contain this group");
            return Collections.emptyList();
        }
        return group.getCourseMaterials().get(name);
    }

    @Override
    public void addStudentToGroup(Student student, Enrollment enrollment, Group group) {
        if (!groups.contains(group)) {
            groups.add(group);
        }
        group.addStudent(student, enrollment);
    }

    public void removeStudent(Student student) {
        groups.forEach(group -> group.removeStudent(student));
        log.info("Successfully removed edu.yagodinets.patterns.Student : " + student.getPersonalInfo().getName());
    }

}

