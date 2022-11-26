package odev2;

import java.util.Scanner;

public class odev2 {
     /*
    #Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
     */


    public static void main(String[] args) {
        double kdvMiktari=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün tutarını giriniz");
        int urunMiktari=scan.nextInt();
        if (urunMiktari>0 && urunMiktari<=500){
            kdvMiktari=18;
        }else {
            kdvMiktari=8;
        }
        double kdv = (urunMiktari*kdvMiktari)/100;
        double kdvDahilUrunMiktari= urunMiktari+kdv;
        System.out.println("kdv tutarı : "+kdv+
                "0€\nKDV li tutar: "+kdvDahilUrunMiktari+"0€ \nkdv oranı: %"+(int)kdvMiktari);
    }
}
