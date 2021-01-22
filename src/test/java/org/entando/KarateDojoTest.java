package org.entando;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast-test")
class KarateDojoTest {

    @Test
    void miyagiDo() {
        assertEquals("Nice bonsai", new KarateDojo().miyagiDo());
    }

    @Test
    void kobraKai() {
        assertEquals("Never Dies", new KarateDojo().kobraKai());
    }
}
