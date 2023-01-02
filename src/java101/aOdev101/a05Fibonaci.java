package java101.aOdev101;

import java.util.Scanner;

public class a05Fibonaci {

    /*
    Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden
bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya
bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın
sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 0 + 1 = 1
 1 + 1 = 2
 1 + 2 = 3
 2 + 3 = 5
 3 + 5 = 8
 5 + 8 = 13
 13 + 8 = 21
 21 + 8 = 34*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisi kaç elemanlı olsun?");
        int elemanSayisi = input.nextInt();

        // Fibonacci serisi 0 ve 1'den oluştuğu için,
        // ilk iki elemanın değerleri sırasıyla 0 ve 1'dir.
        int fib1 = 0, fib2 = 1;

        // Kullanıcıdan alınan eleman sayısı kadar döngü çalıştırılır.
        for (int i = 0; i <= elemanSayisi; i++) {
            System.out.print(fib1 + " ");

            // fib1 değişkeni, fib2 değişkeninin değeriyle toplanır.
            // fib2 değişkeni ise, fib1 değişkeninin eski değeriyle toplanır.
            int fibToplami = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibToplami;
        }

    }




}