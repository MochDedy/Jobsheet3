import java.util.Scanner;

public class MenghitungLuasPersegiPanjang14{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Panjang;
        int Lebar;
        int Luas;
        

        System.out.println("Menghitung Luas Persegi Panjang!");
        System.out.print("Masukkan ukuran Panjang: ");
        Panjang = input.nextInt();

        System.out.print("Masukkan ukuran lebar: ");
        Lebar = input.nextInt();

        Luas = Panjang  * Lebar;

        System.out.println("Luas Persegi Panjang adalah " +Luas +"m2");
    }
}