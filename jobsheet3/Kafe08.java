import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi =  12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f; //100f agar dikenali sbg float
        double totalHarga, nominalBayar, nominalInt, totalByte;


        System.out.println("masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        totalByte = (byte) totalHarga;
        nominalBayar = totalHarga - (diskon * totalHarga);
        nominalInt = (int) nominalBayar;

        System.out.println("keanggotaan pelanggan adalah " + keanggotaan);
        System.out.println("item pembelian: " + jmlKopi + "kopi,"+ jmlTeh + "teh," + jmlRoti + " roti ");
        System.out.println("nominal bayar Rp " + nominalBayar );
        System.out.println("nominal pembayaran int Rp " + nominalInt);
        System.out.println("total harga byte " + totalByte);

    }
}
