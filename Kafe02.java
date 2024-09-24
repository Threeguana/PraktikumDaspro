import java.util.Scanner;
public class Kafe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih minuman yang ingin kamu beli:");
        System.out.println("1. Americano  - Rp 10.000");
        System.out.println("2. Cappuccino - Rp 14.000");
        System.out.println("3. Mocha      - Rp 16.000");
        System.out.println("4. Caramel    - Rp 18.000");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihanBarang = sc.nextInt();

        System.out.print("Masukkan total pembelian: ");
        double totalPembelian = sc.nextDouble();

        System.out.print("Apakah Anda member? ");
        String isMember = sc.next();

        double hargaBarang = 0;        

        switch (pilihanBarang) {
            case 1:
                hargaBarang = 10000;
                System.out.println("Anda memilih Americano.");
                break;
            case 2:
                hargaBarang = 14000;
                System.out.println("Anda memilih Cappuccino.");
                break;
            case 3:
                hargaBarang = 16000;
                System.out.println("Anda memilih Mocha.");
                break;
            case 4:
                hargaBarang = 18000;
                System.out.println("Anda memilih Caramel.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        totalPembelian += hargaBarang;

        double diskon = 0.10;
        double totalSetelahDiskon;

        if (isMember.equals("ya")) {
            totalSetelahDiskon = totalPembelian - (totalPembelian * diskon);
            System.out.println("Diskon diberikan sebesar 10%");
        } else {
            totalSetelahDiskon = totalPembelian;
            System.out.println("Tidak ada diskon karena bukan member.");
        }

        sc.close();

        System.out.println("Total setelah diskon: Rp " + totalSetelahDiskon);
    }
}
