public class ContohTIpeData {
    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("golongan darah\t\t\t\t\t\t: + (byte) golonganDarah");
        System.out.println("jarak\t\t\t\t\t: " + jarak);
        System.out.println("jmlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun );
        System.out.println("suhu\t\t\t\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t\t\t\t: " + (float)berat);
        System.out.println("saldo\t\t\t\t\t\t: " + saldo);
        System.out.println("angka desimal\t\t\t\t: " + angkaDesimal);
        
    }
}
