package java101;

import java.util.Scanner;

public class a07HavayaGoreOner {

    public static void main(String[] args) {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sıcaklığı giriniz: ");
        int sicaklik= scan.nextInt();

        if (sicaklik<5) {
            System.out.println("kayağa git ");
        } else if (sicaklik <= 25) {

             if (sicaklik>10) {

                 System.out.println("pikniğe git");
             }
             if (sicaklik<15) {
                 System.out.println("sinemaya git ");
             }
        }
        else
            System.out.println("yüzmey e git ");
    }
}
