import java.util.Scanner;

    public class MukemmelSayi{
        public static void main(String[] argh) {
            int say=0;
            Scanner k = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int sayi=k.nextInt();

            for (int i=1;i<sayi;i++){
                if(sayi%i==0) say+=i;
            }
            if(say==sayi) System.out.println(sayi+" Mükemmel sayidir");
            else System.out.println(sayi+" Mükemmel sayi degildir.");
            }
        }
