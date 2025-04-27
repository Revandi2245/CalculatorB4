import java.util.Scanner;

public class KalkulatorSederhana {

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return a / b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static boolean validasiAngka(Scanner scanner) {
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Masukkan harus berupa angka!");
            scanner.next(); // Clear invalid input
            return false;
        }
        return true;
    }

    public static boolean validasiRentang(double angka) {
        if (angka < -32768 || angka > 32767) {
            System.out.println("Angka tidak valid! Angka harus berada dalam rentang -32,768 hingga 32,767.");
            return false;
        }
        return true;
    }

    public static double inputAngka(Scanner scanner, String angkaKe) {
        double angka = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Masukkan angka " + angkaKe + ": ");
            if (validasiAngka(scanner)) {
                angka = scanner.nextDouble();
                if (validasiRentang(angka)) {
                    valid = true;
                }
            }
        }
        return angka;
    }

    public static char pilihOperator(Scanner scanner) {
        System.out.print("Pilih Operator : (+, -, /, *): ");
        return scanner.next().charAt(0);
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
                throw new IllegalArgumentException("Operator tidak valid.");
        }
    }

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

        double angkaPertama = inputAngka(scanner, "pertama");
        double angkaKedua = inputAngka(scanner, "kedua");
        char operator = pilihOperator(scanner);


        tampilkanHasil(angkaPertama, angkaKedua, operator);
    }
}
