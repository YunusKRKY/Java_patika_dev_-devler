package java101;

import java.util.Scanner;

public class a01daireninAlani {





    /*
    Proje Konusu
#Java ile yarı çap değerini kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazın.

Daire Alan Formülü : π * r * r
Daire Çevre Formülü : 2 * π * r

Bonus Geliştirme
Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
π Sayısını = 3,14 alın.
Formül : (π  * (r*r) *a) / 360)

     */




        public static void main(String[] args) {
            final double pi = 3.14;
            double daireA,daireC,daireDilimA;

            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen Dairenin yarıçapını giriniz : ");
            double r=scan.nextDouble();
            System.out.print("Lütfen Dairenin merkez açısını giriniz : ");
            double a=scan.nextDouble();

            daireA = pi*r*r;
            daireC = 2*pi*r;
            daireDilimA=( pi*(r*r)*a)/360;

            System.out.println("Dairenin alanı   : "+ daireA);
            System.out.println("Dairenin çevresi : "+ daireC);
            System.out.println("Daire Dilim alan : "+ daireDilimA);




        }

    }