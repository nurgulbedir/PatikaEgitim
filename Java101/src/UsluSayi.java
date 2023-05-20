import java.util.Scanner;
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
// programı "For Döngüsü" kullanarak yapınız.
public class UsluSayi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int us,taban,sonuc=1;
        System.out.print("Üs için sayı giriniz: ");
        us = k.nextInt();
        System.out.print("Taban için sayı giriniz: ");
        taban = k.nextInt();
        for (int i=1; i<=taban; i++){
            sonuc*=us;
        }
        System.out.println("Sonuc: "+sonuc);
    }
}
