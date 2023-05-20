import java.util.Scanner;
//Girilen sayının harmonik serisini bulan program Örn: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ...
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double sonuc=0.0;
        System.out.print("Sayı giriniz: ");
        int sayi=k.nextInt();

        for(double i=1; i<=sayi; i++){
            sonuc+= (1/i);
        }
        System.out.println("Harmonik Seri sonuc: "+sonuc);
    }
}
