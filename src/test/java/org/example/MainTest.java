package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Ensure inputs are positive")
    void positive() {
        assertAll(() -> assertTrue(Main.a > 0),
                () -> assertTrue(Main.b > 0),
                () -> assertTrue(Main.c > 0));

    }
}