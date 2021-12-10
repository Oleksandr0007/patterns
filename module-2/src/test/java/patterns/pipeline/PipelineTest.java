package patterns.pipeline;

import edu.yagodinets.patterns.pipeline.Pipeline;
import org.junit.jupiter.api.Test;

public class PipelineTest {
    @Test
    void pipelineTest() {
        Pipeline pipeline = new Pipeline();
        pipeline.stages.add(()->{
            System.out.println("Stage1");
        });
        pipeline.stages.add(()->{
            System.out.println("Stage2");
        });
        pipeline.stages.add(()->{
            System.out.println("Stage3");
        });
        pipeline.run();
    }
}