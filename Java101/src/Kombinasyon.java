import java.util.Scanner;
//C(n,r) = n! / (r! * (n-r)!)
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n,r,toplam1=1,toplam2=1,toplam3=1,sonuc=0;
        System.out.print("n giriniz: ");
        n = k.nextInt();
        System.out.print("r giriniz: ");
        r = k.nextInt();

        for (int i=1;i<=n;i++ )
            toplam1=toplam1*i;
        for (int j=1;j<=r;j++ )
            toplam2=toplam2*j;
        for (int m=1;m<=(n-r);m++ )
            toplam3=toplam3*m;

        sonuc=toplam1/(toplam2*toplam3);
        System.out.println("C("+n+","+r+")="+sonuc);
    }
}
