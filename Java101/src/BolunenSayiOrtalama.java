import java.util.Scanner;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
// tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class BolunenSayiOrtalama {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int say = 0, toplam = 0;
        System.out.print("Sayı Giriniz: ");
        int sayi = k.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ( i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                say++;
            }
        }
            if (say == 0) {
                System.out.println("3'e 4'e bölünen sayı yok!");
            }
            else {
                double ort = (double) toplam / say;
                System.out.println("Ortalaması: " + ort);
            }
    }
}
