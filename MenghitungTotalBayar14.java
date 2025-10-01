import java.util.Scanner;

public class MenghitungTotalBayar14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Harga;
        double Potongan;
        double JmlBayar;
        double diskon = 0.15;

        System.out.println("Menghitung Total Bayar!");
        System.out.print("Masukkan Harga Barang: ");
        Harga = input.nextInt();

        Potongan = Harga * diskon;
        JmlBayar = Harga - Potongan;

        System.out.println("Total harga yang perlu anda bayar adalah Rp." + (int) JmlBayar);

    }
}
