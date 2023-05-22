import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        String isim = k.nextLine();

        System.out.print("Şifreniz: ");
        String sifre = k.nextLine();

        if (isim.equals("nurgül") && sifre.equals("bed123"))
            System.out.println("Giriş yaptınız :D");
        else
            System.out.println("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (1-Evet  2-Hayır):");
        int sec = k.nextInt();
        k.nextLine();

        switch (sec) {
                case 1:
                    System.out.print("Kullanıcı adınız: ");
                    String is = k.nextLine();

                    System.out.print("Şifreniz: ");
                    String si = k.nextLine();
                    if (is.equals("nurgul") && si.equals("bed123"))
                    System.out.println("Giriş yaptınız :D");
                    else System.out.println("Maalesef, yine şifre yanlış !");
                    break;
                case 2:
                    System.out.println("Görüşmek dileğiyle" );
                    break;
                default:
                    System.out.println("Hatalı 1 ya da 2'yi tuşlayın");
        }
    }
}


