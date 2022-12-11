package java101;

import java.util.Arrays;
import java.util.Scanner;

public class a08UcSayiyiSirala {

    /*
   Java ile kullanıcının girdiği 3 sayıyı büyükten küçüğe sıralayan programı yazınız.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sıralamak istediğiniz 3 sayıyı giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        sirala(a, b, c);
    }

    private static void sirala(int a, int b, int c) {
        int arr[] = {a, b, c};
        Arrays.sort(arr);
        System.out.println("sıralama = " + Arrays.toString(arr));

    }
}
