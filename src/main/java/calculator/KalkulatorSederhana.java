import java.util.Scanner;

public class KalkulatorSederhana {

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
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return a / b;
    }

    // Fitur untuk perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Fitur untuk memasukkan angka pertama
    public static double inputAngkaPertama(Scanner scanner) {
        System.out.print("Masukkan angka pertama: ");
        return scanner.nextDouble();
    }

    // Fitur untuk memasukkan angka kedua
    public static double inputAngkaKedua(Scanner scanner) {
        System.out.print("Masukkan angka kedua: ");
        return scanner.nextDouble();
    }

    // Fitur untuk menampilkan pilihan operator
    public static void pilihOperator() {
        System.out.print("Pilih Operator : (+, -, /, *): ");
    }

    // Fitur untuk membaca operator dari input
    public static char inputOperator(Scanner scanner) {
        pilihOperator();
        return scanner.next().charAt(0);
    }

    // Fitur untuk menghitung berdasarkan operator
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
                throw new IllegalArgumentException("Operator tidak valid.");
        }
    }

    // Fitur untuk menampilkan hasil atau error
    public static void tampilkanHasil(double angkaPertama, double angkaKedua, char operator) {
        try {
            double hasil = hitung(angkaPertama, angkaKedua, operator);
            System.out.println("Hasil: " + hasil);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angkaPertama = inputAngkaPertama(scanner);
        double angkaKedua = inputAngkaKedua(scanner);
        char operator = inputOperator(scanner);


        tampilkanHasil(angkaPertama, angkaKedua, operator);
    }
}
