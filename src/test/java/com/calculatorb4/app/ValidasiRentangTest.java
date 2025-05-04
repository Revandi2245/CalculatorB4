package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.io.PrintStream;

public class ValidasiRentangTest{
    @Test
    public void testAngkaKelebihan() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // 2. Memanggil fungsi hitung
        boolean hasil = KalkulatorSederhana.validasiRentang(32768);
        // 3. Mengecek jika hasilnya adalah null
        assertFalse(hasil);
        String output = outContent.toString().trim();
        assertEquals("Error: Angka terlalu besar! Maksimal 32,767.",output);
    }

    @Test
    public void testAngkaKekurangan(){;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // 2. Memanggil fungsi hitung
        boolean hasil = KalkulatorSederhana.validasiRentang(-32769);
        // 3. Mengecek jika hasilnya adalah null
        assertFalse(hasil);
        String output = outContent.toString().trim();
        assertEquals("Error: Angka terlalu kecil! Minimal -32,768.",output);
    }
    @Test
    public void testAngkaDalamRentang(){;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean hasil = KalkulatorSederhana.validasiRentang(20);
        assertTrue(hasil);
    }
    @Test
    public void testAngkaDalamRentangNegatif(){;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        boolean hasil = KalkulatorSederhana.validasiRentang(-20);
        assertTrue(hasil);
    }

}
