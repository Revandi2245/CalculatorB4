package com.calculatorb4.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KalkulatorSederhanaTest {

    @Test
    void testTambah() {
        assertEquals(10.0, KalkulatorSederhana.tambah(4.0, 6.0));
    }

    @Test
    void testKurang() {
        assertEquals(2.0, KalkulatorSederhana.kurang(5.0, 3.0));
    }

    @Test
    void testKali() {
        assertEquals(20.0, KalkulatorSederhana.kali(4.0, 5.0));
    }

    @Test
    void testBagiNormal() {
        assertEquals(2.0, KalkulatorSederhana.bagi(10.0, 5.0));
    }


}
