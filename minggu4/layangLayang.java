public class layangLayang {
    public static void main(String[] args) {
        double d1 = 5,d2 = 10;
        double panjangBenang,luasKertas;
        double d11 = d1/2f, d3 = d2-d11 ;

        panjangBenang = Math.sqrt((d11 * d11) + (d3 * d3));
        System.out.println(panjangBenang);

        luasKertas = 0.5 * d1 * d2;
        System.out.println(luasKertas);
        
    }
}
