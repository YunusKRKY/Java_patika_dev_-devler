package java101;

import java.util.Scanner;

public class a05SifreKontrol {

    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
  yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
  ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */

    static int counter=3;
    static String sifre =
            "yunus23";

    static String ilkHataliGiris="";



    public static void main(String[] args) {
        Kontrol();

    }

    public static void Kontrol(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        String giris= scan.nextLine();
        ilkHataliGiris=giris;


        if (sifre.equals(giris))
             System.out.println("şifreniz doğru ");
         else {
             counter--;
             KalanHak();



           }


    }

    public static void yeniSifre(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yeni şifrenizi giriniz: ");
        String yeniGiris= scan.nextLine();

        if (!(yeniGiris.equals(ilkHataliGiris))&&(!(yeniGiris.equals(sifre)))){
            sifre=yeniGiris;
            System.out.println("Şifreniz başarı ile güncellendi yeni şifreniz : "+ yeniGiris);

        }
        else {
            System.out.println("girdiğiniz şifre önceki şifreniz veya hatalı girdiğiniz şifre ile aynı olmamalıdır. ");

            KalanHakyeniSifre();
        }
    }


    public static void KalanHak(){

       if (counter>0) {
           System.out.println("şifre geçersiz \n" + "kalan hakkınz: " + counter +
                   "\nşifreyi sıfırlayıp yeniden oluşturmak istiyorsanız 1 e basınız\n" +
                   "şifreyi tekrar girmek istiyorsanız 2 e basınız");

           secim();
       }
       else
           System.out.println("şifreyi 3 kere yanlış girdiğiniz için işlem başarısız oldu. ");
    }

    public static void KalanHakyeniSifre(){

        if (counter>0) {
            System.out.println("Kalan hakkınız: " +counter);
            counter--;
            yeniSifre();

        }
        else
            System.out.println("şifreyi 3 kere yanlış girdiğiniz için işlem başarısız oldu. ");
    }

    public static void secim(){
        Scanner sayiGirilen = new Scanner(System.in);
        int sayi =sayiGirilen.nextInt();
        if (sayi ==1){
            yeniSifre();
        } else if (sayi==2) {
            Kontrol();
        }else {
            System.out.println("""
                    Lütfen doğru seçimi yapın
                    yeni şifre için 1 e basınız\s
                    şifrenizi tekrar girmek için 2 e basınız""");
            secim();
        }
    }

}
