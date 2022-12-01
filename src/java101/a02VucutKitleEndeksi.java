package java101;

import java.util.Scanner;

public class a02VucutKitleEndeksi {



        /*
        #Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Örnek Çıktı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173 (kilo/boy²)


    Bonus Geliştirme
    Eğer Vücut Kitle İndeksi .
    18.5'ten küçükse ekrana "Zayıf"
    18.5 ile 24.9 arasında ise ekrana "İdeal"
    25 ile 29.9 arasında ise ekrana "Şişman"
    30 ile 34.9 arasında ise ekrana "Obez"
    35'ten büyükse ise ekrana "Aşırı Obez" yazsın.
         */
        public static void main(String[] args) {

            double boy,kilo,vKE ;
            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
            boy=scan.nextDouble();
            System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
            kilo=scan.nextDouble();
            vKE=kilo/(boy*boy);
            System.out.println("vücut kitle indeksiniz : "+ vKE);
            if (vKE<18.5){
                System.out.println("zayıf");
            }else if (vKE>=18.5 && vKE<=24.9) {
                System.out.println("ideal");
            }else if (vKE>=25.0 && vKE<=29.9) {
                System.out.println("şişman");
            }else if (vKE>=30.0 && vKE<=34.9) {
                System.out.println("obez");
            }else if (vKE>=35.0) {
                System.out.println("aşırı obez");
            }

        }
}
