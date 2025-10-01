import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int Jarak, HargaBensin = 10000;
        double LiterBensin, TotalBiaya, KonsumsiPerliter = 0.5; //1 Liter untuk 2 Km.

        System.out.println("Menghitung Rincian Biaya Bensin!");
        System.out.print("\nMasukkan Jarak yang ditempuh (km): ");
        Jarak = input.nextInt();

        LiterBensin = Jarak * KonsumsiPerliter;
        TotalBiaya = LiterBensin * HargaBensin;

        System.out.println("\nRincian Biaya!");
        System.out.println("Jarak Perjalanan: " +Jarak +"km");
        System.out.println("Bensin yang diperlukan: " +LiterBensin +"Liter");
        System.out.println("Total Biaya bensin: Rp." + TotalBiaya);
    }
}
