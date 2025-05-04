package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class TampilkanHasilTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testTampilkanHasil() {
        KalkulatorSederhana.tampilkanHasil(10, 4, '*');
        assertEquals("Hasil: 40.0", outContent.toString().trim());  
    }
}
