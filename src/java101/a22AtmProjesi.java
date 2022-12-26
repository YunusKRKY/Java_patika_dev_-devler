package java101;

import java.util.Scanner;

public class a22AtmProjesi {
    /*
     ATM projesi
     1- isim ve parola kontrol et
     2- para yatırma
     3- para çekme
     4- bakiye öğrenme

     */
   final static String isim="yunus";
   final static String parola="123y";
   static int kalanHak=3;
   static int bakiye=0;


    public static void main(String[] args) {

        isimKontrol();

    }
    // isim kontrol
    public static void isimKontrol(){
        if (kalanHak!=0){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz: ");
        String isim2 = scanner.next();

        if (isim2.equals(isim)){

            dogruIsim();
        }else{
            yanlisIsim();
        }
    }
        else{
            System.out.println("3 defa hatalı giriş yaptığınız için kartınız bloke olmuştur.\n lütfen banka ile görüşünüz. ");
        }
    }
    // doğru isim girildiğinde porolaKontrol a yönlendir.
    public static void dogruIsim(){
        System.out.println("\t\t*** Giriş başarılı ***" );
        parolaKontrol();
    }

    public static void yanlisIsim(){
        kalanHak--;
        System.out.println("\t\t** Giriş başarısız ***\n" +
                "\tlütfen  yeniden giriniz. \n" +
                "\tKalan hakkınız : "+kalanHak);
        isimKontrol();
    }




    // parola kontrol
    public static void parolaKontrol(){
        if (kalanHak!=0){



        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen parolayı giriniz: ");
        String parola2 = scanner.next();

        if (parola2.equals(parola)){
            dogruParola();
        }else{
            yanlisParola();
        }

    }else {
            System.out.println("\t*** Giriş başarısız ***\n" +
                    "\t3 defa hatalı giriş yaptığınız için kartınız bloke olmuştur. \nlütfen banka ile görüşünüz. ");
        }
    }



    public static void yanlisParola(){
        kalanHak--;
        System.out.println("\t\t** Giriş başarısız ***\n" +
                "\tlütfen  yeniden giriniz. \n" +
                "\tKalan hakkınız : "+kalanHak);
        parolaKontrol();
    }



    public static void dogruParola(){
        System.out.println("\t\t*** Giriş başarılı ***\n" +
                "\tlütfen hangi işlemi yapmak istediğinizi giriniz\n" +
                "\thesap bakiyesini öğrenmek için : 1 \n" +
                "\thesaptan para çekmek için      : 2 \n" +
                "\thesaba para yatırmak için      : 3 \n" +
                "\tçıkış için                     : 4 \n " );
        Scanner scanner = new Scanner(System.in);
        int giris= scanner.nextInt();

        switch (giris) {
            case 1 -> hesapBakiyesi();
            case 2 -> paraCekme();
            case 3 -> paraYatirma();
            case 4 -> System.out.println(" işlem sona erdi\nlütfen kartınızı alınız ");
            default -> {
                System.out.println("yanlış bir değer girdiniz . lütfen tekrar deneyizinz ");
                dogruParola();
            }
        }

    }


    public static void hesapBakiyesi(){
        Scanner scan= new Scanner(System.in);
        System.out.println("hesap bakiyeniz : "+bakiye+" TL\n" +
                "Lütfen yapmak istediğiniz işlemi giriniz:  \n" +
                "Ana Menüye dönmek için   : 1 \n" +
                "Çıkış yapmak için lütfen : 2 ");
        int giris = scan.nextInt();
        switch (giris){
            case 1 -> dogruParola();
            case 2 -> System.out.println("Çıkış yaptınız.\nlütfen kartınızı alınız. ");
            default -> {
                System.out.println("yanlış bir değer girdiniz . lütfen tekrar deneyiniz ");
                hesapBakiyesi();
            }
        }

    }

    public static void paraCekme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hesap bakiyeniz : "+bakiye+" TL\n" +
                "Lütfen çekmek istediğiniz miktarı giriniz:  ");
        int miktar = scanner.nextInt();

        if (miktar<=bakiye){
            bakiye-=miktar;
            System.out.println("hesabınızdan "+miktar+" TL çektiniz \n " +
                    "hesabınızda kalan miktar : "+bakiye +" TL \n " +
                    "ana menüye dönmek için : 1 \n " +
                    "çıkış yapmak için      : 2 \n " +
                    "değerini giriniz  ");
            int giris = scanner.nextInt();
            switch (giris){
                case 1 -> dogruParola();
                case 2 -> System.out.println("Çıkış yaptınız.\nlütfen kartınızı alınız. ");
                default -> {
                    System.out.println("yanlış bir değer girdiniz . sizi ana menüye yönlendiriyorum ");
                    dogruParola();
                }

            }
        }else{
            Scanner scan= new Scanner(System.in);
            System.out.println("maalesef hesabınızda çekmek istediğiniz kadar miktar bulunmamaktadır.\n" +
                    "bakiyeniz : "+bakiye+" TL \n" +
                    "lüfen " +
                    "para çekme işlemi için : 1 \n" +
                    "ana menüye dönmek için : 2 \n " +
                    "çıkış yapmak için      : 3 \n giriniz. ");
            int giris=scan.nextInt();
            switch (giris){
                case 1 -> paraCekme();
                case 2 -> dogruParola();
                case 3 -> System.out.println("Çıkış yaptınız.\nlütfen kartınızı alınız.");
                default -> {
                    System.out.println("yanlış bir değer girdiniz . sizi ana menüye yönlendiriyorum ");
                    dogruParola();
                }
            }
        }

    }

    public static void paraYatirma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hesap bakiyeniz : "+bakiye+" TL\n" +
                "Lütfen yatırmak istediğiniz miktarı giriniz. ");
        int miktar = scanner.nextInt();

            bakiye+=miktar;
            System.out.println("hesabınıza "+miktar+" TL yatırdınız \n " +
                    "hesabınızda bulunan miktar : "+bakiye +" TL \n " +
                    "ana menüye dönmek için : 1 \n " +
                    "çıkış yapmak için      : 2 \n " +
                    "değerini giriniz  ");
            int giris = scanner.nextInt();
            switch (giris){
                case 1 -> dogruParola();
                case 2 -> System.out.println("Çıkış yaptınız.\nlütfen kartınızı alınız. ");
                default -> {
                    System.out.println("yanlış bir değer girdiniz .\n sizi ana menüye yönlendiriyorum ");
                    dogruParola();
                }

            }


    }

}
