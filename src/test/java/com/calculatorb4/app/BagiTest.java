package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BagiTest {

    @Test
    public void testBagiPembilang0() {
        // 1. Inisialisasi untuk ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // 2. Memanggil fungsi bagi
        Double hasil = KalkulatorSederhana.bagi(20, 0);
        // 3. Mengecek jika hasilnya adalah null
        assertNull(hasil);
        // 4. Mengecek pesan outputnya
        String output = outContent.toString().trim();
        assertEquals("Error: Pembagian dengan nol tidak diperbolehkan!", output);
    }
    @Test
    public void testBagiPembilangBukan0() {
        // 1. Memanggil funsi bagi
        Double hasil = KalkulatorSederhana.bagi(20, 5);
        // 2. Mengecek jika hasilnya adalah 4
        assertEquals(4.0, hasil);
    }


}

