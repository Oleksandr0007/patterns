package edu.yagodinets.team;

import edu.yagodinets.technology.Technology;

import java.util.function.Consumer;
import java.util.function.Function;

public class Developer extends TeamMember {
    Technology technology;
    Consumer<Dummy> style;

    public Developer(String fullName,Technology technology, Consumer<Dummy> style) {
        this.technology = technology;
        this.fullName = fullName;
        this.style = style;
    }

    public void writeCode() {
        System.out.println(fullName + " is writing code in "+technology.name+":");
        technology.doSomeStuff();
        style.accept(DUMMY);
        System.out.println(fullName + "`s task is done");
    }

    /**
     * dummy class to use in lambda
     */
    public static class Dummy {

    }
    private static Dummy DUMMY = new Dummy();

}
