import java.util.Scanner;
public class Siakad08 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String nama,nim,kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;


    System.out.println("masukkan nama: ");
    nama = sc.nextLine();
    System.out.println("masukkan NIM: ");
    nim = sc.nextLine();//hasil nextline berupa string
    System.out.println("masukkan kelas: ");
    kelas = sc.nextLine(); 
    System.out.println("masukkan nomor absen: ");
    absen = sc.nextByte();
    System.out.println("maukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.println("masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.println("masukkan nilai uts: ");
    nilaiUts = sc.nextDouble();
    System.out.println("masukkan nilai uas");
    nilaiUas = sc.nextDouble();
    
    nilaiAkhir = (nilaiKuis * 0.2 + nilaiTugas * 0.15 + nilaiUts * 0.3 + nilaiUas * 0.35) ;
    

    System.out.println("nama mahasiswa: " + nama + " NIM: " + nim);
    System.out.println("kelas: " + kelas +  " absen: " + absen);
    System.out.println("nilai akhir: " + nilaiAkhir);
    }
}