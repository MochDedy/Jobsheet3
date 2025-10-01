import java.util.Scanner;

public class Tugas1 {
    public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);

    int HargaMotor, UangMuka, SisaCicilan, Bulan;
    double SisaHutang, Total;

    System.out.println("Menghitung Jumlah Cicilan perbulan!");
    System.out.print("Masukkan harga sepeda: ");
    HargaMotor = input.nextInt();

    System.out.print("Masukkan Uangmuka: ");
    UangMuka = input.nextInt();

    System.out.print("Masukkan berapa bulan lama cicilan: ");
    Bulan = input.nextInt();

    SisaCicilan = HargaMotor - UangMuka;
    SisaHutang = SisaCicilan + (SisaCicilan * Bulan * 0.01);
    Total = SisaHutang / Bulan;

    
    System.out.print("Cicilan perbulan anda adalah: Rp. " + (int) Total);
    }
}