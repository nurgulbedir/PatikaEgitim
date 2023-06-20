import java.util.Scanner;

public class RecursiveAsal {
    static int asalMi(int sayi,int i){
        if (i==1) return 1;
        else {
            if (sayi%i==0) {
                return 0;
            }
            else return asalMi(sayi,i-1);
        }
    }
    public static void main(String[] args) {
        int sayi, asalMi ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi= scanner.nextInt();

        asalMi=asalMi(sayi,sayi/2);

        if (asalMi==1) System.out.println(sayi +" sayısı ASALDIR. ");

        else System.out.println(sayi +" sayısı ASAL değildir.");
    }
}
