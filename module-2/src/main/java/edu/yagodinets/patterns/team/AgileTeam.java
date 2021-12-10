package edu.yagodinets.team;

import edu.yagodinets.technology.Python;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple template for agile teams
 */
public class AgileTeam extends Team{
    public static final List<TeamMember> DEFAULD_TEAM;
    static {
        List<TeamMember> members = new ArrayList<>();
        members.add(new TeamLead(new Developer("John", new Python(),(D)->{System.out.println("coding like a God");})));
        members.add(new Developer("Mike",new Python(),(D)->{ System.out.println("Coding, sitting on the beach and drinking smoothie. Lucky bastard"); }));
        members.add(new QA());
        members.add(new SoftwareArchitect(new Developer("Amadeus",new Python(),(D)->{ System.out.println("He is not coding, he`s too cool to just code"); })));
        DEFAULD_TEAM = members;
    }
    public AgileTeam(String name, List<TeamMember> members) {
        super(name, members);
    }

    public AgileTeam(String name) {
        super(name,DEFAULD_TEAM);
    }

    public AgileTeam() {
    }
}
