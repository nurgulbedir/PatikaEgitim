import java.util.Scanner;

public class Taksimetre {
   // Taksimetre KM başına 2.20 TL tutmaktadır.
   // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
   //Taksimetre açılış ücreti 10 TL'dir.
   public static void main(String[] args) {
       Scanner k=new Scanner(System.in);

       System.out.println("Kaç kilometre gidildi?");
       int km=k.nextInt();
       double odenecekTutar=10+(km*2.20);
       System.out.println(odenecekTutar >20 ? "Ödenecek ücret "+odenecekTutar+" TL": "Ödenecek ücret 20 TL");
   }
}
