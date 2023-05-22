import java.util.Scanner;
//"Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
public class UcakBileti {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        double km = k.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int yas = k.nextInt();

        double fiyat = km * 0.10;
        double yeniFiyat = 0.0;
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int sec = k.nextInt();
        switch (sec) {
            case 1:
                if (yas < 12) {
                    yeniFiyat = (fiyat * 0.5);
                    System.out.print("İndirimli Tutar: " + yeniFiyat);
                } else if (yas > 12 && yas < 24) {
                    yeniFiyat = (fiyat-(fiyat * 0.10));
                    System.out.print("İndirimli Tutar: " + yeniFiyat);
                } else if (yas > 65) {
                    yeniFiyat = (fiyat * 0.30);
                    System.out.print("İndirimli Tutar: " + yeniFiyat);
                }
                break;
            case 2:
                if (yas < 12) {
                    yeniFiyat = (fiyat * 0.5);
                    System.out.print("Toplam Tutar: " + ((fiyat-yeniFiyat)-(fiyat-yeniFiyat)*0.20)*2);
                } else if (yas > 12 && yas < 24) {
                    yeniFiyat = (fiyat * 0.10);
                    System.out.print("Toplam Tutar: " + ((fiyat-yeniFiyat)-(fiyat-yeniFiyat)*0.20)*2);
                } else if (yas > 65) {
                    yeniFiyat = (fiyat * 0.30);
                    System.out.print("Toplam Tutar: " + ((fiyat-yeniFiyat)-(fiyat-yeniFiyat)*0.20)*2);
                }
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}