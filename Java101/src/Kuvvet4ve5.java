import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
// kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class Kuvvet4ve5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi;
        System.out.print("Sayı giriniz: ");
        sayi = k.nextInt();

        for (int i = 4; i <= sayi; i *= 4) {
            System.out.println("Girdiğiniz sayıya kadar 4'ün kuvvetleri: " + i);
        }
        System.out.println("       :) :) :) :) :) :) :) :) :)");
        for (int i = 5; i <= sayi; i *= 5) {
            System.out.println("Girdiğiniz sayıya kadar 5'in kuvvetleri: " + i);
        }
    }
}