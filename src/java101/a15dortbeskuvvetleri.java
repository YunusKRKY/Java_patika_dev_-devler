package java101;

import java.util.Scanner;

public class a15dortbeskuvvetleri {
    public static void main(String[] args) {

        /*
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print(" lütfen sınır sayısını giriniz : ");
        sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i*=20) {
            System.out.println(i);
        }
    }
}
