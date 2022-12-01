package java101;

import java.util.Scanner;

public class a03Manav {

        /*
        #Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana
        yazdıran programı yazın.

    Ürün Kg Fiyatları

    Salatalık : 3,14 TL
    Elma : 4,11 TL
    Kabak : 2,22 TL
    Domates: 0,95 TL
    Patlıcan : 7,00 TL
         */
        static double toplamOdenecekMiktar=0;
        public static void main(String[] args) {

            urunIsmi();



        }



        private static double urunIsmi() {

            double salatalik=3.14,elma=4.11,kabak=2.22,domates=0.95,patlican=7.00,urunKilosu,toplam;
            int urunkodu,secim;



            Scanner scan =new Scanner(System.in);
            System.out.println("**** KODLAMA VAKTİ MANAVINA HOŞGELDİNİZ ****" +
                    "\n\nLütfen almak istediğiniz ürünün kodunu giriniz:\n"+
                    " \n salatlık için :  1 " +
                    " \n elma için :      2 " +
                    " \n kabak için :     3 " +
                    " \n domates için :   4 " +
                    " \n patlıcan için :  5 " +
                    " \n değerini giriniz");

            urunkodu=scan.nextInt();
            System.out.print("Lütfen kaç kilo almak istediğnizi giriniz: ");
            urunKilosu=scan.nextDouble();

            if (urunkodu==1){
                double salatalikTutari=salatalik*urunKilosu;
                System.out.println(urunKilosu+" kg salatalık fiyatı= "+salatalikTutari);
                toplamOdenecekMiktar+= salatalikTutari;
                System.out.println("alışverişi bitirmek için \"0\" 'a basınız " +
                        "\ndevam etmek için         \"1\" 'e basınız ");
                secim=scan.nextInt();
                if (secim==1){
                    urunIsmi();
                    toplamOdenecekMiktar+=toplamOdenecekMiktar;
                }if (secim==0){
                    System.out.println("           Alışverişinizi bitirdiniz\n " +
                            "    bizi tercih ettiğiniz için teşekkür ederiz \n" +
                            "              iyi günler dileriz \n " +
                            "ödenecek miktar = "+toplamOdenecekMiktar+"0€");
                }
            }



            if (urunkodu==2){
                double elmaTutari=elma*urunKilosu;
                System.out.println(urunKilosu+"kg elma fiyatı= "+elmaTutari);
                toplamOdenecekMiktar+= elmaTutari;
                System.out.println("alışverişi bitirmek için \"0\" 'a basınız " +
                        "\ndevam etmek için         \"1\" 'e basınız ");
                secim=scan.nextInt();
                if (secim==1){
                    urunIsmi();
                }if (secim==0){
                    System.out.println("           Alışverişinizi bitirdiniz\n " +
                            "    bizi tercih ettiğiniz için teşekkür ederiz \n" +
                            "              iyi günler dileriz \n " +
                            "ödenecek miktar = "+toplamOdenecekMiktar+"€");
                }
            }


            if (urunkodu==3){
                double kabakTutari=salatalik*urunKilosu;
                System.out.println(urunKilosu+"kg kabak fiyatı= "+kabakTutari);
                toplamOdenecekMiktar+= kabakTutari;
                System.out.println("alışverişi bitirmek için \"0\" 'a basınız " +
                        "\ndevam etmek için         \"1\" 'e basınız ");
                secim=scan.nextInt();
                if (secim==1){
                    urunIsmi();
                }if (secim==0){
                    System.out.println("           Alışverişinizi bitirdiniz\n " +
                            "    bizi tercih ettiğiniz için teşekkür ederiz \n" +
                            "              iyi günler dileriz \n " +
                            "ödenecek miktar = "+toplamOdenecekMiktar+"€");
                }
            }



            if (urunkodu==4){
                double domatesTutari=salatalik*urunKilosu;
                System.out.println(urunKilosu+"kg domates fiyatı= "+domatesTutari);
                toplamOdenecekMiktar+= domatesTutari;
                System.out.println("alışverişi bitirmek için \"0\" 'a basınız " +
                        "\ndevam etmek için         \"1\" 'e basınız ");
                secim=scan.nextInt();
                if (secim==1){
                    urunIsmi();
                }if (secim==0){
                    System.out.println("           Alışverişinizi bitirdiniz\n " +
                            "    bizi tercih ettiğiniz için teşekkür ederiz \n" +
                            "              iyi günler dileriz \n " +
                            "ödenecek miktar = "+toplamOdenecekMiktar+"€");
                }
            }



            if (urunkodu==5){
                double patlicanTutari=salatalik*urunKilosu;
                System.out.println(urunKilosu+"kg patlıcan fiyatı= "+patlicanTutari);
                toplamOdenecekMiktar+= patlicanTutari;
                System.out.println("alışverişi bitirmek için \"0\" 'a basınız " +
                        "\ndevam etmek için         \"1\" 'e basınız ");
                secim=scan.nextInt();
                if (secim==1){
                    urunIsmi();
                }if (secim==0){
                    System.out.println("           Alışverişinizi bitirdiniz\n " +
                            "    bizi tercih ettiğiniz için teşekkür ederiz \n" +
                            "              iyi günler dileriz \n " +
                            "ödenecek miktar = "+toplamOdenecekMiktar+"€");
                }
            }

            return toplamOdenecekMiktar;


        }
}
