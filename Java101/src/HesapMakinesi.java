import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int n1 = k.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        int n2 = k.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Hangi işlemi yapmak istersiniz numarasını giriniz: ");
        int sec = k.nextInt();
        switch (sec) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bölme işlemi için ikinci sayı sıfır olamaz.");
                } else {
                    System.out.println("Bölüm: " + (n1 / n2));
                    break;
                }
                    default:
                        System.out.println("Hatalı giriş yaptınız");

                }
        }
    }
