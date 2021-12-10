package edu.yagodinets.project;

import edu.yagodinets.pipeline.Pipeline;
import edu.yagodinets.team.Team;

public class Module {

    public ModuleType type;
    public String name;
    public Team team;
    public Pipeline pipeline;

    public Module(ModuleType type, String name, Team team, Pipeline pipeline) {
        this.type = type;
        this.name = name;
        this.team = team;
        this.pipeline = pipeline;
    }

    public Module() {
    }

    public void build() {
        System.out.println("Team " + team.name + " started building  " + type.desc + " " + name);
        pipeline.run();
        System.out.println(type.desc + " " + name + " has been successfully built");
    }

    public enum ModuleType {
        ANDROID_APP("android application"),
        IOS_APP("IOS application"),
        WEB_APP("web application"),
        DB("database");

        String desc;

        ModuleType(String desc) {
            this.desc = desc;
        }
    }
}