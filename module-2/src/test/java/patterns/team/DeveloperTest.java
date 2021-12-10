package patterns.team;

import edu.yagodinets.team.Developer;
import edu.yagodinets.technology.JavaScript;
import edu.yagodinets.technology.Python;
import org.junit.jupiter.api.Test;

public class DeveloperTest {
    @Test
    void devTest() {
        Developer developer = new Developer("John",new JavaScript(),(D)-> {System.out.println("Typing in hurry,because deadline was yesterday");});
        developer.writeCode();
    }
}
