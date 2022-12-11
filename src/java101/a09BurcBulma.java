package java101;

import java.util.Scanner;

public class a09BurcBulma {
    static int ay,gun;

    public static void main(String[] args) {
        /*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart


Ödev
Aynı örneği switch-case kullanmadan yapınız.
         */

            burc();


    }

        public static void burc(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen doğduğunuz ayı giriniz : ");
            ay=scan.nextInt();
            System.out.print("Lütfen doğduğnuuz günü giriniz : ");
            gun=scan.nextInt();
//Oğlak Burcu : 22 Aralık - 21 Ocak    Kova Burcu : 22 Ocak - 19 Şubat
            if (ay==1){
                if (gun<=21)
                    System.out.println("Oğlak");
                else if (gun<32)
                    System.out.println("Kova");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }
            // Kova Burcu : 22 Ocak - 19 Şubat     Balık Burcu : 20 Şubat - 20 Mart
            if (ay==2){
                if (gun<=19)
                    System.out.println("Kova");
                else if (gun<30)
                    System.out.println("Balık");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

          //  Balık Burcu : 20 Şubat - 20 Mart  Koç Burcu : 21 Mart - 20 Nisan
            if (ay==3){
                if (gun<21)
                    System.out.println("Balık");
                else if (gun<32)
                    System.out.println("Koç ");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

          // Koç Burcu : 21 Mart - 20 Nisan  -- Boğa Burcu : 21 Nisan - 21 Mayıs
            if (ay==4){
                if (gun<21)
                    System.out.println("Koç ");
                else if (gun<31)
                    System.out.println("Boğa ");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

            //Boğa Burcu : 21 Nisan - 21 Mayıs --  İkizler Burcu : 22 Mayıs - 22 Haziran

            if (ay==5){
                if (gun<22)
                    System.out.println("Boğa ");
                else if (gun<32)
                    System.out.println("ikizler ");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

            //İkizler Burcu : 22 Mayıs - 22 Haziran -- Yengeç Burcu : 23 Haziran - 22 Temmuz

            if (ay==6){
                if (gun<23)
                    System.out.println("ikizler ");
                else if (gun<31)
                    System.out.println("yengeç ");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

            //Yengeç Burcu : 23 Haziran - 22 Temmuz -- Aslan Burcu : 23 Temmuz - 22 Ağustos

            if (ay==7){
                if (gun<23)
                    System.out.println("yengeç ");
                else if (gun<32)
                    System.out.println("aslan ");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

            //Aslan Burcu : 23 Temmuz - 22 Ağustos -- Başak Burcu : 23 Ağustos - 22 Eylül

            if (ay==8){
                if (gun<23)
                    System.out.println("aslan ");
                else if (gun<31)
                    System.out.println("başak");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }
            //Başak Burcu : 23 Ağustos - 22 Eylül -- Terazi Burcu : 23 Eylül - 22 Ekim

            if (ay==9){
                if (gun<23)
                    System.out.println("başak ");
                else if (gun<32)
                    System.out.println("terazi");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

            //Terazi Burcu : 23 Eylül - 22 Ekim --  Akrep Burcu : 23 Ekim - 21 Kasım

            if (ay==10){
                if (gun<23)
                    System.out.println("terazi ");
                else if (gun<31)
                    System.out.println("akrep");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }

            //Akrep Burcu : 23 Ekim - 21 Kasım  -- Yay Burcu : 22 Kasım - 21 Aralık

            if (ay==11){
                if (gun<22)
                    System.out.println("akrep ");
                else if (gun<32)
                    System.out.println("yay");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }


            // Yay Burcu : 22 Kasım - 21 Aralık -- Oğlak Burcu : 22 Aralık - 21 Ocak

            if (ay==12){
                if (gun<22)
                    System.out.println("yay");
                else if (gun<32)
                    System.out.println("oğlak");
                else {
                    System.out.println("lütfen doğru bir tarih giriniz");
                    sleep(2000);
                    burc();
                }
            }
        }


        public static void sleep(long milliseconds) {

            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("...");
        }

}
