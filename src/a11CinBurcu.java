import java.util.Scanner;

public class a11CinBurcu {

    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla
 pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

Senaryo
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen doğduğunuz yılı giriniz: ");
        int dogumTarihi=scan.nextInt();
        int kalan = dogumTarihi%12;

        switch (kalan) {
            case 0 -> System.out.println("çin burcunuz maymun");
            case 1 -> System.out.println("çin burcunuz horoz");
            case 2 -> System.out.println("çin burcunuz köpek");
            case 3 -> System.out.println("çin burcunuz domuz");
            case 4 -> System.out.println("çin burcunuz fare");
            case 5 -> System.out.println("çin burcunuz öküz");
            case 6 -> System.out.println("çin burcunuz kaplan");
            case 7 -> System.out.println("çin burcunuz tavşan");
            case 8 -> System.out.println("çin burcunuz ejderha");
            case 9 -> System.out.println("çin burcunuz yılan");
            case 10 -> System.out.println("çin burcunuz at");
            case 11 -> System.out.println("çin burcunuz koyun");

        }
    }
}
