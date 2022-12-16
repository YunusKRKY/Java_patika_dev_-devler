package java101;

import java.util.Scanner;

public class a14forloop {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek
        sayıları toplayıp ekrana basan programı yazıyoruz.

Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün
katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        // 1.BÖLÜM

//        Scanner scan = new Scanner(System.in);
//
//        int sayi;
//        int sum=0;
//       do {
//           System.out.print(" Lütfen bir sayı giriniz : ");
//           sayi= scan.nextInt();
//           if (sayi%2 !=0){
//           sum+=sayi;
//           }
//       } while (sayi>0);
//        System.out.println(sum);
//------------------------------------------------------------

        // 2.BÖLÜM

        int sayi;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        do {

            System.out.print("sayı giriniz: ");
            sayi=scan.nextInt();
            if (sayi%4==0){
                sum+=sayi;
            }
        }while (sayi%2==0);

        System.out.println("Toplam: "+sum);


   }

}
