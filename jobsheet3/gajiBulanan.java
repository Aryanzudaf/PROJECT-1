import java.util.Scanner;
public class gajiBulanan {
    public static void main(String[] args) {
    //var 
    int jumlahJam, upahPerJam; 
    float persenBonus = 0.1f, persenPajak = 0.05f;

    // input
    Scanner sc = new Scanner(System.in);
    jumlahJam = sc.nextInt();
    upahPerJam = sc.nextInt();
    
    //hitung
    int totalGaji = jumlahJam * upahPerJam;
    float bonus = persenBonus * totalGaji;
    int totalGajiPlusBonus = totalGaji + (int)persenBonus;
    float pajak = persenPajak * totalGajiPlusBonus;
    int gajiBersih = totalGajiPlusBonus - (int)pajak;

    //output
    System.out.println("total gaji anda " + totalGaji);
    System.out.println("bonus anda " + bonus);
    System.out.println("dipotong pajak " + pajak);
    System.out.println("gaji yang anda dapatkan adalah " + gajiBersih);
    }
}
