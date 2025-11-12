import java.util.Scanner;

public class StudiKasus08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlResponden = 10, jmlPertanyaan = 6;
        double rataRataKeseluruhan = 0, totalKeseluruhan = 0, rataRataPertanyaan = 0, rataRataResponden = 0;

        // Array 2D untuk menyimpan hasil survey
        int survey[][] = new int[jmlResponden][jmlPertanyaan];

        System.out.println("Analisis Survei Kepuasan Pelanggan ");
        
        for (int i = 0; i < jmlResponden; i++) {
            System.out.println("Data Responden ke-" + (i + 1));
            // Inner loop untuk pertanyaan
            for (int j = 0; j < jmlPertanyaan; j++) {
                System.out.print("  Jawaban Pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input data selesai");

        // Menghitung rata-rata responden
        System.out.println("Rata-rata per Responden");
        
        // Outer loop (Responden
        for (int i = 0; i < jmlResponden; i++) {
            // inisiasi total responden untuk merestart total setiap responden
            int totalPerResponden = 0;
            
            // Untuk Pertanyaan lagi
            for (int j = 0; j < jmlPertanyaan; j++) {
                // Ambil data dari array
                totalPerResponden += survey[i][j];
                // Hitung total keseluruhan
                totalKeseluruhan += survey[i][j];
            }
            
            // Hitung dan cetak rata-rata untuk responden ke-'i'
            rataRataResponden = (double) totalPerResponden / jmlPertanyaan;
            System.out.println("Rata-rata Responden " + (i + 1) + ": " + rataRataResponden);
        }

        // Rata-rata per pertanyaannyaa
        System.out.println("Rata-rata per Pertanyaan");

        for (int j = 0; j < jmlPertanyaan; j++) {
            // totalPerPertanyaan di-reset setiap ganti pertanyaan baru
            int totalPerPertanyaan = 0;
            
            // Inner loop bagian responden
            for (int i = 0; i < jmlResponden; i++) {
                // Ambil data [responden i][pertanyaan j]
                totalPerPertanyaan += survey[i][j];
            }
            
            // Hitung dan mencetak rata-rata untuk pertanyaan ke-'j'
            rataRataPertanyaan = (double) totalPerPertanyaan / jmlResponden;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        // Rata-rata keseluruhan survei
        System.out.println("Rata-rata Keseluruhan Survei");

        rataRataKeseluruhan = (double) totalKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("Rata-rata Keseluruhan Survei: " + rataRataKeseluruhan);
    }
}