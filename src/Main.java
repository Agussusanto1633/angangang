import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nama = new ArrayList<>();

        while (true) {

            int i = nama.size(); // Use current size for numbering
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            String namaInput = scanner.nextLine();

            try {
                if (namaInput.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }

                if (!namaInput.equalsIgnoreCase("selesai")) {
                    nama.add(namaInput);
                } else {
                    break;
                }
            } catch (IllegalArgumentException e) {
                // Print error message after the input line
                System.err.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nDaftar Nama Mahasiswa:");
        for (String mahasiswa : nama) {
            System.out.println("- " + mahasiswa);
 }
}
}