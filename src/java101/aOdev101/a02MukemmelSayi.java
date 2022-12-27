package java101.aOdev101;

import java.util.Scanner;

public class a02MukemmelSayi {

    /*
  Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
   değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?

Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya
 mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28  14+7+4+2+1
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır

     */

    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" sayı giriniz: ");
        int n= scanner.nextInt();
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                sum+=i;
            }

        }
        if (sum==n){
            System.out.println(n+ " sayısı mükemmel sayıdır");
        }else
            System.out.println(n+ " sayısı mükemmel sayı değildir. ");
    }
}
