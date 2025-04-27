package main.java.calculator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("---------------------");

        try {
            System.out.print("Masukkan angka pertama: ");
            String num1Str = scanner.nextLine();

            System.out.print("Masukkan angka kedua: ");
            String num2Str = scanner.nextLine();

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            String result = Computation.compute(num1Str, num2Str, operator);
            System.out.println("Hasil: " + result);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}