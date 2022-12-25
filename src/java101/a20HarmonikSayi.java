package java101;

import java.util.Scanner;

public class a20HarmonikSayi {

    public static void main(String[] args) {
        // harmonik diziyi hesaplayan kodu yazınız.

        Scanner scanner= new Scanner(System.in);
        System.out.print("lütfen sayıyı giriniz : ");
        int sayi=scanner.nextInt();
        double sum=0;

        for (double i = 1; i <= sayi; i++) {
            sum +=1/i;
        }
        System.out.printf("%.2f", sum);
    }
}
