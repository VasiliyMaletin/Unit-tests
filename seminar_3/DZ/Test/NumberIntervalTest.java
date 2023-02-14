package DZTest;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.NumberInterval;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberIntervalTest {
    @Test
    void CheckTrueTest() {
        assertTrue(NumberInterval.numberInterval(45));
    }

    @Test
    void CheckFalseTest() {
        assertFalse(NumberInterval.numberInterval(24));
    }
}
