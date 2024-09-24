import java.util.Scanner;
public class Siakad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama         : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM          : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas        : ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan nomor absen  : ");
        int nomorAbsen = sc.nextInt();

        System.out.print("Masukkan nilai kuis   : ");
        int nilaiKuis = sc.nextInt();

        System.out.print("Masukkan nilai tugas  : ");
        int nilaiTugas = sc.nextInt();

        System.out.print("Masukkan nilai ujian  : ");
        int nilaiUjian = sc.nextInt();

        double rataRataNilai = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        String nilaiHuruf;
        String kualifikasi;

        if (80 < rataRataNilai && rataRataNilai <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (73 < rataRataNilai && rataRataNilai <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (65 < rataRataNilai && rataRataNilai <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (60 < rataRataNilai && rataRataNilai <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (50 < rataRataNilai && rataRataNilai <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (39 < rataRataNilai && rataRataNilai <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        sc.close();

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + nomorAbsen);
        System.out.println("Rata-rata Nilai       : " + rataRataNilai);
        System.out.println("Nilai Huruf           : " + nilaiHuruf);
        System.out.println("Kualifikasi           : " + kualifikasi);
    }
}
