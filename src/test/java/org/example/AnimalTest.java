package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalTest
{

    int a;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        a = 1;
    }

    @Test
    void myFirstTest()
    {
        assertTrue(a > 0);
    }
}