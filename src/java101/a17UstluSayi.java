package java101;

import java.util.Scanner;

public class a17UstluSayi {
    /*
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
     */

    public static void main(String[] args) {

        int sonuc=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("taban:  ");
        int t=scan.nextInt();
        System.out.print("üst:   ");
        int u=scan.nextInt();

        for (int i = 1; i <= u; i++) {
            sonuc*=t;
        }
        System.out.println(sonuc);
    }
}
