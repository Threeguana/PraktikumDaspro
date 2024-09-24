import java.util.Scanner;
public class PemilihanHariDenganIf02 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;

        System.out.print("Tentukan nomor hari (1-7): ");
        dayNumber = sc.nextInt();

        String dayType;

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }

        System.out.println("Nomor hari " + dayNumber + " adalah " + dayType);
        sc.close();
    }
}
