import java.util.Scanner;

public class KalkulatorSederhana {

    // Fitur untuk menampilkan halaman/menu
    public static void tampilkanMenu() {
        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.print("Pilih menu (1/2): ");
    }

    // Fitur untuk input angka pertama
    public static double inputAngkaPertama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        return scanner.nextDouble();
    }

    // Fitur untuk input angka kedua
    public static double inputAngkaKedua() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka kedua: ");
        return scanner.nextDouble();
    }

    // Fitur untuk pertambahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Fitur untuk pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Fitur untuk pembagian
    public static double bagi(double a, double b) {
        return a / b;
    }

    // Fitur untuk perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Fitur untuk menentukan operasi
    public static void prosesOperasi(int pilihan, double angka1, double angka2) {
        if (pilihan == 1) {
            double hasil = tambah(angka1, angka2);
            tampilkanHasil("Penjumlahan", hasil);
        } else if (pilihan == 2) {
            double hasil = kurang(angka1, angka2);
            tampilkanHasil("Pengurangan", hasil);
        } else {
            tampilkanPilihanTidakValid();
        }
    }

    // Fitur untuk menampilkan hasil
    public static void tampilkanHasil(String operasi, double hasil) {
        System.out.println("Hasil " + operasi + ": " + hasil);
    }

    // Fitur untuk menampilkan pesan pilihan tidak valid
    public static void tampilkanPilihanTidakValid() {
        System.out.println("Pilihan tidak valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tampilkanMenu();
        int pilihan = scanner.nextInt();

        double angka1 = inputAngkaPertama();
        double angka2 = inputAngkaKedua();

        prosesOperasi(pilihan, angka1, angka2);

        scanner.close();
    }
}
