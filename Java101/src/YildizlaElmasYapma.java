import java.util.Scanner;

public class YildizlaElmasYapma {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int sayi = k.nextInt();

        for (int i = 0; i <= sayi ; i++) {//üst taraf
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * i + 1); m++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = (sayi - 1); i >= 0; i--) { //alt taraf
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * i + 1); m++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
