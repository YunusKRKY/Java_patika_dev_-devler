package java101;

import java.util.Scanner;

public class a13UcVeDortBolunen {

    public static void main(String[] args) {

        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
        hesaplayan programı yazınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi=scan.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for (int i = 0; i < sayi; i++) {
            if (i%3==0&&i%4==0){
                System.out.print(i+" ");
            }
        }
    }
}
