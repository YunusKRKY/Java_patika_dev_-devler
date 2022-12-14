package java101;

import java.util.Scanner;

public class a10UcakBileti {

    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
    yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
    uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

     */


    public static void main(String[] args) {



        Scanner scann = new Scanner(System.in);
        System.out.print("Lütfen uçuş yapılacak uzaklığı km cinsinden giriniz: ");
        int mesafe = scann.nextInt();
        System.out.print("lütfen yaşınızı giriniz: ");
        int yas = scann.nextInt();
        System.out.println("lütfen yolculuk tipini seçiniz; \n gidiş için 1 sayısını giriniz \n gidiş-dönüş için 2 sayısını giriniz: ");
        int yolTipi=scann.nextInt();
        double indirim=0;
        double fiyat=mesafe*0.10;

        if (yolTipi==1){

            if(yas<0){
                System.out.println("geçersiz bir yaş girdiniz. ");
            }
            else if (yas<=12){
                 indirim = fiyat*0.5 ;
                System.out.println(fiyat - indirim);
            }else if (yas<=24){
                 indirim = fiyat *0.1 ;
                System.out.println(fiyat - indirim);
            } else if (yas>65) {
                 indirim = fiyat *0.3 ;
                System.out.println(fiyat - indirim);
            }else{
                 indirim = 0;
                System.out.println(fiyat - indirim);
            }
        } else if (yolTipi==2) {

            if(yas<0){
                System.out.println("geçersiz bir yaş girdiniz. ");
            }
            else if (yas<=12){
                indirim =(fiyat*0.5*2)+(fiyat*0.2*2) ;
                System.out.println(fiyat*2 - indirim);
            }else if (yas<=24){
                indirim =(fiyat*0.1*2)+(fiyat*0.2*2);
                System.out.println(fiyat*2 - indirim);
            } else if (yas>65) {
                indirim =(fiyat*0.3*2)+(fiyat*0.2*2) ;
                System.out.println(fiyat*2 - indirim);
            }else{
                indirim =(fiyat*0.2*2);
                System.out.println(fiyat*2 - indirim);
            }

        }else
            System.out.println("Hatalı değer girdiniz.  ");

    }




}
