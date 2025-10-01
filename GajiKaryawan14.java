import java.util.Scanner;

public class GajiKaryawan14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int GajiPokok;
        double Bonus, totGaji;
        double TunjTransp=600000;
        double TunjMkn=400000;

        System.out.println("Menghitung Gaji Karyawan!");
        System.out.print("Masukkan Gaji Pokok anda: ");
        GajiPokok = input.nextInt();

        System.out.println("\nTunjangan Transportasi anda adalah Rp. " +TunjTransp);
        System.out.println("Tunjangan Makan anda adalah Rp. " +TunjMkn);
        System.out.println("Anda mendapatkan bonus kinerja sebesar 5% dari Gaji Pokok anda!");
        System.out.println("Wajib bayar pajak anda adalah 10%  dari Gaji Pokok anda!");
        Bonus = 0.05 * GajiPokok;
        totGaji = GajiPokok+TunjTransp+TunjMkn+Bonus-(0.1*GajiPokok);

        System.out.println("\nBonus bulanan anda sebesar Rp." + (int) Bonus);
        System.out.println("Gaji yang diterima adalah Rp." + (int) totGaji);
    }
    
}
