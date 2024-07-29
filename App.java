package Projects;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*
         * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
         * 
         * Geçme Notu : 55
         * 
         * Ödev
         * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya
         * katılmasın.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik dersinin notunu giriniz:");
        int mat = sc.nextInt();
        System.out.println("fizik dersinin notunu giriniz:");
        int fizik = sc.nextInt();
        System.out.println("Türkçe dersinin notunu giriniz:");
        int turkce = sc.nextInt();
        System.out.println("Kimya dersinin notunu giriniz:");
        int kimya = sc.nextInt();
        System.out.println("Muzuk dersinin notunu giriniz:");
        int muzuk = sc.nextInt();
        int[] notlar = { mat, fizik, turkce, kimya, muzuk };

        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] < 0 || notlar[i] > 100) {

                continue;
            }
            toplam = toplam + notlar[i];

        }

        System.out.println("ders ortalaması: " + toplam / 5);
        if ((toplam / 5) < 55) {
            System.out.println("kaldınız");
        } else {
            System.out.println("geçtiniz.");
        }

        sc.close();
    }
}
