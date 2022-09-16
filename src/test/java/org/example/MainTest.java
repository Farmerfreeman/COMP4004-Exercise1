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

    @Test
    @DisplayName("Ensure inputs are less than 20")
    void LessThan20() {

        assertAll(() -> assertTrue(Main.a < 20),
                () -> assertTrue(Main.b < 20),
                () -> assertTrue(Main.c < 20));

    }

    @Test
    @DisplayName("If all 3 inputs are equal, return equilateral.")
    void equilateral() {

        assertAll(() -> assertTrue(Main.kindOfTriangle(5, 5, 5) == "equilateral"));

    }

    @Test
    @DisplayName("If a pair of sides are equal, return isosceles.")
    void isosceles() {

        assertAll(() -> assertTrue(Main.kindOfTriangle(5, 5, 7) == "isosceles"),
                () -> assertTrue(Main.kindOfTriangle(5, 7, 5) == "isosceles"));

    }
}