import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int baris, kolom;
        String penonton[][] = new String[4][2];

        // Modifikasi Program agar bisa menampilkan input data penonton, dan exit pada soal no.2
        while (true) {
            System.out.println("--- INPUT DATA ---");
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris (1-4): ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom (1-2): ");
            kolom = sc.nextInt();
            sc.nextLine();

            // Cek apakah baris/kolom valid
            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                // Cek apakah kursi masih kosong
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data " + nama + " berhasil disimpan.");
                } else { // Memodifikasi jika kursi sudah terisi untuk menjawab soal no.4
                    System.out.println("Maaf, kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1]);
                }
            } else {
                // Modifikasi Program untuk menghandle input baris/kolom yang tidak valid pada soal no.3
                System.out.println("Nomor baris atau kolom tidak valid.");
            }

            System.out.print("Input penonton lainnya (y/n)? ");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\n--- DAFTAR PENONTON ---");
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Baris " + (i + 1) + ": ");
            for (int j = 0; j < penonton[i].length; j++) {
                nama = penonton[i][j]; // Ambil nama dari array
                if (nama == null) {
                    nama = "***"; // Jika kursi kosong, menampilkan *** untuk menandakan kursi kosong pada soal no.5
                }
                System.out.printf("[%s] ", nama);
            }
            System.out.println(); // Pindah baris
        }
    }
}