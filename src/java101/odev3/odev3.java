package java101.odev3;

import java.util.Scanner;

public class odev3 {
    /*
    #Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.

     */

    public static void main(String[] args) {
        int kisaKenar,uzunKenar,hipotenusKaresi;
        double hipotenus,u,alan,alan2;
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen dik üçgenin ilk kısa kenarını giriniz: ");
        kisaKenar=scan.nextInt();
        System.out.print("Lütfen dik üçgenin ikinci kısa kenarını giriniz: ");
        uzunKenar=scan.nextInt();

        hipotenusKaresi=(kisaKenar*kisaKenar+uzunKenar*uzunKenar);
        hipotenus=Math.sqrt(hipotenusKaresi);

        System.out.println("Dik üçgenin hipotenüs uzunluğu: "+(int)hipotenus);

        u=(kisaKenar+uzunKenar+hipotenus)/2;
        alan =Math.sqrt( u*(u-hipotenus)*(u-kisaKenar)*(u-uzunKenar));
        System.out.println("üçgenin alanı: "+alan);
        // 2.yol taban*yükseklik/2
        alan2=(double) (kisaKenar*uzunKenar)/2;
        System.out.println("üçgenin alanı: 2. yol ile hesaplanan : "+alan2);

    }
}
