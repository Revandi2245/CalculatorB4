package main.java.calculator;

public class Computation {
    public static String compute(String num1Str, String num2Str, String operator) {
        // Validasi 1: Input harus angka
        if (isNumeric(num1Str) || isNumeric(num2Str)) {
            return "Error: Input harus berupa angka";
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Validasi 2: Range angka (-32,768 hingga 32,767)
        if (num1 < -32768 || num1 > 32767 || num2 < -32768 || num2 > 32767) {
            return "Error: Angka harus berada dalam range -32,768 hingga 32,767";
        }

        // Validasi 3: Operator valid
        if (!operator.matches("[+\\-*/]")) {
            return "Error: Operator harus berupa +, -, *, atau /";
        }

        // Validasi 4: Pembagi tidak nol untuk operasi pembagian
        if (operator.equals("/") && num2 == 0) {
            return "Error: Pembagi tidak boleh nol";
        }

        // Jika semua validasi lolos, lakukan komputasi
        try {
            double result = switch (operator) {
                case "+" -> Calculator.add(num1, num2);
                case "-" -> Calculator.subtract(num1, num2);
                case "*" -> Calculator.multiply(num1, num2);
                case "/" -> Calculator.divide(num1, num2);
                default -> 0;
            };
            return String.valueOf(result);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
