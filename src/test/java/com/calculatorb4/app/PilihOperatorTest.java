package com.calculatorb4.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PilihOperatorTest {
    
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
    public void testTambah() {
        String input = "+\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertEquals('+', result);
    }

    @Test
    public void testKurang() {
        String input = "-\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertEquals('-', result);
    }

    @Test
    public void testKali() {
        String input = "*\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertEquals('*', result);
    }

    @Test
    public void testBagi() {
        String input = "/\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertEquals('/', result);
    }

    @Test
    public void testInputGanda() {
        String input = "++\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertTrue(outContent.toString().contains("Error: Input operator hanya menerima 1 input!"));
        assertNull(result);
    }

    @Test
    public void testInputInvalid() {
        String input = ":\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertTrue(outContent.toString().contains("Error: Operator yang dimasukkan tidak valid!"));
        assertNull(result);
    }

}
