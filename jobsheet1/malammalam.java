import java.util.Scanner;
public class malammalam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 10;
        int y = 20;
        // if (x<y) {
        //     System.out.println("bener");
        // } else if (x>y) {
        //     System.out.println("salah");
        // } else {
        //     System.out.println("yang lain");
        // }
        //     int z = 2;
        // switch (z) {
        //     case 1:
        //         System.out.println("satu");
        //         break;
        //     case 2:
        //         System.out.println("dua");  
        //         break;
        //     default:
        //         System.out.println("wowww");
        //         break;     
        //}

        // String hasil = (x<y) ? "true":"false";
        // System.out.println(hasil);

        // int a = 10;
        // int b = 20;
        // int c = 30;

        // if (a<b) {
        //     if (b<c) {
        //         System.out.println("benar if 2");
        //     } else {
        //         System.out.println("benar if 1");
        //     }
        // } else {
        //     System.out.println("salahhhh");
        // }

        int n;
        n = input.nextInt();
       
        
        if (n%2==1) {
            System.out.println("weird");
        } else if (n>2 && n<5) {
            System.out.println("not weird");
        } else if (n>6 && n<20) {
            System.out.println("weird");
        } else if (n>20) {
            System.out.println("not weird");
        } else {
            System.out.println("not weird");
        }









    } 
}
