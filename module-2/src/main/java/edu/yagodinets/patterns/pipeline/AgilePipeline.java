package edu.yagodinets.pipeline;

import java.util.List;

/**
 * simple template for pipeline with "Agile" SDLC
 */
public class AgilePipeline extends Pipeline{
    public AgilePipeline() {
        stages.add(() -> {
            System.out.println("Analysing requirements...");
        });
        stages.add(() -> {
            System.out.println("Planning development process");
        });
        stages.add(() -> {
            System.out.println("Designing arcitecture");
        });
        stages.add(() -> {
            System.out.println("Testing codebase");
        });
        stages.add(() -> {
            System.out.println("Deploing ready-to-use finctionality");
        });
    }
}
