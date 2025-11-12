public class Bioskop08 {
    public static void main(String[] args) {
        String penonton[][] = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana"; // Penambahan baru data penonton pada soal no.3

        // Memodifikasi kode utk menampilkan data penonton menggunakan perulangan foreach pada soal no.9
        System.out.println("Data Penonton Bioskop:");
        for (String[] baris : penonton) {
            for (String nama : baris) {
                System.out.print(nama + " ");
            }
            System.out.println();
        }

        // Penambahan kode untuk menampilkan jumlah baris dan kolom pada soal no.4
        System.out.println(penonton.length);
        
        // Memodifikasi kode pada no.5 dari perulangan for biasa menjadi enhanced for (foreach) pada soal no.6
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);   
        }
    }
}