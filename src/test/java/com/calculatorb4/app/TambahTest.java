package com.calculatorb4.app;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static io.qameta.allure.SeverityLevel.*;

@Epic("Kalkulator Sederhana")
@Feature("Operasi Aritmatika")
@DisplayName("Test Fungsi Penjumlahan")
public class TambahTest {

    @Test
    @Severity(CRITICAL)
    @Story("Perhitungan Dasar")
    @DisplayName("Test penjumlahan bilangan positif")
    @Description("Memastikan 10 + 7 menghasilkan 17")
    public void testTambahBilanganPositif() {
        double hasil = KalkulatorSederhana.tambah(10, 7);
        assertEquals(17.0, hasil);
    }

    @Test
    @Severity(CRITICAL)
    @Story("Perhitungan Dasar")
    @DisplayName("Test penjumlahan bilangan negatif")
    @Description("Memastikan -10 + (-7) menghasilkan -17")
    public void testTambahBilanganNegatif() {
        double hasil = KalkulatorSederhana.tambah(-10, -7);
        assertEquals(-17.0, hasil);
    }
}