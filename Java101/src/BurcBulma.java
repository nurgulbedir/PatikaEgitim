import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        int ay=k.nextInt();

        System.out.print("Doğduğunuz gün: ");
        int gun= k.nextInt();

        if(gun>=1 && gun<=31) {
            if (ay == 1)
                System.out.println(gun < 22 ? "Oğlak Burcu" : "Kova Burcu");
            else if (ay == 2)
                System.out.println(gun < 20 ? "Kova Burcu" : "Balık Burcu");
            else if (ay == 3)
                System.out.println(gun < 21 ? "Balık Burcu" : "Koç Burcu");
            else if (ay == 4)
                System.out.println(gun < 21 ? "Koç Burcu" : "Boğa Burcu");
            else if (ay == 5)
                System.out.println(gun < 22 ? "Boğa Burcu" : "İkizler Burcu");
            else if (ay == 6)
                System.out.println(gun < 23 ? "İkizler Burcu" : "Yengeç Burcu");
            else if (ay == 7)
                System.out.println(gun < 23 ? "Yengeç Burcu" : "Aslan Burcu");
            else if (ay == 8)
                System.out.println(gun < 23 ? "Aslan Burcu" : "Başak Burcu");
            else if (ay == 9)
                System.out.println(gun < 23 ? "Başak Burcu" : "Terazi Burcu");
            else if (ay == 10)
                System.out.println(gun < 23 ? " Terazi Burcu" : "Akrep Burcu");
            else if (ay == 11)
                System.out.println(gun < 23 ? "Akrep Burcu" : "Yay Burcu");
            else if (ay == 12)
                System.out.println(gun < 23 ? "Yay Burcu" : "Oğlak Burcu");
        }
        else System.out.println("Hatalı gün girdiniz");
    }
}
