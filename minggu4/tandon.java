import java.util.Scanner;
public class tandon {
    public static void main(String[] args) {
        double r ,t ,kec ;
        double vol;
        int waktu;

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jari-jari");
        r = sc.nextInt();
        System.out.println("masukkan tinggi");
        t = sc.nextInt();
        System.out.println("masukkan kecepatan pengisian");
        kec = sc.nextInt();
        vol = Math.PI * Math.pow(r, 2);
        waktu =  (int)(vol / kec);
        

        System.out.println(waktu);
    }
}
