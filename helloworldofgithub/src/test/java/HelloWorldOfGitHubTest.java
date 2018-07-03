import org.bretself.helloworldofgithub.HelloWorldOfGitHub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldOfGitHubTest {

    private HelloWorldOfGitHub impl = new HelloWorldOfGitHub();

    @Test
    void testGetMessageReturnsValue(){
        assertEquals("Hello World", impl.getMessage());
    }
}
