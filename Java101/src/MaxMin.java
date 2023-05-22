import java.util.Scanner;
//Klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
public class MaxMin {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int kacSayi = k.nextInt();
        int enb = Integer.MIN_VALUE;
        int enk = Integer.MAX_VALUE;

        for (int i = 1; i <= kacSayi; i++) {
            System.out.print(i + ".sayıyı giriniz = ");
            sayi = k.nextInt();

            if (sayi > enb) enb = sayi;
            else if (sayi < enk) enk = sayi;
            }
        System.out.println("En büyük sayı: " + enb);
        System.out.println("En kücük sayı: " + enk);

    }
}

