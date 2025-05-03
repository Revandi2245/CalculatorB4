package com.calculatorb4.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class KalkulatorSederhanaTest {
 
    @Test
    void ujiTambah(){
        assertEquals(11, KalkulatorSederhana.tambah(7, 3));
    }

    @Test
    void ujiKurang(){
        assertEquals(10, KalkulatorSederhana.kurang(15, 5));
    }

    @Test
    void ujiKali(){
        assertEquals(10, KalkulatorSederhana.kali(2, 5));
    }

    @Test 
    void ujiBagi(){
        assertEquals(10, KalkulatorSederhana.bagi(20, 2));
    }
}
