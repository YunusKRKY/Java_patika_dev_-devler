package java101;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class a16Faktoriyel {

    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak
     adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
     */
    public static void main(String[] args) {
        int nFkt=1;
        int rFkt=1;
        int Fkt=1;

        Scanner scan = new Scanner(System.in);
        System.out.print(" n değerini giriniz : ");
        int n= scan.nextInt();
        System.out.print(" r değerini giriniz : ");
        int r= scan.nextInt();

        for (int i = 1; i <=n ; i++) {
            nFkt*=i;
        }
        for (int i = 1; i <=r ; i++) {
            rFkt*=i;
        }
        for (int i = 1; i <=(n-r) ; i++) {
            Fkt*=i;
        }

        int kom=nFkt/(rFkt*(n-r)*Fkt);
        System.out.println(nFkt);
        System.out.println(rFkt);
        System.out.println(Fkt);
        System.out.println("C(n,r) =  "+  kom);
    }

}
