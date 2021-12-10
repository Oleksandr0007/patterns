package edu.yagodinets.project;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public String name;
    public List<Module> modules = new ArrayList<>();
    public double budget;

    public Project(String name, List<Module> modules, double budget) {
        this.name = name;
        this.modules = modules;
        this.budget = budget;
    }

    public Project() {
    }

    public void build() {
        System.out.println("Starting project " + name);
        modules.forEach(Module::build);
        System.out.println("project done");
    }
}