import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesersCipherTest {

    private CaesersCipher caesersCipher = new CaesersCipher();

    @Test
    void testCipheredMessageWithOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmk", caesersCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesersCipher.cipher("", 12));
    }
}
