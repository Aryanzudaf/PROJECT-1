import java.util.Scanner;
public class perhitunganKalori {
    public static void main(String[] args) {
        //koefisien or variabel tetap
        double berlari = 0.05,berenang = 0.04,bersepeda = 0.03, bb = 65;

        //variabel bebas
        double durasi,durasiLari,durasiRenang, durasiSepeda,kecepatanRata2, ketinggian, koefisien, totalKalori, totalKaloriPermenit, persen;
        
        
        //deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //tempat input
        System.out.println("masukkan durasi lari ");
        durasiLari = sc.nextDouble();
        koefisien = berlari;
        System.out.println("masukkan kecepatan rata-rata");
        kecepatanRata2 = sc.nextDouble();
        System.out.println("masukkan ketinggian lokasi");
        ketinggian = sc.nextDouble();
        //rumus perhitungan kalori
        double kalori1= berlari = (durasiLari * koefisien * bb) + (kecepatanRata2 * 0.5) + (ketinggian * 0.01);
        //output kalori
        System.out.println("kalori yang dibakar adalah " + kalori1);

           //tempat input
           System.out.println("masukkan durasi renang ");
           durasiRenang = sc.nextDouble();
           koefisien = berenang;
           System.out.println("masukkan kecepatan rata-rata");
           kecepatanRata2 = sc.nextDouble();
           System.out.println("masukkan ketinggian lokasi");
           ketinggian = sc.nextDouble();
           //rumus perhitungan kalori
           double kalori2 = berenang = (durasiRenang* koefisien * bb) + (kecepatanRata2 * 0.5) + (ketinggian * 0.01);
           //output kalori
           System.out.println("kalori yang dibakar adalah " + kalori2);

           //tempat input
           System.out.println("masukkan durasi sepeda ");
           durasiSepeda = sc.nextDouble();
           koefisien = bersepeda;
           System.out.println("masukkan kecepatan rata-rata");
           kecepatanRata2 = sc.nextDouble();
           System.out.println("masukkan ketinggian lokasi");
           ketinggian = sc.nextDouble();
           //rumus perhitungan kalori
           double kalori3 = bersepeda = (durasiSepeda * koefisien * bb) + (kecepatanRata2 * 0.5) + (ketinggian * 0.01);
           //output kalori
           System.out.println("kalori yang dibakar adalah " + kalori3);



        //kalori yg terbakar masing masing olahraga
        System.out.println("kalori yang terbakar saat berlari =" + kalori1);
        System.out.println("kalori yg terbakar saat berenang =" + kalori2);
        System.out.println("kalori yang terbakar saat bersepeda =" + kalori3);

        System.out.println("masukkan target");
        double target = sc.nextDouble();

        //total kalori yang terbakar
        totalKalori = kalori1 + kalori2 + kalori3;
        System.out.println("total kalori yang terbakar keseluruhan adalah " + totalKalori);

        double durasiTotal = durasiLari + durasiRenang + durasiSepeda;
        //rata-rata kalori permenit
        totalKaloriPermenit = totalKalori / durasiTotal;
        System.out.println("total kalori permenit " + totalKaloriPermenit);

        //presentase ketercapaian
        persen = (totalKalori /target)* 100;
        System.out.println("ketercapaian adalah " + persen + "persen");
    }
}
