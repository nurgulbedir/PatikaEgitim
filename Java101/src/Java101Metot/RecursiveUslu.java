import java.util.Scanner;

public class RecursiveUslu {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int taban = k.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us = k.nextInt();
        int sonuc = usAlma(taban, us);
        System.out.println("Sonuc: "+sonuc);
        }
    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us > 0) {
            return taban * usAlma(taban, us - 1);
        } else {
            return 1 / (taban * usAlma(taban, -us - 1));
        }
    }
}