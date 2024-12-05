import java.util.Scanner;
public class saldoAkhir {
    public static void main(String[] args) {
        double saldoAwal,jmlBulan,saldoFinal,saldoBunga;
        double bunga=0.02;

        Scanner sa = new Scanner(System.in);

        System.out.println("masukkan saldo awal");
        saldoAwal = sa.nextDouble();
        System.out.println("masukkan jumlah bulan");
        jmlBulan = sa.nextDouble();


        saldoBunga = saldoAwal * bunga * jmlBulan;
        saldoFinal = saldoAwal-saldoBunga;
        System.out.print("saldo akhir anda adalah"  + saldoFinal + "juta");
    }
}
