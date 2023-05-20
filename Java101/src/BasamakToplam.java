import java.util.Scanner;
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız. Örnek : 1643 = 1 + 6 + 4 + 3 = 14
public class BasamakToplam {
    public static void main(String[] args) {
       
        Scanner k=new Scanner(System.in);
        int toplam=0 ;
        System.out.print("Sayı giriniz: ");
        int sayi=k.nextInt();
        int yeniSayi=sayi;

        while (yeniSayi != 0) {
            int basamak = yeniSayi % 10;
            toplam += basamak;
            yeniSayi /= 10;
        }
        System.out.println("Basamaklar toplamı: " + toplam);
    }
}
