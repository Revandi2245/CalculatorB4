package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.io.PrintStream;

public class ValidasiAngkaTest{
    @Test
    public void testInputBukanAngka() {
        // 1. Inisialisasi untuk ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //2. Inisasi untuk ByteArrayInputStream
        String data = "R";
        System.setIn(new ByteArrayInputStream(data.getBytes())); // Set input
        Scanner angka = new Scanner(System.in);
        // 2. Memanggil fungsi hitung
        boolean hasil = KalkulatorSederhana.validasiAngka(angka);
        // 3. Mengecek jika hasilnya adalah null
        assertFalse(hasil);
        // 4. Mengecek pesan outputnya
        String output = outContent.toString().trim();
        assertEquals("Error: Masukkan harus berupa angka!", output);
    }

    @Test
    public void testInputAdalahAngka(){;
        // 1. Inisasi untuk ByteArrayInputStream
        String data = "20.0";
        System.setIn(new ByteArrayInputStream(data.getBytes())); // Set input
        Scanner angka = new Scanner(System.in);
        // 2. Memanggil fungsi hitung
        boolean hasil = KalkulatorSederhana.validasiAngka(angka);
        // 3. Mengecek jika hasilnya adalah null
        assertTrue(hasil);
    }

}
