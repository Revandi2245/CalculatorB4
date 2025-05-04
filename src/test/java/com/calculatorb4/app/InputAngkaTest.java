package com.calculatorb4.app;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static io.qameta.allure.SeverityLevel.*;

@Epic("Kalkulator Sederhana")
@Feature("Validasi Input")
@DisplayName("Test Validasi Input Angka")
public class InputAngkaTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @Severity(CRITICAL)
    @Story("Input Valid")
    @DisplayName("Test input angka dalam rentang valid")
    @Description("Memastikan input angka 3 (dalam rentang -32768 sampai 32767) diterima")
    public void testInputAngkaDalamRentangAngkaValid() {
        provideInput("3\n");
        Scanner scanner = new Scanner(System.in);
        Double angka = KalkulatorSederhana.inputAngka(scanner, "pertama");
        assertEquals(3, angka);
    }

    @Test
    @Severity(CRITICAL)
    @Story("Input Invalid")
    @DisplayName("Test input angka di luar rentang valid")
    @Description("Memastikan input 32768 (melebihi batas maksimal 32767) ditolak")
    public void testInputAngkaDiluarRentangAngkaValid() {
        provideInput("32768\n");
        Scanner scanner = new Scanner(System.in);
        Double angka = KalkulatorSederhana.inputAngka(scanner, "pertama");
        assertNull(angka);
        assertTrue(testOut.toString().contains("Error: Angka terlalu besar!"));
    }

    @Test
    @Severity(CRITICAL)
    @Story("Input Invalid")
    @DisplayName("Test input bukan angka")
    @Description("Memastikan input karakter 'a' (bukan angka) ditolak")
    public void testInputBukanAngka() {
        provideInput("a\n");
        Scanner scanner = new Scanner(System.in);
        Double angka = KalkulatorSederhana.inputAngka(scanner, "pertama");
        assertNull(angka);
        assertTrue(testOut.toString().contains("Error: Masukkan harus berupa angka!"));
    }
}