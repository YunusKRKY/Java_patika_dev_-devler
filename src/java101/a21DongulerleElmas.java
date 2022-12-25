package java101;

import java.util.Scanner;

public class a21DongulerleElmas {

    /*
    Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *    9 satır    9-5 4 boşluk 9-4*2 1 yildız
   ***              9-6 3        9-3*2 3
  *****             9-7 2        9-2*2 5
 *******            9-8 1        9-1*2 7
*********           9-9 0        9-0*2 9
 *******            9-8 1        9-1*2 7
  *****             9-7 2        9-2*2 5
   ***              9-6 3        9-3*2 3
    *               9-5 4        9-4*2 1
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
