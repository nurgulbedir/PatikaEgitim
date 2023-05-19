import java.util.Scanner;
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
public class Ciftve4KatiOlanSayilarToplam {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int say = 0, toplam = 0, sayi;
        do {
            System.out.print("Sayı giriniz: ");
            sayi = k.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
                say++;
            }
        }
        while (sayi%2==0);
            System.out.println("Toplam: " + toplam);

    }
}




