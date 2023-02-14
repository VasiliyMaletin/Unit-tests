package DZTest;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.EvenOddNumber;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EvenOddNumberTest {

    @Test
    void CheckTrueTest() {
        assertTrue(EvenOddNumber.evenOddNumber(0));
    }

    @Test
    void CheckFalseTest() {
        assertFalse(EvenOddNumber.evenOddNumber(1));
    }
}
