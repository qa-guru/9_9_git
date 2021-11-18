package guru.qa.gitexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void secondTest() {
        Assertions.assertTrue(2 > 1);
    }

    @Test
    void simpleTest() {
        Assertions.assertTrue(true);
    }
}
