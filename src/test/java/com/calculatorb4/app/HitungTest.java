package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class HitungTest {

    @Test
    public void testPertambahan() {
        assertEquals(25.0, KalkulatorSederhana.hitung(20, 5, '+'));
    }

    @Test
    public void testPengurangan() {
        assertEquals(15.0, KalkulatorSederhana.hitung(20, 5, '-'));
    }

    @Test
    public void testPerkalian() {
        assertEquals(100.0, KalkulatorSederhana.hitung(20, 5, '*'));
    }

    @Test
    public void testPembagian() {
        assertEquals(4.0, KalkulatorSederhana.hitung(20, 5, '/'));
    }



    @Test
    public void testOperatorTidakValid() {
        // 1. Inisialisasi untuk ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // 2. Memanggil fungsi hitung
        Double hasil = KalkulatorSederhana.hitung(20, 5,'!');
        // 3. Mengecek jika hasilnya adalah null
        assertNull(hasil);
        // 4. Mengecek pesan outputnya
        String output = outContent.toString().trim();
        assertEquals("Error: Operator yang dimasukkan tidak valid!", output);
    }
}
