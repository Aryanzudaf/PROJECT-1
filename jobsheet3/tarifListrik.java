import java.util.Scanner;
public class tarifListrik {
    public static void main(String[] args) {
        
        double tarifListrik = 1500;
        double totalPenggunaan;

        Scanner input = new Scanner(System.in);
        totalPenggunaan = input.nextDouble();

        double totalTarif = tarifListrik * totalPenggunaan;

        System.out.println("total penggunaan lebih dari 500 kwh? " + (totalPenggunaan>500));
        System.out.println("tarif bulanan anda sebesar " + totalTarif);
       
        
    }
}
