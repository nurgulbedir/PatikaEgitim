import java.util.Scanner;

public class NotOrtalamasi {
        public static void main(String[] args) {
            Scanner k = new Scanner(System.in);


            System.out.println("Matematik notunuzu giriniz: ");
            int mat = k.nextInt();

            System.out.println("Fizik notunuzu giriniz: " );
            int fizik = k.nextInt();

            System.out.println("Kimya notunuzu giriniz: " );
            int kimya = k.nextInt();

            System.out.println("Türkçe notunuzu giriniz: " );
            int turkce=k.nextInt();

            System.out.println("Tarih notunuzu giriniz: " );
            int tarih=k.nextInt();

            System.out.println("Müzik notunuzu giriniz: " );
            int muzik=k.nextInt();

            int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
            double ort=toplam/6;

            System.out.println(ort >60 ? "Geçti": "Kaldı");
        }
    }


