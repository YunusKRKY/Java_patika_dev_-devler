package java101.aOdev101;

import java.util.Scanner;

public class a01MinMax {
    /*
    Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan
     programı yazın.

        Senaryo
        Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç adet sayı gireceğinizi bildirin");
        int n = scanner.nextInt();
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+".sayıyı giriniz");
            int a= scanner.nextInt();
            if (a>min){
                min=a;
            }
            if (a<max){
                max =a;
            }


        }
        System.out.println("en büyük sayı : "+min);
        System.out.println("en küçük sayı : "+max);

    }
}
