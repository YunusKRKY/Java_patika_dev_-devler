package odev1;

public class odev1 {

    /*
    #Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve bu
     derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.




 */
    public static void main(String[] args) {
        double fizikNotu= 70;
        double matNotu=   40;
        double turkceNotu=30;
        double kimyaNotu=100;
        double muzikNotu= 60;
        double tarihNotu= 80;

        double notOrtalamasi= (fizikNotu+ matNotu+ turkceNotu+ kimyaNotu+ muzikNotu+tarihNotu)/6;

        System.out.println("öğrencinin not ortalaması = "+notOrtalamasi);

        String sonuc= notOrtalamasi>60 ? "öğrenci sınıfı geçti":"öğrenci sınıfı geçemedi";

        System.out.println(sonuc);

    }


}
