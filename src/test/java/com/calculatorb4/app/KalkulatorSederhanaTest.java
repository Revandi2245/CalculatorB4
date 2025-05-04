package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.util.Scanner;

public class KalkulatorSederhanaTest {

    @Test
    public void testPilihOperatorValidPlus() {
        Scanner scanner = new Scanner("+");
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertEquals('+', result);
    }

    @Test
    public void testPilihOperatorValidMinus() {
        Scanner scanner = new Scanner("-");
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertEquals('-', result);
    }

    @Test
    public void testPilihOperatorInvalidLength() {
        Scanner scanner = new Scanner("++");
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertNull(result);
    }

    @Test
    public void testPilihOperatorInvalidCharacter() {
        Scanner scanner = new Scanner("x");
        Character result = KalkulatorSederhana.pilihOperator(scanner);
        assertNull(result);
    }
    @Test
    public void testOperatorInvalidLengthMessage() {
        // Simpan output asli
        PrintStream originalOut = System.out;

        // Redirect System.out ke ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner("++");
        Character result = KalkulatorSederhana.pilihOperator(scanner);

        // Kembalikan System.out
        System.setOut(originalOut);

        String output = outputStream.toString().trim();

        assertNull(result);
        assertTrue(output.contains("Error: Input operator hanya menerima 1 input!"));
    }

    @Test
    public void testOperatorInvalidCharacterMessage() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner("x");
        Character result = KalkulatorSederhana.pilihOperator(scanner);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertNull(result);
        assertTrue(output.contains("Error: Operator yang dimasukkan tidak Valid!"));
    }
}

