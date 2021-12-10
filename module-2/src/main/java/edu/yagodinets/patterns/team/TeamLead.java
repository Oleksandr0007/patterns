package edu.yagodinets.team;

import edu.yagodinets.technology.Technology;

import java.util.function.Consumer;

public class TeamLead extends Developer {
    private Developer developer;

    public TeamLead(Developer developer) {
        super(developer.fullName, developer.technology, developer.style);
        this.developer = developer;
    }

    public void leadTeam() {
        System.out.println(fullName + " is arranging shitloa... khm, a lot of meetings to improve team performance");
    }

    @Override
    public void writeCode() {
        developer.writeCode();
    }
}
