package java101.aOdev101;

import java.util.Scanner;

public class a04AsalSayilar {

    /*
    Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

        Senaryo
        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
     */

    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asal = true;
            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(sayi + ", ");
            }
        }
    }
}
