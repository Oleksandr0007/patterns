package edu.yagodinets.pipeline;

import java.util.ArrayList;
import java.util.List;

public class CompoundStage implements Stage{
    List<Stage> innerStages = new ArrayList<>();
    @Override
    public void execute() {
        innerStages.forEach(Stage::execute);
    }


}