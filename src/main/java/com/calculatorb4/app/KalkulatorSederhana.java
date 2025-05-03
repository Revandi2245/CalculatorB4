package com.calculatorb4.app;

import java.util.Scanner;

public class KalkulatorSederhana {

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }
    public static Double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return null;
        }
        return a / b;
    }
    public static double kali(double a, double b) {
        return a * b;
    }
    public static boolean validasiAngka(Scanner scanner) {
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Masukkan harus berupa angka!");
            scanner.next(); 
            return false;
        }
        return true;
    }

    public static boolean validasiRentang(double angka) {
        if (angka < -32768 || angka > 32767) {
            System.out.println("Error: Angka diluar rentang yang ditentukan!");
            return false;
        }
        return true;
    }

    public static Double inputAngka(Scanner scanner, String angkaKe) {
        double angka = 0;
            System.out.print("Masukkan angka " + angkaKe + ": ");
            if (!validasiAngka(scanner)) {
                return null;
            } else {
                angka = scanner.nextDouble();
            }
                if (!validasiRentang(angka)) {
                    return null;
                }
            return angka;
        }

    

    public static Character pilihOperator(Scanner scanner) {
        char operator = ' ';
        System.out.print("Pilih Operator : (+,-,/,*): ");
        String input = scanner.next();
        if (input.length() != 1) {
            System.out.println("Error: Input operator hanya menerima 1 input!");
            return null;
        } else {
            operator = input.charAt(0);
        }
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("Error: Operator yang dimasukkan tidak valid!");
            return null;
        }
        return operator;
    }



    public static double hitung(double angkaPertama, double angkaKedua, char operator) {
        switch (operator) {
            case '+':
                return tambah(angkaPertama, angkaKedua);
            case '-':
                return kurang(angkaPertama, angkaKedua);
            case '/':
                return bagi(angkaPertama, angkaKedua);
            case '*':
                return kali(angkaPertama, angkaKedua);
                default:
                System.out.println("Error: Operator tidak valid!");
                System.exit(1); // non-zero exit code
                return 0;
        }
    }

    public static void tampilkanHasil(double angkaPertama, double angkaKedua, char operator) {
        double hasil = hitung(angkaPertama, angkaKedua, operator);
        System.out.println("Hasil: " + hasil);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double angkaPertama = inputAngka(scanner, "pertama");
        if (angkaPertama == null) return;

        Double angkaKedua = inputAngka(scanner, "kedua");
        if (angkaKedua == null) return;

        Character operator = pilihOperator(scanner);
        if (operator == null) return;

        tampilkanHasil(angkaPertama, angkaKedua, operator);
    }
}
