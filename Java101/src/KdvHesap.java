import java.util.Scanner;
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
// tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
public class KdvHesap {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Fiyat blgisini giriniz: ");
        int fiyat=k.nextInt();

        if(0<fiyat && fiyat<=1000) {
            double kdvliFiyat = fiyat + fiyat * 0.18;
            System.out.println("KDV eklenmiş fiyat: " + kdvliFiyat);
        }
        else if (fiyat>1000)  {
            double kdvliFiyat = fiyat + fiyat * 0.08;
            System.out.println("KDV eklenmiş fiyat: " + kdvliFiyat);
        }
    }
}


