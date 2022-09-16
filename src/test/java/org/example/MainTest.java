package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {





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

    @Test
    @DisplayName("If no pairs of sides are equal, return scalene.")
    void scalene() {

        assertAll(() -> assertTrue(Main.kindOfTriangle(5, 8, 6) == "scalene"),
                () -> assertTrue(Main.kindOfTriangle(5, 7, 9) == "scalene"));

    }

    @Test
    @DisplayName("If input is invalid, return invalid")
    void invalid() {

        assertAll(() -> assertTrue(Main.kindOfTriangle(21, 5, 7) == "invalid"),
                () -> assertTrue(Main.kindOfTriangle(-2, 7, 5) == "invalid"),
                () -> assertTrue(Main.kindOfTriangle(19, 1, 1) == "invalid")
                );

    }
}