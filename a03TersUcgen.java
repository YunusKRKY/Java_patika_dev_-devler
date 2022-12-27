package java101.aOdev101;

import java.util.Scanner;

public class a03TersUcgen {
    /*
    Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen
     programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */

    public static void main(String[] args) {
        int n ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        n = inp.nextInt();

        for (int i = n ; i >= 1 ; i--){
            for(int x = 1 ; x <= (n-i) ; x++){
                System.out.print(" ");
            }
            for(int y = 1 ; y <= (2*i)-1 ; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
