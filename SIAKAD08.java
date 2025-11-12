import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modifikasi
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine(); // Wajib untuk untuk bufferinggnya

        // Array dibuat berdasarkan input user nya
        int nilai[][] = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) { // nilai.length akan mengikuti baris yaitu adalah jmlMahasiswa
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));

            int totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) { // nilai[i].length akan = jmlMatkul
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            // dibagi panjang baris sudah benar karena nilai[i].length mengikuti jumlah matkul yang diinput user
            System.out.println("Nilai rata-rata: " + ((double) totalPerSiswa / nilai[i].length));
        }

        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah: ");

        for (int j = 0; j < nilai[0].length; j++) { 
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) { 
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / nilai.length));
        }
    }
}