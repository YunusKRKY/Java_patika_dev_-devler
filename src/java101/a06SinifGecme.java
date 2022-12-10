package java101;

import java.util.Scanner;

public class a06SinifGecme {
static int counter=0;
static int mat,fiz,tur,kim,muz;
static double ortalama=0;

    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik dersinin notunu giriniz : ");
        mat=scan.nextInt();
        counter++;
        if(mat>100 ||mat<0){
            mat= 0;
            counter--;
        }

        System.out.print("Fizik dersinin notunu giriniz : ");
        fiz=scan.nextInt();
        counter++;
        if(fiz>100 || fiz<0){
            fiz= 0;
            counter--;
        }

        System.out.print("Turkce dersinin notunu giriniz : ");
        tur=scan.nextInt();
        counter++;
        if(tur>100 || tur<0){
            tur= 0;
            counter--;
        }

        System.out.print("Kimya dersinin notunu giriniz : ");
        kim=scan.nextInt();
        counter++;
        if(kim>100 || kim<0){
            kim= 0;
            counter--;
        }

        System.out.print("Muzik dersinin notunu giriniz : ");
        muz=scan.nextInt();
        counter++;
        if(muz>100 || muz<0){
            muz= 0;
            counter--;
        }

        ortalama =(double)(mat+fiz+tur+kim+muz)/counter;
        System.out.println("ortalama = " + ortalama);
        gecme(ortalama);


    }

    public static void gecme(double ortalama){
        if (ortalama>54){
            System.out.println("Sınıfı başarı ile geçtiniz. ");
        }else
            System.out.println("Maalesef sınıfı geçemediniz. ");
    }
}
