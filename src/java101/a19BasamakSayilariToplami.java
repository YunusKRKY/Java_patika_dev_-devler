package java101;

import java.util.Scanner;

public class a19BasamakSayilariToplami {
    /*
    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

    Örnek : 1643 = 1 + 6 + 4 + 3 = 14
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi gir: ");
        int sayi= scan.nextInt();
        int sum=0;


        while (sayi!=0){
           sum+=sayi%10;
           sayi=sayi/10;

        }
        System.out.println(sum);


        }
    }

