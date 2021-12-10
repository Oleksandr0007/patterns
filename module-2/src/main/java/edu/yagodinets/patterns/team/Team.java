package edu.yagodinets.team;

import java.util.List;

public class Team {
    public Team(String name, List<TeamMember> members) {
        this.name = name;
        this.members = members;
    }

    public Team() {
    }

    public String name;
    List<TeamMember> members;
}
