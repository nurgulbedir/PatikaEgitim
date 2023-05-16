import java.util.Scanner;

public class VucutKitleIndeksi {
    //Kilo (kg) / Boy(m) * Boy(m)
    public static void main(String[] args) {
     Scanner k=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz: ");
        double boy=k.nextDouble();
        System.out.println("Kilo giriniz: ");
        double kilo=k.nextDouble();

        double boySon=boy/100; //165 cm girilen boyu 1.65 şeklinde metre cinsine çevirdik
        double indeks= kilo / (boySon*boySon);
        System.out.println("Vücut kitle indeksi: "+indeks);

    }
}
