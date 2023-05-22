import java.util.Scanner;
// 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
public class AsalSayi {
    public static void main(String[] args) {

            for (int i = 2; i <= 100; i++) {
                int bolen = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) bolen++;
                }
                if (bolen <= 2) {
                    System.out.print(i+" ");
                }
            }
        }
    }



