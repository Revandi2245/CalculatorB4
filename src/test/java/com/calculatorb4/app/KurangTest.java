package com.calculatorb4.app;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static io.qameta.allure.SeverityLevel.*;

@Epic("Kalkulator Sederhana")
@Feature("Operasi Aritmatika")
@DisplayName("Test Fungsi Pengurangan")
public class KurangTest {

    @Test
    @Severity(CRITICAL)
    @Story("Perhitungan Dasar")
    @DisplayName("Test pengurangan bilangan positif")
    @Description("Memastikan 10 - 7 menghasilkan 3")
    public void testKurangBilanganPositif() {
        double hasil = KalkulatorSederhana.kurang(10, 7);
        assertEquals(3.0, hasil);
    }

    @Test
    @Severity(CRITICAL)
    @Story("Perhitungan Dasar")
    @DisplayName("Test pengurangan bilangan negatif")
    @Description("Memastikan -10 - (-7) menghasilkan -3")
    public void testKurangNegatif() {
        double hasil = KalkulatorSederhana.kurang(-10, -7);
        assertEquals(-3.0, hasil);
    }
}